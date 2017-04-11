package by.htp.task_oop.service.taxi_builder;

import by.htp.task_oop.bean.TaxiCar;
import by.htp.task_oop.service.exception.TaxiBuildingException;
import by.htp.task_oop.bean.Param.BodyType;
import by.htp.task_oop.bean.Param.Drive;
import by.htp.task_oop.bean.Param.Fuel;
import by.htp.task_oop.bean.Param.Transmission;

public class TaxiAssembler {

	private TaxiCarBuilder taxiCarBuilder;

	public void setTaxiCarBuilder(TaxiCarBuilder taxiCarBuilder) {
		this.taxiCarBuilder = taxiCarBuilder;
	}

	public TaxiCar getTaxiCar() {
		return taxiCarBuilder.getTaxiCar();
	}

	public void accemblingTaxiCar(String[] assemblingArray) throws TaxiBuildingException {
		taxiCarBuilder.createNewTaxiCar();

		String brand = assemblingArray[0];

		String model = assemblingArray[1];

		BodyType bodyType = null;
		if (!assemblingArray[2].isEmpty()) {
			try {
				bodyType = BodyType.valueOf(assemblingArray[2].toUpperCase().trim());
			} catch (IllegalArgumentException e) {
				System.err.println("Incorrect body type, set to default.");
			}
		}

		Fuel fuelType = null;
		if (!assemblingArray[3].isEmpty()) {
			try {
				fuelType = Fuel.valueOf(assemblingArray[3].toUpperCase().trim());
			} catch (IllegalArgumentException e) {
				System.err.println("Incorrect fuel type, set to default.");
			}
		}

		Drive driveType = null;
		if (!assemblingArray[4].isEmpty()) {
			try {
				driveType = Drive.valueOf(assemblingArray[4].toUpperCase().trim());
			} catch (IllegalArgumentException e) {
				System.err.println("Incorrect drive type, set to default.");
			}
		}

		Transmission transmission = null;
		if (!assemblingArray[5].isEmpty()) {
			try {
				transmission = Transmission.valueOf(assemblingArray[5].toUpperCase().trim());
			} catch (IllegalArgumentException e) {
				System.err.println("Incorrect transmission type, set to default.");
			}
		}

		double engine = 0;
		if (!assemblingArray[6].isEmpty()) {
			try {
				engine = Double.parseDouble(assemblingArray[6]);
			} catch (IllegalArgumentException e) {
				System.err.println("Incorrect engine displacement, set to default.");
			}
		}

		double maxSpeed = 0;
		if (!assemblingArray[7].isEmpty()) {
			try {
				maxSpeed = Double.parseDouble(assemblingArray[7]);
			} catch (IllegalArgumentException e) {
				System.err.println("Incorrect maximal speed, set to default.");
			}
		}

		double fuelConsumption = 0;
		if (!assemblingArray[8].isEmpty()) {
			try {
				fuelConsumption = Double.parseDouble(assemblingArray[8]);
			} catch (IllegalArgumentException e) {
				System.err.println("Incorrect fuel consumption, set to default.");
			}
		}

		int year = 0;
		if (!assemblingArray[9].isEmpty()) {
			try {
				year = Integer.parseInt(assemblingArray[9]);
			} catch (IllegalArgumentException e) {
				System.err.println("Incorrect year of manufacture, set to default.");
			}
		}

		int seats = 0;
		if (!assemblingArray[10].isEmpty()) {
			try {
				seats = Integer.parseInt(assemblingArray[10]);
			} catch (IllegalArgumentException e) {
				System.err.println("Incorrect number of seats, set to default.");
			}
		}

		int airbags = 0;
		if (!assemblingArray[11].isEmpty()) {
			try {
				airbags = Integer.parseInt(assemblingArray[11]);
			} catch (IllegalArgumentException e) {
				System.err.println("Incorrect number of airbags, set to default.");
			}
		}

		int bodyNumber = 0;
		if (!assemblingArray[12].isEmpty()) {
			try {
				bodyNumber = Integer.parseInt(assemblingArray[12]);
			} catch (IllegalArgumentException e) {
				System.err.println("Incorrect body number, set to default.");
			}
		}

		double price = 0;
		try {
			if (!assemblingArray[13].isEmpty()) {
				price = Double.parseDouble(assemblingArray[13]);
			}
		} catch (IllegalArgumentException | ArrayIndexOutOfBoundsException e) {
			System.err.println("Incorrect price, set to default.");
		}

		taxiCarBuilder.buildBrand(brand);
		taxiCarBuilder.buildModel(model);
		taxiCarBuilder.buildBodyType(bodyType);
		taxiCarBuilder.buildFuelType(fuelType);
		taxiCarBuilder.buildDriveType(driveType);
		taxiCarBuilder.buildTransmission(transmission);
		taxiCarBuilder.buildEngineDisplacement(engine);
		taxiCarBuilder.buildMaxSpeed(maxSpeed);
		taxiCarBuilder.buildFuelConsumption(fuelConsumption);
		taxiCarBuilder.buildYearOfManufacture(year);
		taxiCarBuilder.buildNumberOfSeats(seats);
		taxiCarBuilder.buildNumberOfAirbags(airbags);
		taxiCarBuilder.buildBodyNumber(bodyNumber);
		taxiCarBuilder.buildPrice(price);
	}

}
