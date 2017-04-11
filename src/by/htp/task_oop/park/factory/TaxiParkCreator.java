package by.htp.task_oop.park.factory;

import by.htp.task_oop.park.TaxiPark;
import by.htp.task_oop.service.TaxiParkService;
import by.htp.task_oop.service.TaxiParkServiceImpl;

public class TaxiParkCreator {

	private static final TaxiParkCreator instance = new TaxiParkCreator();

	private final TaxiParkService taxiParkService = new TaxiParkServiceImpl();

	private TaxiParkCreator() {
	}

	public static TaxiParkCreator getInstance() {
		return instance;
	}
	
	public TaxiParkService getTaxiParkService() {
		return taxiParkService;
	}

	public TaxiPark getTaxiPark(String parkName) {
		return new TaxiPark(parkName);
	}

}
