package org.om.design.pattern.pubsub;

import java.util.ArrayList;
import java.util.List;

public class ValueChangedNotifer implements ValueChangedListener<EntityResult>
{
	public List<Subscriber<EntityResult>> subscribers;
	
	public ValueChangedNotifer()
	{
		subscribers = new ArrayList<Subscriber<EntityResult>>();
	}
	
	public void valueChanged(EntityResult data)
	{
		synchronized (subscribers) 
		{
			for (Subscriber<EntityResult> subscriber : subscribers)
			{
				subscriber.notify(data);
			}
		}
	}
	
	public void addSubscribers(Subscriber<EntityResult> newSubscriber)
	{
		synchronized (subscribers) 
		{
			subscribers.add(newSubscriber);
		}
	}
}
