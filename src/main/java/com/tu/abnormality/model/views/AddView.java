package com.tu.abnormality.model.views;

import javax.validation.constraints.NotEmpty;


public class AddView {
	private Integer age;
	private String breast;
	private String breastPosition;
	private String breastPositionDescription;
	private String breastGlandularity;
	private String breastGlandularityDescription;

	private Float breastThickness;
	private Float size;
	private String screenDetected;
	private String palpable;

	@NotEmpty(message = "The cancer type cannot be null")
	private String cancerType;
	private String cancerTypeDescription;
	private String shape;
	private String shapeDescription;
	private String modality;
	private String geneticScore;
	private String malignancyScore;
	private String vendor;
	private byte image;

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getBreast() {
		return breast;
	}

	public void setBreast(String breast) {
		this.breast = breast;
	}

	public String getBreastPosition() {
		return breastPosition;
	}

	public void setBreastPosition(String breastPosition) {
		this.breastPosition = breastPosition;
	}

	public String getBreastPositionDescription() {
		return breastPositionDescription;
	}

	public void setBreastPositionDescription(String breastPositionDescription) {
		this.breastPositionDescription = breastPositionDescription;
	}

	public String getBreastGlandularity() {
		return breastGlandularity;
	}

	public void setBreastGlandularity(String breastGlandularity) {
		this.breastGlandularity = breastGlandularity;
	}

	public String getBreastGlandularityDescription() {
		return breastGlandularityDescription;
	}

	public void setBreastGlandularityDescription(String breastGlandularityDescription) {
		this.breastGlandularityDescription = breastGlandularityDescription;
	}

	public Float getBreastThickness() {
		return breastThickness;
	}

	public void setBreastThickness(Float breastThickness) {
		this.breastThickness = breastThickness;
	}

	public Float getSize() {
		return size;
	}

	public void setSize(Float size) {
		this.size = size;
	}

	public String getScreenDetected() {
		return screenDetected;
	}

	public void setScreenDetected(String screenDetected) {
		this.screenDetected = screenDetected;
	}

	public String getPalpable() {
		return palpable;
	}

	public void setPalpable(String palpable) {
		this.palpable = palpable;
	}

	public String getCancerType() {
		return cancerType;
	}

	public void setCancerType(String cancerType) {
		this.cancerType = cancerType;
	}

	public String getCancerTypeDescription() {
		return cancerTypeDescription;
	}

	public void setCancerTypeDescription(String cancerTypeDescription) {
		this.cancerTypeDescription = cancerTypeDescription;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String getShapeDescription() {
		return shapeDescription;
	}

	public void setShapeDescription(String shapeDescription) {
		this.shapeDescription = shapeDescription;
	}

	public String getModality() {
		return modality;
	}

	public void setModality(String modality) {
		this.modality = modality;
	}

	public String getGeneticScore() {
		return geneticScore;
	}

	public void setGeneticScore(String geneticScore) {
		this.geneticScore = geneticScore;
	}

	public String getMalignancyScore() {
		return malignancyScore;
	}

	public void setMalignancyScore(String malignancyScore) {
		this.malignancyScore = malignancyScore;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public byte getImage() {
		return image;
	}

	public void setImage(byte image) {
		this.image = image;
	}

}