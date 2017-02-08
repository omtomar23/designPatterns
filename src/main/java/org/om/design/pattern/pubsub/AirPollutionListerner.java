package org.om.design.pattern.pubsub;

public class AirPollutionListerner 
{
	private String client;
	public AirPollutionListerner(String client)
	{
		this.client = client;
		CommunicationPortal.createCommunicationPortal().
		addSubcriber(Topic.AIR_POLLUTION, new TempratureSubcriber());
	}
	
	class TempratureSubcriber implements Subscriber<EntityResult>
	{
		public void notify(EntityResult entity) 
		{
			System.out.println("client="+ client + " ,"+entity);
		}
	}
}
