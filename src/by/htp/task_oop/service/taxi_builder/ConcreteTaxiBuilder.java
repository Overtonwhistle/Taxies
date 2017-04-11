package by.htp.task_oop.service.taxi_builder;

import by.htp.task_oop.bean.Param.*;
import by.htp.task_oop.service.exception.TaxiBuildingException;

public class ConcreteTaxiBuilder extends TaxiCarBuilder {
	// private final String BRAND_NAME = "Ford";

	// private enum Brand {FORD, OPEL, SUBARU, HONDA, VOLKSWAGEN};
	// private enum FordModel {
	// FOCUS, FIESTA, MONDEO, FUSION
	// };
	private final double DEFAULT_ENGINE_DISPLACEMENT = 1400;
	private final double DEFAULT_MAX_SPEED = 120;
	private final double DEFAULT_FUEL_CONSUMPTION = 7.1;
	private final int DEFAULT_YEAR = 2012;
	private final int DEFAULT_SEATS = 4;
	private final int DEFAULT_AIRBAGS = 2;
	private final double DEFAULT_PRICE = 12000;

	@Override
	public void buildBrand(String brand) throws TaxiBuildingException {
		try {
			brand = Brand.valueOf(brand.toUpperCase().trim()).toString();
		} catch (IllegalArgumentException e) {
			throw new TaxiBuildingException("Incorrect Brand!");
		}
		taxiCar.setBrand(brand);
	}

	@Override
	public void buildModel(String model) throws TaxiBuildingException {
		if (model.isEmpty()) {
			throw new TaxiBuildingException("Empty Model!");
		}

		//
		// try {
		// model = Brand.valueOf(brand.toUpperCase()).toString();
		// } catch (IllegalArgumentException e) {
		// throw new TaxiBuildingException("incorrect Brand!");
		// }

		taxiCar.setModel(model);
	}

	@Override
	public void buildBodyType(BodyType bodyType) {
		if (bodyType != null) {
			taxiCar.setBodyType(bodyType);
		} else {
			taxiCar.setBodyType(BodyType.SEDAN);
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
			throw new TaxiBuildingException("empty Body Number!");
		}
		taxiCar.setBodyNubmer(bodyNumber);

	}

}
