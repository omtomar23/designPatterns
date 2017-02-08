package org.om.design.pattern.pubsub;

public class TempratureListener 
{
	private String client;
	public TempratureListener(String client)
	{
		this.client = client;
		CommunicationPortal.createCommunicationPortal().
		addSubcriber(Topic.TEMPRATURE, new TempratureSubcriber());
	}
	class TempratureSubcriber implements Subscriber<EntityResult>
	{
		public void notify(EntityResult entity) 
		{
			System.out.println("client="+ client + " ,"+entity);
		}
	}
}
