package by.htp.task_oop.service;


import by.htp.task_oop.park.TaxiPark;
import by.htp.task_oop.service.exception.TaxiBuildingException;

public interface TaxiParkService {

	public boolean buyCar (TaxiPark park, String order) throws TaxiBuildingException;
	public void printPark (TaxiPark park);
	
	public boolean buyLuxuryCar (TaxiPark park, String order) throws TaxiBuildingException;
	public void printLuxuryPark (TaxiPark park);
	
	public TaxiPark getSortedPark (TaxiPark park);
	public void printParkBySpeed (TaxiPark park, double maxSpeed);
}