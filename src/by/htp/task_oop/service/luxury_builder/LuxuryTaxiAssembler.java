package by.htp.task_oop.service.luxury_builder;

import by.htp.task_oop.bean.LuxuryTaxiCar;
import by.htp.task_oop.service.exception.TaxiBuildingException;
import by.htp.task_oop.service.taxi_builder.TaxiAssembler;

public class LuxuryTaxiAssembler extends TaxiAssembler {

	private LuxuryTaxiCarBuilder luxuryTaxiCarBuilder;

	public void setLuxuryTaxiCarBuilder(LuxuryTaxiCarBuilder luxuryTaxiCarBuilder) {
		this.luxuryTaxiCarBuilder = luxuryTaxiCarBuilder;
	}

	public LuxuryTaxiCar getLuxuryTaxiCar() {
		return luxuryTaxiCarBuilder.getLuxuryTaxiCar();
	}

	public void accemblingLuxuryTaxiCar(String[] assemblingArray) throws TaxiBuildingException {

		luxuryTaxiCarBuilder.createNewLuxuryTaxiCar();

		super.setTaxiCarBuilder(luxuryTaxiCarBuilder);
		super.accemblingTaxiCar(assemblingArray);

		luxuryTaxiCarBuilder.buildDefaultLuxuryOption();
		
		try {
			if (!assemblingArray[14].isEmpty()) {
				luxuryTaxiCarBuilder.buildHasTV(Boolean.parseBoolean(assemblingArray[14].trim()));
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Incorrect TV option, set to default.");
		}
		
		try {
			if (!assemblingArray[15].isEmpty()) {
				luxuryTaxiCarBuilder.buildHasWiFi(Boolean.parseBoolean(assemblingArray[15].trim()));
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Incorrect Wi-Fi option, set to default.");
		}
		
		try {
			if (!assemblingArray[16].isEmpty()) {
				luxuryTaxiCarBuilder.buildHasHeatedSeats(Boolean.parseBoolean(assemblingArray[16].trim()));
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Incorrect heating seats option, set to default.");
		}

	}

}
