package by.htp.task_oop.luxury_builder;

import by.htp.task_oop.bean.Params.*;

public class MercedesTaxiBuilder extends LuxuryTaxiCarBuilder {

	@Override
	public void buildFuelType() {
		luxuryTaxiCar.setFuelType(Fuel.Petrol);

	}

	@Override
	public void buildDriveType() {
		luxuryTaxiCar.setDriveType(Drive.AllWheelDrive);

	}

	@Override
	public void buildEngineDisplacement() {
		luxuryTaxiCar.setEngineDisplacement(4200);
	}

	@Override
	public void buildMaxSpeed() {
		luxuryTaxiCar.setMaxSpeed(250);
	}

	@Override
	public void buildFuelConsumption() {
		luxuryTaxiCar.setFuelConsumption(15.1);

	}

	@Override
	public void buildTransmission() {
		luxuryTaxiCar.setTransmission(Transmission.Automatic);

	}

	@Override
	public void buildBodyType() {
		luxuryTaxiCar.setBodyType(BodyType.Sedan);

	}

	@Override
	public void buildYearOfManufacture() {
		luxuryTaxiCar.setYearOfManufacture(2012);

	}

	@Override
	public void buildBrand() {
		luxuryTaxiCar.setBrand("Mercedes");
	}

	@Override
	public void buildModel() {
		luxuryTaxiCar.setModel("C-Klasse");
	}

	@Override
	public void buildNumberOfSeats() {
		luxuryTaxiCar.setNumberOfSeats(4);
	}

	@Override
	public void buildNumberOfAirbags() {
		luxuryTaxiCar.setNumberOfAirbags(8);
	}

	@Override
	public void buildPrice() {
		luxuryTaxiCar.setPriсe(45000.0);
	}

	@Override
	public void buildHasTV() {
		luxuryTaxiCar.setHasTV(false);
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
