package by.htp.task_oop.park.factory;

import by.htp.task_oop.service.TaxiParkService;
import by.htp.task_oop.service.TaxiParkServiceImpl;

public class ParkFactory {

	private static final ParkFactory instance = new ParkFactory();

	private final TaxiParkService taxiParkService = new TaxiParkServiceImpl();

	private ParkFactory() {
	}

	public static ParkFactory getInstance() {
		return instance;
	}

	public TaxiParkService getAddressBookService() {
		return taxiParkService;
	}

	
	
}
