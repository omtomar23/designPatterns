package org.om.design.pattern.pubsub;

public class PubSubTest
{
	public static void main(String[] args) throws InterruptedException 
	{
		AirPollutionSensor airPollutionSensor = new AirPollutionSensor();
		airPollutionSensor.start();
		new AirPollutionListerner("OM");
		
		
		TemperatureSensor temperatureSensor = new TemperatureSensor();
		temperatureSensor.start();
		new TempratureListener("SINGH");
		
		Thread.sleep(2000);
		new AirPollutionListerner("RAM");
		Thread.sleep(500);
		new TempratureListener("SITA");
		Thread.sleep(450);
		new TempratureListener("SS");
		Thread.sleep(467);
		new TempratureListener("QQ");
		Thread.sleep(400);
		new TempratureListener("RR");
	}
}
