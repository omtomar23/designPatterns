package org.om.design.pattern.pubsub;


public class TemperatureSensor 
{
	private Publisher<EntityResult> publisher;
	private final Thread thread;
	private volatile boolean SENSOR_STARTED = false;
	public TemperatureSensor()
	{
		thread = new Thread(new TempReader(), "AirPollutionSensor");
		publisher = CommunicationPortal.createCommunicationPortal().createPublisher(Topic.TEMPRATURE);
	}
	class TempReader implements Runnable
	{
		public void run()
		{
			while(SENSOR_STARTED)
			{
				asleep(500);
				publisher.publish(new EntityResult("A", new EntityIdentifier(Topic.TEMPRATURE.name()), null));
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
