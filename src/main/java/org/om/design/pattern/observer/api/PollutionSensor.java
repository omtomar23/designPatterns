package org.om.design.pattern.observer.api;


class PollutionSensor 
{
	private final Thread thread;
	private volatile boolean SENSOR_STARTED = false;
	private AirQuality airQuality;
	private AirPollutionDataProviderImpl callBack;
	
	PollutionSensor(AirPollutionDataProviderImpl callBack)
	{
		this.callBack = callBack;
		thread = new Thread(new PollutionReadingUpadtor(), "Scencer");
		airQuality = new AirQuality(0);
	}
	
	public void start()
	{
		SENSOR_STARTED = true;
		thread.start();
	}
	
    private class PollutionReadingUpadtor implements Runnable
	{
		public void run()
		{
			float pm = 1;
			while(SENSOR_STARTED)
			{
				airQuality.setPm(pm++);
				callBack.valueChanged();
				asleep(500);
			}
		}
	}
	
    public AirQuality getLatestValue()
    {
    	return airQuality;
    }
    
    private void asleep(long millies)
    {
    	try 
		{
			Thread.sleep(500);
		}
    	catch (InterruptedException e) 
    	{
			e.printStackTrace();
		}
    }
    
	public void stop()
	{
		SENSOR_STARTED = false;
		thread.interrupt();
	}
}
