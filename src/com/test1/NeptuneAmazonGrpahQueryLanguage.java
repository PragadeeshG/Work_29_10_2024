package com.test1;

public class NeptuneAmazonGrpahQueryLanguage {
	private long dataNeptuneId;
	private String cypherQueryLanguage;
	private String gremlinQueryLanguage;
	private String sparqlQueryLanguage;
	private String whereComponent;
	private String createFunction;
	private String mergeFunction;
	private String stringAggregation;
	private String csvImportNormal;
	private String csvImportWithCypher;
	private String loadCsvNormal;
	private String loadCsvWithCypher;
	private String startAndSetGoals;
	private String forEachSyntax;

	public NeptuneAmazonGrpahQueryLanguage() {

	}

	public NeptuneAmazonGrpahQueryLanguage(long dataNeptuneId, String cypherQueryLanguage, String gremlinQueryLanguage,
			String sparqlQueryLanguage, String whereComponent, String createFunction, String mergeFunction,
			String stringAggregation, String csvImportNormal, String csvImportWithCypher, String loadCsvNormal,
			String loadCsvWithCypher, String startAndSetGoals, String forEachSyntax) {
		super();
		this.dataNeptuneId = dataNeptuneId;
		this.cypherQueryLanguage = cypherQueryLanguage;
		this.gremlinQueryLanguage = gremlinQueryLanguage;
		this.sparqlQueryLanguage = sparqlQueryLanguage;
		this.whereComponent = whereComponent;
		this.createFunction = createFunction;
		this.mergeFunction = mergeFunction;
		this.stringAggregation = stringAggregation;
		this.csvImportNormal = csvImportNormal;
		this.csvImportWithCypher = csvImportWithCypher;
		this.loadCsvNormal = loadCsvNormal;
		this.loadCsvWithCypher = loadCsvWithCypher;
		this.startAndSetGoals = startAndSetGoals;
		this.forEachSyntax = forEachSyntax;
	}

	public long getDataNeptuneId() {
		return dataNeptuneId;
	}

	public void setDataNeptuneId(long dataNeptuneId) {
		this.dataNeptuneId = dataNeptuneId;
	}

	public String getCypherQueryLanguage() {
		return cypherQueryLanguage;
	}

	public void setCypherQueryLanguage(String cypherQueryLanguage) {
		this.cypherQueryLanguage = cypherQueryLanguage;
	}

	public String getGremlinQueryLanguage() {
		return gremlinQueryLanguage;
	}

	public void setGremlinQueryLanguage(String gremlinQueryLanguage) {
		this.gremlinQueryLanguage = gremlinQueryLanguage;
	}

	public String getSparqlQueryLanguage() {
		return sparqlQueryLanguage;
	}

	public void setSparqlQueryLanguage(String sparqlQueryLanguage) {
		this.sparqlQueryLanguage = sparqlQueryLanguage;
	}

	public String getWhereComponent() {
		return whereComponent;
	}

	public void setWhereComponent(String whereComponent) {
		this.whereComponent = whereComponent;
	}

	public String getCreateFunction() {
		return createFunction;
	}

	public void setCreateFunction(String createFunction) {
		this.createFunction = createFunction;
	}

	public String getMergeFunction() {
		return mergeFunction;
	}

	public void setMergeFunction(String mergeFunction) {
		this.mergeFunction = mergeFunction;
	}

	public String getStringAggregation() {
		return stringAggregation;
	}

	public void setStringAggregation(String stringAggregation) {
		this.stringAggregation = stringAggregation;
	}

	public String getCsvImportNormal() {
		return csvImportNormal;
	}

	public void setCsvImportNormal(String csvImportNormal) {
		this.csvImportNormal = csvImportNormal;
	}

	public String getCsvImportWithCypher() {
		return csvImportWithCypher;
	}

	public void setCsvImportWithCypher(String csvImportWithCypher) {
		this.csvImportWithCypher = csvImportWithCypher;
	}

	public String getLoadCsvNormal() {
		return loadCsvNormal;
	}

	public void setLoadCsvNormal(String loadCsvNormal) {
		this.loadCsvNormal = loadCsvNormal;
	}

	public String getLoadCsvWithCypher() {
		return loadCsvWithCypher;
	}

	public void setLoadCsvWithCypher(String loadCsvWithCypher) {
		this.loadCsvWithCypher = loadCsvWithCypher;
	}

	public String getStartAndSetGoals() {
		return startAndSetGoals;
	}

	public void setStartAndSetGoals(String startAndSetGoals) {
		this.startAndSetGoals = startAndSetGoals;
	}

	public String getForEachSyntax() {
		return forEachSyntax;
	}

	public void setForEachSyntax(String forEachSyntax) {
		this.forEachSyntax = forEachSyntax;
	}

}
