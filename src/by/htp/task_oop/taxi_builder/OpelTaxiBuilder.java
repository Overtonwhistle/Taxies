package by.htp.task_oop.taxi_builder;

import by.htp.task_oop.bean.Params.*;

public class OpelTaxiBuilder extends TaxiCarBuilder {

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
		taxiCar.setEngineDisplacement(1400);
	}

	@Override
	public void buildMaxSpeed() {
		taxiCar.setMaxSpeed(150);
	}

	@Override
	public void buildFuelConsumption() {
		taxiCar.setFuelConsumption(7.6);

	}

	@Override
	public void buildTransmission() {
		taxiCar.setTransmission(Transmission.Manual);

	}

	@Override
	public void buildBodyType() {
		taxiCar.setBodyType(BodyType.Hatchback);

	}

	@Override
	public void buildYearOfManufacture() {
		taxiCar.setYearOfManufacture(2015);

	}

	@Override
	public void buildBrand() {
		taxiCar.setBrand("Opel");
	}
	
	@Override
	public void buildModel() {
		taxiCar.setModel("Corsa D");
		
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
		taxiCar.setPriсe(13000.0);
	}


	
}
