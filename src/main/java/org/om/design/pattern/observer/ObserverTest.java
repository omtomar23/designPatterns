package org.om.design.pattern.observer;

import org.om.design.pattern.observer.api.AirPollutionDataProvider;
import org.om.design.pattern.observer.api.AirPollutionFactory;

public class ObserverTest 
{
	public static void main(String[] args) 
	{
		AirPollutionFactory airPollutionFactory = new AirPollutionFactory();
		AirPollutionDataProvider airPollutionDataProvider = airPollutionFactory.createAirPollutionDataProvider();
		
		new AirPollutionObserver(airPollutionDataProvider);
	}
}
