package by.htp.task_oop.service.luxury_builder;

import by.htp.task_oop.bean.Param.*;
import by.htp.task_oop.service.exception.TaxiBuildingException;

public class MercedesTaxiBuilder extends LuxuryTaxiCarBuilder {

	private final String BRAND_NAME = "MERCEDES";
	private final int DEFAULT_YEAR = 2014;
	private final int DEFAULT_SEATS = 4;
	private final int DEFAULT_AIRBAGS = 6;
	private final double DEFAULT_ENGINE_DISPLACEMENT = 3400;
	private final double DEFAULT_MAX_SPEED = 200;
	private final double DEFAULT_FUEL_CONSUMPTION = 13.1;
	private final double DEFAULT_PRICE = 31000;
	private final boolean DEFAULT_TV = true;
	private final boolean DEFAULT_WIFI = false;
	private final boolean DEFAULT_HEAT_SEATS = true;

	//Initial Luxe Option
	@Override
	public void buildDefaultLuxuryOption() {
		luxuryTaxiCar.setHasTV(DEFAULT_TV);
		luxuryTaxiCar.setHasWiFi(DEFAULT_WIFI);
		luxuryTaxiCar.setHasHeatedSeats(DEFAULT_HEAT_SEATS);
	}
	
	@Override
	public void buildBrand(String brand) {
		luxuryTaxiCar.setBrand(BRAND_NAME);
	}

	@Override
	public void buildModel(String model) throws TaxiBuildingException {

		MercedesModel opelModel;
		try {
			opelModel = MercedesModel.valueOf(model.toUpperCase().trim());

		} catch (IllegalArgumentException e) {
			throw new TaxiBuildingException("Incorrect model!");
		}
		luxuryTaxiCar.setModel(opelModel.toString());
	}

	@Override
	public void buildBodyType(BodyType bodyType) {
		if (bodyType != null) {
			luxuryTaxiCar.setBodyType(bodyType);
		} else {
			luxuryTaxiCar.setBodyType(BodyType.HATCHBACK);
		}
	}

	@Override
	public void buildFuelType(Fuel fuelType) {
		if (fuelType != null) {
			luxuryTaxiCar.setFuelType(fuelType);
		} else {
			taxiCar.setFuelType(Fuel.PETROL);
		}
	}

	@Override
	public void buildDriveType(Drive driveType) {
		if (driveType != null) {
			luxuryTaxiCar.setDriveType(driveType);
		} else {
			luxuryTaxiCar.setDriveType(Drive.FRONTDRIVE);
		}
	}

	@Override
	public void buildTransmission(Transmission transmission) {
		if (transmission != null) {
			luxuryTaxiCar.setTransmission(transmission);
		} else {
			luxuryTaxiCar.setTransmission(Transmission.MANUAL);
		}
	}

	@Override
	public void buildEngineDisplacement(double engine) {
		if (engine != 0) {
			luxuryTaxiCar.setEngineDisplacement(engine);
		} else {
			luxuryTaxiCar.setEngineDisplacement(DEFAULT_ENGINE_DISPLACEMENT);
		}
	}

	@Override
	public void buildMaxSpeed(double maxSpeed) {
		if (maxSpeed != 0) {
			luxuryTaxiCar.setMaxSpeed(maxSpeed);
		} else {
			luxuryTaxiCar.setMaxSpeed(DEFAULT_MAX_SPEED);
		}
	}

	@Override
	public void buildFuelConsumption(double FuelConsumption) {
		if (FuelConsumption != 0) {
			luxuryTaxiCar.setFuelConsumption(FuelConsumption);
		} else {
			luxuryTaxiCar.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
		}
	}

	@Override
	public void buildYearOfManufacture(int year) {
		if (year != 0) {
			luxuryTaxiCar.setYearOfManufacture(year);
		} else {
			luxuryTaxiCar.setYearOfManufacture(DEFAULT_YEAR);
		}
	}

	@Override
	public void buildNumberOfSeats(int seats) {
		if (seats != 0) {
			luxuryTaxiCar.setNumberOfSeats(seats);
		} else {
			luxuryTaxiCar.setNumberOfSeats(DEFAULT_SEATS);
		}
	}

	@Override
	public void buildNumberOfAirbags(int airbags) {
		if (airbags != 0) {
			luxuryTaxiCar.setNumberOfAirbags(airbags);
		} else {
			luxuryTaxiCar.setNumberOfAirbags(DEFAULT_AIRBAGS);
		}
	}

	@Override
	public void buildPrice(Double price) {
		if (price != 0) {
			luxuryTaxiCar.setPriсe(price);
		} else {
			luxuryTaxiCar.setPriсe(DEFAULT_PRICE);
		}
	}

	@Override
	public void buildBodyNumber(int bodyNumber) throws TaxiBuildingException {
		if (bodyNumber == 0) {
			throw new TaxiBuildingException("empty body number!");
		}
		luxuryTaxiCar.setBodyNubmer(bodyNumber);

	}

	@Override
	public void buildHasTV(boolean tv) {
		luxuryTaxiCar.setHasTV(tv);
	}

	@Override
	public void buildHasWiFi(boolean wifi) {
		luxuryTaxiCar.setHasWiFi(wifi);
	}
	
	@Override
	public void buildHasHeatedSeats(boolean heatSeats) {
		luxuryTaxiCar.setHasHeatedSeats(heatSeats);
	}

	
	

}
