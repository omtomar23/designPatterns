package org.om.design.pattern.pubsub;

public class EntityPublisherManager implements Publisher<EntityResult>
{
	private ValueChangedListener<EntityResult> listener;
	
	public EntityPublisherManager()
	{
	}
	
	public void publish(EntityResult data)
	{
		if(listener != null)
		{
			listener.valueChanged(data);
		}
	}
	
	public void addValueChangedListener(ValueChangedListener<EntityResult> updator)
	{
		this.listener = updator;
	}
}
