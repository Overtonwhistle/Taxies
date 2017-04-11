package by.htp.task_oop.bean;

import by.htp.task_oop.bean.Param.BodyType;
import by.htp.task_oop.bean.Param.Transmission;

public class TaxiCar extends Car implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private String brand;
	private String model;

	private Transmission transmission;
	private BodyType bodyType;

	private int yearOfManufacture;
	private int numberOfSeats;
	private int numberOfAirbags;

	private Double priсe;

	public TaxiCar() {
		super();
	}

	public Transmission getTransmission() {
		return transmission;
	}

	public void setTransmission(Transmission transmission) {
		this.transmission = transmission;
	}

	public BodyType getBodyType() {
		return bodyType;
	}

	public void setBodyType(BodyType bodyType) {
		this.bodyType = bodyType;
	}

	public int getYearOfManufacture() {
		return yearOfManufacture;
	}

	public void setYearOfManufacture(int yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public int getNumberOfAirbags() {
		return numberOfAirbags;
	}

	public void setNumberOfAirbags(int numberOfAirbags) {
		this.numberOfAirbags = numberOfAirbags;
	}

	public Double getPriсe() {
		return priсe;
	}

	public void setPriсe(Double priсe) {
		this.priсe = priсe;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + numberOfSeats;
		result = prime * result + ((bodyType == null) ? 0 : bodyType.hashCode());
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + numberOfAirbags;
		result = prime * result + ((priсe == null) ? 0 : priсe.hashCode());
		result = prime * result + ((transmission == null) ? 0 : transmission.hashCode());
		result = prime * result + yearOfManufacture;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		TaxiCar other = (TaxiCar) obj;
		if (numberOfSeats != other.numberOfSeats)
			return false;
		if (bodyType != other.bodyType)
			return false;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (numberOfAirbags != other.numberOfAirbags)
			return false;
		if (priсe == null) {
			if (other.priсe != null)
				return false;
		} else if (!priсe.equals(other.priсe))
			return false;
		if (transmission != other.transmission)
			return false;
		if (yearOfManufacture != other.yearOfManufacture)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return super.toString() + ", transmission=" + transmission + ", bodyType=" + bodyType + ", yearOfManufacture="
				+ yearOfManufacture + ", brand=" + brand + ", model=" + model + ", numberOfSeats=" + numberOfSeats
				+ ", numberOfAirbags=" + numberOfAirbags + ", priсe=" + priсe + "]";
	}

}