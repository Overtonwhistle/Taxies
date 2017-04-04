package by.htp.task_oop.park;

import java.util.ArrayList;
import by.htp.task_oop.bean.TaxiCar;
import by.htp.task_oop.bean.LuxuryTaxiCar;
import by.htp.task_oop.comparator.FuelComparator;
import by.htp.task_oop.luxury_builder.LexusTaxiBuilder;
import by.htp.task_oop.luxury_builder.LuxuryTaxiAssembler;
import by.htp.task_oop.luxury_builder.LuxuryTaxiCarBuilder;
import by.htp.task_oop.luxury_builder.MercedesTaxiBuilder;
import by.htp.task_oop.taxi_builder.FordTaxiBuilder;
import by.htp.task_oop.taxi_builder.OpelTaxiBuilder;
import by.htp.task_oop.taxi_builder.SubaruTaxiBuilder;
import by.htp.task_oop.taxi_builder.TaxiAssembler;
import by.htp.task_oop.taxi_builder.TaxiCarBuilder;
import by.htp.task_oop.common_methods.TaxiParkUtilsMethods;

public class TaxiWork {
	public static void main(String[] args) {
		ArrayList<TaxiCar> taxiPark = new ArrayList<TaxiCar>();

		TaxiAssembler taxiAssembler = new TaxiAssembler(); // DIRECTOR

		TaxiCarBuilder opelTaxiBuilder = new OpelTaxiBuilder();
		taxiAssembler.setTaxiCarBuilder(opelTaxiBuilder);
		taxiAssembler.accemblingTaxiCar();
		TaxiCar opelTaxi1 = taxiAssembler.getTaxiCar();
		taxiAssembler.accemblingTaxiCar();
		TaxiCar opelTaxi2 = taxiAssembler.getTaxiCar();

		TaxiCarBuilder fordTaxiBuilder = new FordTaxiBuilder();
		taxiAssembler.setTaxiCarBuilder(fordTaxiBuilder);
		taxiAssembler.accemblingTaxiCar();
		TaxiCar fordTaxi1 = taxiAssembler.getTaxiCar();

		TaxiCarBuilder subaruTaxiBuilder = new SubaruTaxiBuilder();
		taxiAssembler.setTaxiCarBuilder(subaruTaxiBuilder);
		taxiAssembler.accemblingTaxiCar();
		TaxiCar subaruTaxi1 = taxiAssembler.getTaxiCar();

		LuxuryTaxiAssembler luxuryTaxiAssembler = new LuxuryTaxiAssembler();

		LuxuryTaxiCarBuilder mercedesTaxiBuilder = new MercedesTaxiBuilder();
		luxuryTaxiAssembler.setLuxuryTaxiCarBuilder(mercedesTaxiBuilder);

		luxuryTaxiAssembler.accemblingLuxuryTaxiCar();
		LuxuryTaxiCar mercedesTaxi1 = luxuryTaxiAssembler.getLuxuryTaxiCar();
		luxuryTaxiAssembler.accemblingLuxuryTaxiCar();
		LuxuryTaxiCar mercedesTaxi2 = luxuryTaxiAssembler.getLuxuryTaxiCar();

		LuxuryTaxiCarBuilder lexusTaxiBuilder = new LexusTaxiBuilder();
		luxuryTaxiAssembler.setLuxuryTaxiCarBuilder(lexusTaxiBuilder);
		luxuryTaxiAssembler.accemblingLuxuryTaxiCar();
		LuxuryTaxiCar lexusTaxi1 = luxuryTaxiAssembler.getLuxuryTaxiCar();

		taxiPark.add(fordTaxi1);
		taxiPark.add(opelTaxi1);
		taxiPark.add(opelTaxi2);
		taxiPark.add(subaruTaxi1);
		taxiPark.add(mercedesTaxi1);
		taxiPark.add(mercedesTaxi2);
		taxiPark.add(lexusTaxi1);

		TaxiParkUtilsMethods.printPark(taxiPark);

		System.out.println("Park total price: " + TaxiParkUtilsMethods.parkTotalPrice(taxiPark));

		
		ArrayList<TaxiCar> sortedTaxiPark = new ArrayList<TaxiCar>();
		if (taxiPark.getClass() == sortedTaxiPark.getClass()) {
			sortedTaxiPark = (ArrayList<TaxiCar>) taxiPark.clone();
		}
		sortedTaxiPark.sort(new FuelComparator());

		System.out.println("Sotred by fuel consumption: ");
		TaxiParkUtilsMethods.printPark(sortedTaxiPark);

		
		ArrayList<TaxiCar> speedTaxiPark = new ArrayList<TaxiCar>();
		System.out.println("List of cars with a maximum speed of more than 220: ");
		speedTaxiPark = TaxiParkUtilsMethods.getCarsByMaxSpeed(taxiPark, 220);
		TaxiParkUtilsMethods.printPark(speedTaxiPark);

	}

}