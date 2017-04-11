package by.htp.task_oop.park;

import java.util.ArrayList;
import java.util.List;

import by.htp.task_oop.bean.Car;

public class TaxiPark {

	private String parkName;
	private List<Car> carPark = new ArrayList<Car>();

	public void addCar(Car car) {
		carPark.add(car);
	}

	public TaxiPark() {
	}

	public TaxiPark(String parkName) {
		this.parkName = parkName;
	}

	public String getParkName() {
		return parkName;
	}

	public void setParkName(String parkName) {
		this.parkName = parkName;
	}

	public List<Car> getCarPark() {
		return carPark;
	}

	public void setCarPark(List<Car> carPark) {
		this.carPark = carPark;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((carPark == null) ? 0 : carPark.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TaxiPark other = (TaxiPark) obj;
		if (carPark == null) {
			if (other.carPark != null)
				return false;
		} else if (!carPark.equals(other.carPark))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TaxiPark [parkName=" + parkName + ", carPark=" + carPark + "]";
	}
}
