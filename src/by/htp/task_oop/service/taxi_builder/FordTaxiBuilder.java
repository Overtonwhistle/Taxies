package by.htp.task_oop.service.taxi_builder;

import by.htp.task_oop.bean.Param.*;
import by.htp.task_oop.service.exception.TaxiBuildingException;

public class FordTaxiBuilder extends TaxiCarBuilder {

	private final String BRAND_NAME = "FORD";
	private final int DEFAULT_YEAR = 2011;
	private final int DEFAULT_SEATS = 4;
	private final int DEFAULT_AIRBAGS = 4;
	private final double DEFAULT_ENGINE_DISPLACEMENT = 1600;
	private final double DEFAULT_MAX_SPEED = 150;
	private final double DEFAULT_FUEL_CONSUMPTION = 7.7;
	private final double DEFAULT_PRICE = 13000;

	@Override
	public void buildBrand(String brand) {
		taxiCar.setBrand(BRAND_NAME);
	}

	@Override
	public void buildModel(String model) throws TaxiBuildingException {

		FordModel fordModel;
		try {
			fordModel = FordModel.valueOf(model.toUpperCase().trim());

		} catch (IllegalArgumentException e) {
			throw new TaxiBuildingException("Incorrect model!");
		}
		taxiCar.setModel(fordModel.toString());
	}

	@Override
	public void buildBodyType(BodyType bodyType) {
		if (bodyType != null) {
			taxiCar.setBodyType(bodyType);
		} else {
			taxiCar.setBodyType(BodyType.HATCHBACK);
		}
	}

	@Override
	public void buildFuelType(Fuel fuelType) {
		if (fuelType != null) {
			taxiCar.setFuelType(fuelType);
		} else {
			taxiCar.setFuelType(Fuel.PETROL);
		}
	}

	@Override
	public void buildDriveType(Drive driveType) {
		if (driveType != null) {
			taxiCar.setDriveType(driveType);
		} else {
			taxiCar.setDriveType(Drive.FRONTDRIVE);
		}
	}

	@Override
	public void buildTransmission(Transmission transmission) {
		if (transmission != null) {
			taxiCar.setTransmission(transmission);
		} else {
			taxiCar.setTransmission(Transmission.MANUAL);
		}
	}

	@Override
	public void buildEngineDisplacement(double engine) {
		if (engine != 0) {
			taxiCar.setEngineDisplacement(engine);
		} else {
			taxiCar.setEngineDisplacement(DEFAULT_ENGINE_DISPLACEMENT);
		}
	}

	@Override
	public void buildMaxSpeed(double maxSpeed) {
		if (maxSpeed != 0) {
			taxiCar.setMaxSpeed(maxSpeed);
		} else {
			taxiCar.setMaxSpeed(DEFAULT_MAX_SPEED);
		}
	}

	@Override
	public void buildFuelConsumption(double FuelConsumption) {
		if (FuelConsumption != 0) {
			taxiCar.setFuelConsumption(FuelConsumption);
		} else {
			taxiCar.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
		}
	}

	@Override
	public void buildYearOfManufacture(int year) {
		if (year != 0) {
			taxiCar.setYearOfManufacture(year);
		} else {
			taxiCar.setYearOfManufacture(DEFAULT_YEAR);
		}
	}

	@Override
	public void buildNumberOfSeats(int seats) {
		if (seats != 0) {
			taxiCar.setNumberOfSeats(seats);
		} else {
			taxiCar.setNumberOfSeats(DEFAULT_SEATS);
		}
	}

	@Override
	public void buildNumberOfAirbags(int airbags) {
		if (airbags != 0) {
			taxiCar.setNumberOfAirbags(airbags);
		} else {
			taxiCar.setNumberOfAirbags(DEFAULT_AIRBAGS);
		}
	}

	@Override
	public void buildPrice(Double price) {
		if (price != 0) {
			taxiCar.setPriсe(price);
		} else {
			taxiCar.setPriсe(DEFAULT_PRICE);
		}
	}

	@Override
	public void buildBodyNumber(int bodyNumber) throws TaxiBuildingException {
		if (bodyNumber == 0) {
			throw new TaxiBuildingException("empty body number!");
		}
		taxiCar.setBodyNubmer(bodyNumber);

	}

}
