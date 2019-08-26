package com.tu.abnormality.model.entities;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "abnormality")
@Component
public class Abnormality {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Integer age;
	private String breast;

	@ManyToOne
	@JoinColumn(name = "breast_position_id")
	private BreastPosition breastPosition;
	private String breastPositionDescription;

	@ManyToOne
	@JoinColumn(name = "breast_glandularity_id")
	private BreastGlandularity breastGlandularity;
	private String breastGlandularityDescription;

	private Float breastThickness;
	private Float size;
	private String screenDetected;
	private String palpable;

	@ManyToOne
	@JoinColumn(name = "cancer_type_id")
	private CancerType cancerType;
	private String cancerTypeDescription;

	@ManyToOne
	@JoinColumn(name = "shape_id")
	private Shape shape;
	private String shapeDescription;

	@ManyToOne
	@JoinColumn(name = "modality_id")
	private Modality modality;

	@ManyToOne
	@JoinColumn(name = "genetic_score_id")
	private GeneticScore geneticScore;

	@ManyToOne
	@JoinColumn(name = "malignancy_score_id")
	private MalignancyScore malignancyScore;

	@ManyToOne
	@JoinColumn(name = "vendor_id")
	private Vendor vendor;

	@Lob
	private byte[] image;

	public Abnormality() {

	}

	public Abnormality(Abnormality abnormality) {
		this.age = abnormality.age;
		this.breast = abnormality.breast;
		this.breastPosition = abnormality.getBreastPosition();
		this.breastPositionDescription = abnormality.breastPositionDescription;
		this.breastGlandularity = abnormality.getBreastGlandularity();
		this.breastGlandularityDescription = abnormality.breastGlandularityDescription;
		this.breastThickness = abnormality.getBreastThickness();
		this.size = abnormality.size;
		this.screenDetected = abnormality.screenDetected;
		this.palpable = abnormality.palpable;
		this.cancerType = abnormality.getCancerType();
		this.cancerTypeDescription = abnormality.cancerTypeDescription;
		this.shape = abnormality.getShape();
		this.shapeDescription = abnormality.shapeDescription;
		this.modality = abnormality.getModality();
		this.geneticScore = abnormality.getGeneticScore();
		this.malignancyScore = abnormality.getMalignancyScore();
		this.vendor = abnormality.getVendor();
		this.image = abnormality.image;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public BreastPosition getBreastPosition() {
		return breastPosition;
	}

	public void setBreastPosition(BreastPosition breastPosition) {
		this.breastPosition = breastPosition;
	}

	public String getBreastPositionDescription() {
		return breastPositionDescription;
	}

	public void setBreastPositionDescription(String breastPositionDescription) {
		this.breastPositionDescription = breastPositionDescription;
	}

	public BreastGlandularity getBreastGlandularity() {
		return breastGlandularity;
	}

	public void setBreastGlandularity(BreastGlandularity breastGlandularity) {
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

	public CancerType getCancerType() {
		return cancerType;
	}

	public void setCancerType(CancerType cancerType) {
		this.cancerType = cancerType;
	}

	public String getCancerTypeDescription() {
		return cancerTypeDescription;
	}

	public void setCancerTypeDescription(String cancerTypeDescription) {
		this.cancerTypeDescription = cancerTypeDescription;
	}

	public Shape getShape() {
		return shape;
	}

	public void setShape(Shape shape) {
		this.shape = shape;
	}

	public String getShapeDescription() {
		return shapeDescription;
	}

	public void setShapeDescription(String shapeDescription) {
		this.shapeDescription = shapeDescription;
	}

	public Modality getModality() {
		return modality;
	}

	public void setModality(Modality modality) {
		this.modality = modality;
	}

	public GeneticScore getGeneticScore() {
		return geneticScore;
	}

	public void setGeneticScore(GeneticScore geneticScore) {
		this.geneticScore = geneticScore;
	}

	public MalignancyScore getMalignancyScore() {
		return malignancyScore;
	}

	public void setMalignancyScore(MalignancyScore malignancyScore) {
		this.malignancyScore = malignancyScore;
	}

	public Vendor getVendor() {
		return vendor;
	}

	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	@Override
	public boolean equals(Object o) {

		if (o == null) {
			return false;
		}
		if (!(o instanceof Abnormality)) {
			return false;
		}
		final Abnormality anotherObject = (Abnormality) o;
		if (!(this.age.equals(anotherObject.age) && this.breast.equals(anotherObject.breast)
				&& this.breastPosition.equals(anotherObject.breastPosition)
				&& this.breastPositionDescription.equals(anotherObject.breastPositionDescription)
				&& this.breastGlandularity.equals(anotherObject.breastGlandularity)
				&& this.breastGlandularityDescription.equals(anotherObject.breastGlandularityDescription)
				&& this.breastThickness.equals(anotherObject.breastThickness) && this.size.equals(anotherObject.size)
				&& this.screenDetected.equals(anotherObject.screenDetected)
				&& this.palpable.equals(anotherObject.palpable) && this.cancerType.equals(anotherObject.cancerType)
				&& this.cancerTypeDescription.equals(anotherObject.cancerTypeDescription)
				&& this.shape.equals(anotherObject.shape)
				&& this.shapeDescription.equals(anotherObject.shapeDescription)
				&& this.modality.equals(anotherObject.modality) && this.geneticScore.equals(anotherObject.geneticScore)
				&& this.malignancyScore.equals(anotherObject.malignancyScore)
				&& this.vendor.equals(anotherObject.vendor))) {
			return false;
		}
		return true;

	}

	@Override
	public int hashCode() {
		return Objects.hash(age, breast, breastPosition, breastPositionDescription, breastGlandularity,
				breastGlandularityDescription, breastThickness, size, screenDetected, palpable, cancerType,
				cancerTypeDescription, shape, shapeDescription, modality, geneticScore, malignancyScore, vendor);
	}

}
