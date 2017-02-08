package org.om.design.pattern.pubsub;


public class AirPollutionSensor 
{
	private Publisher<EntityResult> publisher;
	private final Thread thread;
	private volatile boolean SENSOR_STARTED = false;
	public AirPollutionSensor()
	{
		thread = new Thread(new AirPollionReader(), "AirPollutionSensor");
		publisher = CommunicationPortal.createCommunicationPortal().createPublisher(Topic.AIR_POLLUTION);
	}
	class AirPollionReader implements Runnable
	{
		public void run()
		{
			while(SENSOR_STARTED)
			{
				asleep(500);
				publisher.publish(new EntityResult("B", new EntityIdentifier(Topic.AIR_POLLUTION.name()), null));
			}
		}
	}
	
	 private void asleep(long millies)
	 {
		 try 
		 {
			 Thread.sleep(millies);
		 }
		 catch (InterruptedException e) 
		 {
			 e.printStackTrace();
		 }
	 }

	public void start() 
	{
		SENSOR_STARTED = true;
		thread.start();
	}
	
	public void stop()
	{
		SENSOR_STARTED = false;
		thread.interrupt();
	}
}
