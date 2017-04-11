package by.htp.task_oop.service.taxi_builder;

import by.htp.task_oop.bean.TaxiCar;
import by.htp.task_oop.service.exception.TaxiBuildingException;
import by.htp.task_oop.bean.Param.BodyType;
import by.htp.task_oop.bean.Param.Drive;
import by.htp.task_oop.bean.Param.Fuel;
import by.htp.task_oop.bean.Param.Transmission;

public abstract class TaxiCarBuilder {

	protected TaxiCar taxiCar;

	public TaxiCar getTaxiCar() {
		return taxiCar;
	}

	public void createNewTaxiCar() {
		taxiCar = new TaxiCar();
//		System.out.println("creating new taxi car");
	}
	
	
	
	
	
	public abstract void buildBrand(String brand) throws TaxiBuildingException ;
	public abstract void buildModel(String model) throws TaxiBuildingException ;
	public abstract void buildBodyType(BodyType bodyType) ;
	public abstract void buildFuelType(Fuel fuelType) ;
	public abstract void buildDriveType(Drive driveType) ;
	public abstract void buildTransmission(Transmission transmission) ;
	public abstract void buildEngineDisplacement(double engine) ;
	public abstract void buildMaxSpeed(double maxSpeed) ;
	public abstract void buildFuelConsumption(double fuelConsumption) ;
	public abstract void buildYearOfManufacture(int year) ;
	public abstract void buildNumberOfSeats(int seats) ;
	public abstract void buildNumberOfAirbags(int airbags) ;
	public abstract void buildBodyNumber(int bodyNumber) throws TaxiBuildingException;
	public abstract void buildPrice(Double price) ;

}
