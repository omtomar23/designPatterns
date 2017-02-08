package org.om.design.pattern.observer.api;

public final class AirQuality 
{
	public float pm; 
	
	public AirQuality(float pm)
	{
		this.pm = pm;
	}
	
	public void setPm(float pm)
	{
		this.pm = pm;
	}
	
	public float getPm()
	{
		return pm;
	}

	@Override
	public String toString() {
		return "AirQuality [pm=" + pm + "]";
	}
}
