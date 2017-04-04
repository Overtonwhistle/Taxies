package by.htp.task_oop.luxury_builder;

import by.htp.task_oop.bean.LuxuryTaxiCar;
import by.htp.task_oop.taxi_builder.TaxiAssembler;

public class LuxuryTaxiAssembler extends TaxiAssembler {
	
	private LuxuryTaxiCarBuilder luxuryTaxiCarBuilder;

	public void setLuxuryTaxiCarBuilder(LuxuryTaxiCarBuilder luxuryTaxiCarBuilder) {
		this.luxuryTaxiCarBuilder = luxuryTaxiCarBuilder;
	}

	public LuxuryTaxiCar getLuxuryTaxiCar() {
		return luxuryTaxiCarBuilder.getLuxuryTaxiCar();
	}

	public void accemblingLuxuryTaxiCar() {

		luxuryTaxiCarBuilder.createNewLuxuryTaxiCar();
		
		luxuryTaxiCarBuilder.buildHasTV();
		luxuryTaxiCarBuilder.buildHasWiFi();
		luxuryTaxiCarBuilder.buildHasHeatedSeats();
		
		luxuryTaxiCarBuilder.buildFuelType();
		luxuryTaxiCarBuilder.buildDriveType();
		luxuryTaxiCarBuilder.buildEngineDisplacement();
		luxuryTaxiCarBuilder.buildMaxSpeed();
		luxuryTaxiCarBuilder.buildFuelConsumption();
		luxuryTaxiCarBuilder.buildTransmission();
		luxuryTaxiCarBuilder.buildBodyType();
		luxuryTaxiCarBuilder.buildYearOfManufacture();
		luxuryTaxiCarBuilder.buildBrand();
		luxuryTaxiCarBuilder.buildModel();
		luxuryTaxiCarBuilder.buildNumberOfSeats();
		luxuryTaxiCarBuilder.buildNumberOfAirbags();
		luxuryTaxiCarBuilder.buildPrice();
	}

}
