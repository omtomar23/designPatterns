package org.om.design.pattern.pubsub;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommunicationPortal 
{
	private Map<Topic, List<Publisher<EntityResult>>> topicVsPublishers;
	private Map<Topic, ValueChangedListener<EntityResult>> topicVsListeners;
	private static CommunicationPortal communicationPortal = new CommunicationPortal();
	
	private CommunicationPortal()
	{
		topicVsPublishers = new HashMap<Topic, List<Publisher<EntityResult>>>();
		topicVsListeners = new HashMap<Topic, ValueChangedListener<EntityResult>>();
	}
	
	static CommunicationPortal createCommunicationPortal()
	{
		return communicationPortal;
	}
	
	public void addSubcriber(Topic topic, Subscriber<EntityResult> subscriber)
	{
		addSubscripberListener(topic, subscriber);
	}
	
	public Publisher<EntityResult> createPublisher(Topic topic)
	{
		EntityPublisherManager publisherImpl = new EntityPublisherManager();
		publisherImpl.addValueChangedListener(topicVsListeners.get(topic));
		
		addEntityPublishe(topic, publisherImpl);
		return publisherImpl;
	}
	
	private void addSubscripberListener(Topic topic,  Subscriber<EntityResult> newSubscriber)
	{
		ValueChangedListener<EntityResult> listener = topicVsListeners.get(topic);
		if(listener == null)
		{
			listener = new ValueChangedNotifer();
			topicVsListeners.put(topic, listener);
		}
		
		((ValueChangedNotifer)listener).addSubscribers(newSubscriber);
		
		if(topicVsPublishers.get(topic) != null)
		{
			for (Publisher<EntityResult> publisher : topicVsPublishers.get(topic)) 
			{
				((EntityPublisherManager)publisher).addValueChangedListener(listener);
			}
		}
	}

	private void addEntityPublishe(Topic topic, Publisher<EntityResult> publisher)
	{
		List<Publisher<EntityResult>> publishers = topicVsPublishers.get(topic);
		if(publishers == null)
		{
			publishers = new ArrayList<Publisher<EntityResult>>();
			topicVsPublishers.put(topic, publishers);
		}
		publishers.add(publisher);
		
	}
}
