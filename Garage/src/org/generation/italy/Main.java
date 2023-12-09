package org.generation.italy;

public class Main {

	public static void main(String[] args) {
		
		
		Garage garage = new Garage();
		
		Auto auto1 = new Auto(001, 2013, 1200, "Fiat", 3, 'g');
		Furgone furgone = new Furgone(111, 2015, 1400, "Fiat");
		Moto moto = new Moto (555, 2023, 1800, "Yamaha");
		
		garage.immissioneVeicolo(moto, 0);
		
		garage.immissioneVeicolo(auto1, 1);
		
		garage.immissioneVeicolo(furgone, 2);
		garage.estrazioneVeicolo(0);
		garage.visualizzaDati();
			
		

	}

}
