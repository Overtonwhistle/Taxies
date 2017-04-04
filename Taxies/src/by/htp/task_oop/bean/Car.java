package by.htp.task_oop.bean;

import java.util.Random;

import by.htp.task_oop.bean.Params.Drive;
import by.htp.task_oop.bean.Params.Fuel;

public abstract class Car implements java.io.Serializable {

	public Car() {

	}

	private static final long serialVersionUID = 1L;
	private Fuel fuelType;
	private Drive driveType;
	private double engineDisplacement;
	private double maxSpeed;
	private double fuelConsumption;
	private final int bodyNubmer;

	{
		Random rand = new Random();
		bodyNubmer = 10000 + rand.nextInt(89999);
	}

	public Fuel getFuelType() {
		return fuelType;
	}

	public void setFuelType(Fuel fuelType) {
		this.fuelType = fuelType;
	}

	public Drive getDriveType() {
		return driveType;
	}

	public void setDriveType(Drive driveType) {
		this.driveType = driveType;
	}

	public double getEngineDisplacement() {
		return engineDisplacement;
	}

	public void setEngineDisplacement(double engineDisplacement) {
		this.engineDisplacement = engineDisplacement;
	}

	public double getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public double getFuelConsumption() {
		return fuelConsumption;
	}

	public void setFuelConsumption(double fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}

	public int getBodyNubmer() {
		return bodyNubmer;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(fuelConsumption);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((driveType == null) ? 0 : driveType.hashCode());
		temp = Double.doubleToLongBits(engineDisplacement);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((fuelType == null) ? 0 : fuelType.hashCode());
		temp = Double.doubleToLongBits(maxSpeed);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Car other = (Car) obj;
		if (Double.doubleToLongBits(fuelConsumption) != Double.doubleToLongBits(other.fuelConsumption)) {
			return false;
		}
		if (driveType != other.driveType) {
			return false;
		}
		if (Double.doubleToLongBits(engineDisplacement) != Double.doubleToLongBits(other.engineDisplacement)) {
			return false;
		}
		if (fuelType != other.fuelType) {
			return false;
		}
		if (Double.doubleToLongBits(maxSpeed) != Double.doubleToLongBits(other.maxSpeed)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Car(abstract) [fuelType=" + fuelType + ", driveType=" + driveType + ", engineDisplacement="
				+ engineDisplacement + ", maxSpeed=" + maxSpeed + ", FuelConsumption=" + fuelConsumption + "]";
	}

}