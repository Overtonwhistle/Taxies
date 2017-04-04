package by.htp.task_oop.luxury_builder;

import by.htp.task_oop.bean.LuxuryTaxiCar;
import by.htp.task_oop.taxi_builder.TaxiCarBuilder;

public abstract class LuxuryTaxiCarBuilder extends TaxiCarBuilder {

	protected LuxuryTaxiCar luxuryTaxiCar;

	public LuxuryTaxiCar getLuxuryTaxiCar() {
		return luxuryTaxiCar;
	}

	public void createNewLuxuryTaxiCar() {
		luxuryTaxiCar = new LuxuryTaxiCar();
	}
	
	public abstract void buildHasTV();

	public abstract void buildHasWiFi();

	public abstract void buildHasHeatedSeats();


}
