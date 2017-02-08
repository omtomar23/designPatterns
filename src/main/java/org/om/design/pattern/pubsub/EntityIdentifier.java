package org.om.design.pattern.pubsub;

public class EntityIdentifier
{
	public static final String TYPE_FILTER = "type";
	private String entityType;
	private String subscriptionFilter = TYPE_FILTER;
	
	public EntityIdentifier(String entityType)
    {
        this.entityType = entityType;
    }

	public static String getTypeFilter() {
		return TYPE_FILTER;
	}

	public String getEntityType() {
		return entityType;
	}

	public String getSubscriptionFilter() {
		return subscriptionFilter;
	}
	@Override
	public int hashCode() 
	{
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((entityType == null) ? 0 : entityType.hashCode());
		result = prime
				* result
				+ ((subscriptionFilter == null) ? 0 : subscriptionFilter
						.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EntityIdentifier other = (EntityIdentifier) obj;
		if (entityType == null) {
			if (other.entityType != null)
				return false;
		} else if (!entityType.equals(other.entityType))
			return false;
		if (subscriptionFilter == null) {
			if (other.subscriptionFilter != null)
				return false;
		} else if (!subscriptionFilter.equals(other.subscriptionFilter))
			return false;
		return true;
	}

    public boolean matches(EntityIdentifier testIdentifier)
    {
        if (equals(testIdentifier))
            return true;
        
        return this.subscriptionFilter == TYPE_FILTER && this.entityType.equals(testIdentifier.getEntityType());
    }
    
	@Override
	public String toString() {
		return "EntityIdentifier [entityType=" + entityType
				+ ", subscriptionFilter=" + subscriptionFilter + "]";
	}
	
	
}
