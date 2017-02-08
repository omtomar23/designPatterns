package org.om.design.pattern.pubsub;

public interface Publisher<D>
{
	void publish(D data);
}
