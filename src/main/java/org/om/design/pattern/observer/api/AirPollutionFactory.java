package org.om.design.pattern.observer.api;

public class AirPollutionFactory 
{
	public AirPollutionDataProvider createAirPollutionDataProvider()
	{
		return new AirPollutionDataProviderImpl();
	}
}
