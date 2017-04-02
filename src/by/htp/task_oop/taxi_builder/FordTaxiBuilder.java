package by.htp.task_oop.taxi_builder;

import by.htp.task_oop.bean.Params.*;

public class FordTaxiBuilder extends TaxiCarBuilder {

	@Override
	public void buildFuelType() {
		taxiCar.setFuelType(Fuel.Petrol);

	}

	@Override
	public void buildDriveType() {
		taxiCar.setDriveType(Drive.FrontDrive);

	}

	@Override
	public void buildEngineDisplacement() {
		taxiCar.setEngineDisplacement(2000);
	}

	@Override
	public void buildMaxSpeed() {
		taxiCar.setMaxSpeed(190);
	}

	@Override
	public void buildFuelConsumption() {
		taxiCar.setFuelConsumption(10.8);

	}

	@Override
	public void buildTransmission() {
		taxiCar.setTransmission(Transmission.Manual);

	}

	@Override
	public void buildBodyType() {
		taxiCar.setBodyType(BodyType.Sedan);

	}

	@Override
	public void buildYearOfManufacture() {
		taxiCar.setYearOfManufacture(2013);

	}

	@Override
	public void buildBrand() {
		taxiCar.setBrand("Ford");
	}
	
	@Override
	public void buildModel() {
		taxiCar.setModel("Focus");
	}

	@Override
	public void buildNumberOfSeats() {
		taxiCar.setNumberOfSeats(4);
	}

	@Override
	public void buildNumberOfAirbags() {
		taxiCar.setNumberOfAirbags(2);
	}

	@Override
	public void buildPrice() {
		taxiCar.setPriсe(17000.0);
	}


}
