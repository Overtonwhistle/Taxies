package by.htp.task_oop.common_methods;

import java.util.ArrayList;

import by.htp.task_oop.bean.TaxiCar;

public class TaxiParkUtilsMethods {
	public static void printPark(ArrayList<TaxiCar> taxiPark) {
		for (TaxiCar car : taxiPark) {
			System.out.println("VIN: " + car.getBodyNubmer() + " Brand/Model: " + car.getBrand() + " " + car.getModel()
					+ ", fuel consumption: " + car.getFuelConsumption() + ", max.speed: " + car.getMaxSpeed());
		}
	}

	public static double parkTotalPrice(ArrayList<TaxiCar> taxiPark) {
		double price = 0;
		for (TaxiCar car : taxiPark) {
			price = price + car.getPriсe();
		}
		return price;
	}

	public static ArrayList<TaxiCar> getCarsByMaxSpeed(ArrayList<TaxiCar> taxiPark, double maxSpeed) {
		ArrayList<TaxiCar> list = new ArrayList<TaxiCar>();

		for (TaxiCar car : taxiPark) {
			if (car.getMaxSpeed() >= maxSpeed) {
				list.add(car);
			}
		}
		return list;
	}

}
