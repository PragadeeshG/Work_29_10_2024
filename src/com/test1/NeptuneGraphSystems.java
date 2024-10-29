package com.test1;

public class NeptuneGraphSystems {
	private long dataNeptuneId;
	private long rdfGraphs;
	private String networkIsolation;
	private String standardResourceDescription;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public NeptuneGraphSystems() {

	}

	public NeptuneGraphSystems(long dataNeptuneId, long rdfGraphs, String networkIsolation,
			String standardResourceDescription, String creationDate, String modifiedDate, String entityState) {
		super();
		this.dataNeptuneId = dataNeptuneId;
		this.rdfGraphs = rdfGraphs;
		this.networkIsolation = networkIsolation;
		this.standardResourceDescription = standardResourceDescription;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public long getDataNeptuneId() {
		return dataNeptuneId;
	}

	public void setDataNeptuneId(long dataNeptuneId) {
		this.dataNeptuneId = dataNeptuneId;
	}

	public long getRdfGraphs() {
		return rdfGraphs;
	}

	public void setRdfGraphs(long rdfGraphs) {
		this.rdfGraphs = rdfGraphs;
	}

	public String getNetworkIsolation() {
		return networkIsolation;
	}

	public void setNetworkIsolation(String networkIsolation) {
		this.networkIsolation = networkIsolation;
	}

	public String getStandardResourceDescription() {
		return standardResourceDescription;
	}

	public void setStandardResourceDescription(String standardResourceDescription) {
		this.standardResourceDescription = standardResourceDescription;
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
