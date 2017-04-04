package by.htp.task_oop.taxi_builder;

import by.htp.task_oop.bean.Params.*;

public class SubaruTaxiBuilder extends TaxiCarBuilder {

	@Override
	public void buildFuelType() {
		taxiCar.setFuelType(Fuel.Petrol);

	}

	@Override
	public void buildDriveType() {
		taxiCar.setDriveType(Drive.AllWheelDrive);

	}

	@Override
	public void buildEngineDisplacement() {
		taxiCar.setEngineDisplacement(3.400);
	}

	@Override
	public void buildMaxSpeed() {
		taxiCar.setMaxSpeed(220);
	}

	@Override
	public void buildFuelConsumption() {
		taxiCar.setFuelConsumption(12.9);

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
		taxiCar.setYearOfManufacture(1998);

	}

	@Override
	public void buildBrand() {
		taxiCar.setBrand("Subaru");
	}
	
	@Override
	public void buildModel() {
		taxiCar.setModel("Impreza");
	}

	@Override
	public void buildNumberOfSeats() {
		taxiCar.setNumberOfSeats(4);
	}

	@Override
	public void buildNumberOfAirbags() {
		taxiCar.setNumberOfAirbags(6);
	}

	@Override
	public void buildPrice() {
		taxiCar.setPriсe(27000.0);
	}


}
