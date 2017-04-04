package by.htp.task_oop.taxi_builder;

import by.htp.task_oop.bean.TaxiCar;

public abstract class TaxiCarBuilder {

	protected TaxiCar taxiCar;

	public TaxiCar getTaxiCar() {
		return taxiCar;
	}

	public void createNewTaxiCar() {
		taxiCar = new TaxiCar();
	}

	public abstract void buildFuelType();

	public abstract void buildDriveType();

	public abstract void buildEngineDisplacement();

	public abstract void buildMaxSpeed();

	public abstract void buildFuelConsumption();

	public abstract void buildTransmission();

	public abstract void buildBodyType();

	public abstract void buildYearOfManufacture();

	public abstract void buildBrand();

	public abstract void buildModel();

	public abstract void buildNumberOfSeats();

	public abstract void buildNumberOfAirbags();

	public abstract void buildPrice();

}
