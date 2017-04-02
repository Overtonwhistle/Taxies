package by.htp.task_oop.taxi_builder;

import by.htp.task_oop.bean.TaxiCar;

public class TaxiAssembler {
	
	private TaxiCarBuilder taxiCarBuilder;

	public void setTaxiCarBuilder(TaxiCarBuilder taxiCarBuilder) {
		this.taxiCarBuilder = taxiCarBuilder;
	}

	public TaxiCar getTaxiCar() {
		return taxiCarBuilder.getTaxiCar();
	}

	public void accemblingTaxiCar() {

		taxiCarBuilder.createNewTaxiCar();
		taxiCarBuilder.buildFuelType();
		taxiCarBuilder.buildDriveType();
		taxiCarBuilder.buildEngineDisplacement();
		taxiCarBuilder.buildMaxSpeed();
		taxiCarBuilder.buildFuelConsumption();
		taxiCarBuilder.buildTransmission();
		taxiCarBuilder.buildBodyType();
		taxiCarBuilder.buildYearOfManufacture();
		taxiCarBuilder.buildBrand();
		taxiCarBuilder.buildModel();
		taxiCarBuilder.buildNumberOfSeats();
		taxiCarBuilder.buildNumberOfAirbags();
		taxiCarBuilder.buildPrice();
	}

}
