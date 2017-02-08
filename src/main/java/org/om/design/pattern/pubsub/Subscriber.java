package org.om.design.pattern.pubsub;

public interface Subscriber<T> 
{
	void notify(final T entity);
}
