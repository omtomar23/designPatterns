package org.om.design.pattern.pubsub;

public class EntityResult
{
    private String clientId;
	private EntityIdentifier identifier;
	private Identifiable engEntity;

	public EntityResult(String clientId, EntityIdentifier identifier, Identifiable engEntity)
    {
		this.clientId = clientId;
		this.identifier = identifier;
		this.engEntity = engEntity;
    }

	public String getClientId() {
		return clientId;
	}

	public EntityIdentifier getIdentifier() {
		return identifier;
	}

	public Identifiable getEngEntity() {
		return engEntity;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((clientId == null) ? 0 : clientId.hashCode());
		result = prime * result
				+ ((engEntity == null) ? 0 : engEntity.hashCode());
		result = prime * result
				+ ((identifier == null) ? 0 : identifier.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EntityResult other = (EntityResult) obj;
		if (clientId == null) {
			if (other.clientId != null)
				return false;
		} else if (!clientId.equals(other.clientId))
			return false;
		if (engEntity == null) {
			if (other.engEntity != null)
				return false;
		} else if (!engEntity.equals(other.engEntity))
			return false;
		if (identifier == null) {
			if (other.identifier != null)
				return false;
		} else if (!identifier.equals(other.identifier))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "EntityResult [clientId=" + clientId + ", identifier="
				+ identifier + ", engEntity=" + engEntity + "]";
	}
	
	
}
