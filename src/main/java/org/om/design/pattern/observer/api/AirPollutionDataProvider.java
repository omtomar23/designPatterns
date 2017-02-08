package org.om.design.pattern.observer.api;

import org.om.design.pattern.observer.Observer;

public interface AirPollutionDataProvider
{
	void register(Observer observer);
	void unregister(Observer observer);
	AirQuality getAirQualityData();
}
