package by.htp.task_oop.service.luxury_builder;

import by.htp.task_oop.bean.LuxuryTaxiCar;
import by.htp.task_oop.service.taxi_builder.TaxiCarBuilder;

public abstract class LuxuryTaxiCarBuilder extends TaxiCarBuilder {

	protected LuxuryTaxiCar luxuryTaxiCar;

	public LuxuryTaxiCar getLuxuryTaxiCar() {
		return luxuryTaxiCar;
	}

	public void createNewLuxuryTaxiCar() {
		luxuryTaxiCar = new LuxuryTaxiCar();

	}

	public abstract void buildDefaultLuxuryOption();
	
	public abstract void buildHasTV(boolean tv);

	public abstract void buildHasWiFi( boolean wifi);

	public abstract void buildHasHeatedSeats(boolean heatSeats);

}
