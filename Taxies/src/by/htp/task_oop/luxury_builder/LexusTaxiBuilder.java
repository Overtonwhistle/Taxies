package by.htp.task_oop.luxury_builder;

import by.htp.task_oop.bean.Params.*;

public class LexusTaxiBuilder extends LuxuryTaxiCarBuilder {

	@Override
	public void buildFuelType() {
		luxuryTaxiCar.setFuelType(Fuel.Diesel);
	}

	@Override
	public void buildDriveType() {

	}

	@Override
	public void buildEngineDisplacement() {
		luxuryTaxiCar.setEngineDisplacement(4100);
	}

	@Override
	public void buildMaxSpeed() {
		luxuryTaxiCar.setMaxSpeed(230);
	}

	@Override
	public void buildFuelConsumption() {
		luxuryTaxiCar.setFuelConsumption(14.4);
	}

	@Override
	public void buildTransmission() {
		luxuryTaxiCar.setTransmission(Transmission.Automatic);
	}

	@Override
	public void buildBodyType() {
		luxuryTaxiCar.setBodyType(BodyType.Hatchback);
	}

	@Override
	public void buildYearOfManufacture() {
		luxuryTaxiCar.setYearOfManufacture(2015);
	}

	@Override
	public void buildBrand() {
		luxuryTaxiCar.setBrand("Lexus");
	}

	@Override
	public void buildModel() {
		luxuryTaxiCar.setModel("RX-385");
	}

	@Override
	public void buildNumberOfSeats() {
		luxuryTaxiCar.setNumberOfSeats(6);
	}

	@Override
	public void buildNumberOfAirbags() {
		luxuryTaxiCar.setNumberOfAirbags(8);
	}

	@Override
	public void buildPrice() {
		luxuryTaxiCar.setPriсe(42000.0);
	}

	@Override
	public void buildHasTV() {
		luxuryTaxiCar.setHasTV(true);
	}

	@Override
	public void buildHasWiFi() {
		luxuryTaxiCar.setHasHeatedSeats(true);
	}

	@Override
	public void buildHasHeatedSeats() {
		luxuryTaxiCar.setHasWiFi(true);
	}

}
