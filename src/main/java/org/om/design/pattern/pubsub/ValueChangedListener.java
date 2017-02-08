package org.om.design.pattern.pubsub;

public interface ValueChangedListener<D>
{
	void valueChanged(D data);
}
