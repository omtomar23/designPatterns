package org.om.design.pattern.observer.api;

import java.util.HashSet;
import java.util.Set;

import org.om.design.pattern.observer.Observer;

class AirPollutionDataProviderImpl implements AirPollutionDataProvider
{
	private final Set<Observer> observers;
	private PollutionSensor pollutionSensor;

	AirPollutionDataProviderImpl()
	{
		//TODO: REMOVE DEPENDENCY
		this.pollutionSensor = new PollutionSensor(this);
		observers = new HashSet<Observer>();
		//TODO
		this.pollutionSensor.start();
	}
	
	public void register(Observer observer) 
	{
		observers.add(observer);
	}

	public void unregister(Observer observer) 
	{
		observers.remove(observer);
	}

	public AirQuality getAirQualityData() 
	{
		return pollutionSensor.getLatestValue();
	}

	public void valueChanged()
	{
		for (Observer observer : observers) 
		{
			observer.valueChanged();
		}
	}
}
