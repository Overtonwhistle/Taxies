package by.htp.task_oop.service.comparator;

import java.util.Comparator;

import by.htp.task_oop.bean.Car;

public class FuelComparator implements Comparator<Car> {

	@Override
	public int compare(Car o1, Car o2) {

		double fuel1 = o1.getFuelConsumption();
		double fuel2 = o2.getFuelConsumption();

		if (fuel1 < fuel2) {
			return -1;
		} else if (fuel1 > fuel2) {
			return 1;
		} else {
			return 0;
		}

	}

}
