package by.htp.task_oop;

import by.htp.task_oop.park.TaxiPark;
import by.htp.task_oop.park.factory.TaxiParkCreator;
import by.htp.task_oop.service.TaxiParkService;
import by.htp.task_oop.service.exception.TaxiBuildingException;

public class Inspector {
	public static void main(String[] args) {

		TaxiParkCreator taxiParkCreator = TaxiParkCreator.getInstance();
		TaxiParkService taxiParkService = taxiParkCreator.getTaxiParkService();

		TaxiPark cityTaxi = taxiParkCreator.getTaxiPark("City Taxi");
		TaxiPark taxiLuxe = taxiParkCreator.getTaxiPark("Taxi Luxe");

		try {
			taxiParkService.buyCar(cityTaxi,
					"opel,Astra,sedan,petrol,frontdrive,manual,1600,180,8.1,2012,4,6,124124,13400");
			taxiParkService.buyCar(cityTaxi,
					"opel,Meriva,hatchback,petrol,frontdrive,manual,1400,170,8.3,2014,4,8,324124,14900");
			taxiParkService.buyCar(cityTaxi,
					"opel,Zafira,sedan,diesel,frontdrive,automatic,1900,160,8.6,2014,4,8,124124,16900");
			taxiParkService.buyCar(cityTaxi,
					"subaru,impreza,sedan,petrol,frontdrive,manual,2200,190,9.6,2010,4,4,434124,19100");
			taxiParkService.buyCar(cityTaxi,
					"ford,fiesta,hatchback,petrol,frontdrive,manual,1200,145,6.6,2013,4,2,524132,11900");
			taxiParkService.buyCar(cityTaxi,
					"volkswagen,passat,sedan,diesel,frontdrive,automatic,2500,190,8.8,2011,4,8,435246,13900");

			taxiParkService.buyLuxuryCar(taxiLuxe,
					"mercedes,c_class,sedan,diesel,reardrive,automatic,2500,190,8.8,2011,4,8,999246,23900,false,true,true");
			taxiParkService.buyLuxuryCar(taxiLuxe,
					"mercedes,s_class,sedan,petrol,allwheeldrive,automatic,4500,230,12.8,2016,4,10,945246,27900, true,true,true");
			taxiParkService.buyLuxuryCar(taxiLuxe,
					"lexus,lx,hatchback,petrol,allwheeldrive,automatic,4600,240,13.1,2016,4,10,955211,47900, true,true,false");
			taxiParkService.buyLuxuryCar(taxiLuxe,
					"lexus,rx,wan,diesel,allwheeldrive,automatic,3900,210,11.1,2015,4,8,454311,42200, false,true,false");
			taxiParkService.buyLuxuryCar(taxiLuxe,
					"lexus,ls,sedan,petrol,reardrive,automatic,4600,210,12.1,2015,4,10,452356,41200, false,true,false");

			// taxiParkService.printPark(cityTaxi);
			// taxiParkService.printLuxuryPark(taxiLuxe);

			// taxiParkService.printPark(taxiParkService.getSortedPark(cityTaxi));
			// taxiParkService.printPark(taxiParkService.getSortedPark(taxiLuxe));
			taxiParkService.printParkBySpeed(cityTaxi, 180);
			taxiParkService.printParkBySpeed(taxiLuxe, 220);

		} catch (TaxiBuildingException e) {
			System.err.println(e);
		}

	}
}
