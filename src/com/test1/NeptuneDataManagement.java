package com.test1;

public class NeptuneDataManagement {
	private long systemCode;
	private String replicaDatabase;
	private String replicaSchema;
	private String replicaAvailability;
	private String fullyManaged;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public NeptuneDataManagement() {

	}

	public NeptuneDataManagement(long systemCode, String replicaDatabase, String replicaSchema,
			String replicaAvailability, String fullyManaged, String creationDate, String modifiedDate,
			String entityState) {
		super();
		this.systemCode = systemCode;
		this.replicaDatabase = replicaDatabase;
		this.replicaSchema = replicaSchema;
		this.replicaAvailability = replicaAvailability;
		this.fullyManaged = fullyManaged;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public long getSystemCode() {
		return systemCode;
	}

	public void setSystemCode(long systemCode) {
		this.systemCode = systemCode;
	}

	public String getReplicaDatabase() {
		return replicaDatabase;
	}

	public void setReplicaDatabase(String replicaDatabase) {
		this.replicaDatabase = replicaDatabase;
	}

	public String getReplicaSchema() {
		return replicaSchema;
	}

	public void setReplicaSchema(String replicaSchema) {
		this.replicaSchema = replicaSchema;
	}

	public String getReplicaAvailability() {
		return replicaAvailability;
	}

	public void setReplicaAvailability(String replicaAvailability) {
		this.replicaAvailability = replicaAvailability;
	}

	public String getFullyManaged() {
		return fullyManaged;
	}

	public void setFullyManaged(String fullyManaged) {
		this.fullyManaged = fullyManaged;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
