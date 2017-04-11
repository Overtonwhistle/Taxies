package by.htp.task_oop.service;

import by.htp.task_oop.bean.TaxiCar;
import by.htp.task_oop.park.TaxiPark;

import java.util.Iterator;
import java.util.List;

import by.htp.task_oop.bean.Car;
import by.htp.task_oop.bean.LuxuryTaxiCar;
import by.htp.task_oop.bean.Param.Brand;
import by.htp.task_oop.bean.Param.LuxuryBrand;
import by.htp.task_oop.service.comparator.FuelComparator;
import by.htp.task_oop.service.exception.TaxiBuildingException;
import by.htp.task_oop.service.luxury_builder.LexusTaxiBuilder;
import by.htp.task_oop.service.luxury_builder.LuxuryTaxiAssembler;
import by.htp.task_oop.service.luxury_builder.LuxuryTaxiCarBuilder;
import by.htp.task_oop.service.luxury_builder.MercedesTaxiBuilder;
import by.htp.task_oop.service.taxi_builder.FordTaxiBuilder;
import by.htp.task_oop.service.taxi_builder.OpelTaxiBuilder;
import by.htp.task_oop.service.taxi_builder.SubaruTaxiBuilder;
import by.htp.task_oop.service.taxi_builder.TaxiAssembler;
import by.htp.task_oop.service.taxi_builder.TaxiCarBuilder;
import by.htp.task_oop.service.taxi_builder.VWTaxiBuilder;

public class TaxiParkServiceImpl implements TaxiParkService {

	@Override
	public boolean buyCar(TaxiPark park, String inputOrder) throws TaxiBuildingException {

		TaxiAssembler taxiAssembler = new TaxiAssembler(); // DIRECTOR
		TaxiCarBuilder concreteTaxiBuilder = null;
		String[] assemblingArray = inputOrder.split(",");

		Brand brand;

		try {
			brand = Brand.valueOf(assemblingArray[0].toUpperCase().trim());
		} catch (IllegalArgumentException e) {
			throw new TaxiBuildingException("Incorrect brand!", e);
		}

		switch (brand) {
		case OPEL:
			concreteTaxiBuilder = new OpelTaxiBuilder();
			break;

		case FORD:
			concreteTaxiBuilder = new FordTaxiBuilder();
			break;

		case SUBARU:
			concreteTaxiBuilder = new SubaruTaxiBuilder();
			break;

		case VOLKSWAGEN:
			concreteTaxiBuilder = new VWTaxiBuilder();
			break;
		}

		taxiAssembler.setTaxiCarBuilder(concreteTaxiBuilder);
		taxiAssembler.accemblingTaxiCar(assemblingArray);
		TaxiCar taxi = taxiAssembler.getTaxiCar();

		return park.getCarPark().add(taxi);
	}

	@Override
	public void printPark(TaxiPark park) {
		String parkName = park.getParkName();
		List<Car> list = park.getCarPark();

		if (list.isEmpty()) {
			System.out.println("Park '" + parkName + "' is empty. You can buy cars at any time :)");
			return;
		}

		System.out.println("Park \"" + parkName + "\":");
		for (Iterator<Car> iterator = list.iterator(); iterator.hasNext();) {
			TaxiCar car = (TaxiCar) iterator.next();

			System.out.println("VIN: " + car.getBodyNubmer() + " Brand/Model: " + car.getBrand() + " " + car.getModel()
					+ ", fuel consumption: " + car.getFuelConsumption() + ", max.speed: " + car.getMaxSpeed());
		}
		System.out.println("-----------------------------------------------");
	}

	@Override
	public boolean buyLuxuryCar(TaxiPark park, String inputOrder) throws TaxiBuildingException {

		LuxuryTaxiAssembler luxurytaxiAssembler = new LuxuryTaxiAssembler(); // DIRECTOR
		LuxuryTaxiCarBuilder concreteLuxuryTaxiBuilder = null;
		String[] assemblingArray = inputOrder.split(",");

		LuxuryBrand brand;
		try {
			brand = LuxuryBrand.valueOf(assemblingArray[0].toUpperCase().trim());
		} catch (IllegalArgumentException e) {
			throw new TaxiBuildingException("Incorrect luxury brand!", e);
		}

		switch (brand) {
		case MERCEDES:
			concreteLuxuryTaxiBuilder = new MercedesTaxiBuilder();
			break;
		case LEXUS:
			concreteLuxuryTaxiBuilder = new LexusTaxiBuilder();
			break;
		}
		luxurytaxiAssembler.setLuxuryTaxiCarBuilder(concreteLuxuryTaxiBuilder);
		luxurytaxiAssembler.accemblingLuxuryTaxiCar(assemblingArray);
		LuxuryTaxiCar taxi = luxurytaxiAssembler.getLuxuryTaxiCar();
		return park.getCarPark().add(taxi);
	}

	@Override
	public void printLuxuryPark(TaxiPark park) {
		String parkName = park.getParkName();
		List<Car> list = park.getCarPark();

		if (list.isEmpty()) {
			System.out.println("Park '" + parkName + "' is empty. You can buy cars at any time :)");
			return;
		}

		System.out.println("Park \"" + parkName + "\":");
		for (Iterator<Car> iterator = list.iterator(); iterator.hasNext();) {
			LuxuryTaxiCar car = (LuxuryTaxiCar) iterator.next();

			System.out.println("VIN: " + car.getBodyNubmer() + " Brand/Model: " + car.getBrand() + " " + car.getModel()
					+ ", fuel consumption: " + car.getFuelConsumption() + ", max.speed: " + car.getMaxSpeed() + ", TV: "
					+ car.isHasTV() + ", Wi-Fi: " + car.isHasWiFi() + ", heated seats: " + car.isHasHeatedSeats());
		}
		System.out.println("-----------------------------------------------");

	}

	@Override
	public TaxiPark getSortedPark(TaxiPark park) {
		TaxiPark sortedPark = new TaxiPark();
		sortedPark.setParkName(park.getParkName() + " (sorted)");
		sortedPark.getCarPark().addAll(park.getCarPark());
		sortedPark.getCarPark().sort(new FuelComparator());

		return sortedPark;
	}

	@Override
	public void printParkBySpeed(TaxiPark park, double maxSpeed) {
		String parkName = park.getParkName();
		List<Car> list = park.getCarPark();

		if (list.isEmpty()) {
			System.out.println("Park '" + parkName + "' is empty. You can buy cars at any time :)");
			return;
		}

		System.out.println("List of cars in \""+parkName+ "\" with a maximum speed of more than "+maxSpeed);
		
		for (Iterator<Car> iterator = list.iterator(); iterator.hasNext();) {
			TaxiCar car = (TaxiCar) iterator.next();
			if (car.getMaxSpeed() >= maxSpeed) {
			System.out.println("VIN: " + car.getBodyNubmer() + " Brand/Model: " + car.getBrand() + " " + car.getModel()
					+ ", fuel consumption: " + car.getFuelConsumption() + ", max.speed: " + car.getMaxSpeed());
			}
		}
		System.out.println("-----------------------------------------------");	
		
		
	}

}
