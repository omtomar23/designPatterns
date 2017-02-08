package org.om.design.pattern.observer;

import org.om.design.pattern.observer.api.AirPollutionDataProvider;

public class AirPollutionObserver implements Observer
{
	private AirPollutionDataProvider airPollutionDataProvider;

	public AirPollutionObserver(AirPollutionDataProvider airPollutionDataProvider) 
	{
		this.airPollutionDataProvider = airPollutionDataProvider;
		airPollutionDataProvider.register(this);
	}
	
	public void valueChanged() 
	{
		System.out.println(airPollutionDataProvider.getAirQualityData());
	}
}
