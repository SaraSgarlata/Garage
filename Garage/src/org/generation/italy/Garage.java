package org.generation.italy;

public class Garage {

	protected VeicoloMotore[] posti;

	public Garage() {
		posti = new VeicoloMotore[15];
	}

	public void immissioneVeicolo(VeicoloMotore veicolo, int posto) {
		if (posto >= 0 && posto < 15) {
			posti[posto] = veicolo; // nell'array posti, ci metto nel posto che sarebbe l'indice, il veicolo
			System.out.println("Immissione del veicolo al posto:  " + posto +  "\n");

		} else {
			System.out.println("Posto non disponibile");
		}

	}

	public VeicoloMotore estrazioneVeicolo(int posto) {
		if (posto >= 0 && posto < 15) {

			VeicoloMotore veicolo = posti[posto];
			posti[posto] = null;
			return veicolo;
		} else {
			System.out.println("Posto non valido");
			return null;
		}
		}

	public void visualizzaDati() {

		for (int i = 0; i < posti.length; i++)
			if (posti[i] == null) {
				System.out.println("Posto disponibile in posizione: " + i + "\n");
			} else {
				System.out.println("Posto occupato da veicolo: " + posti[i]+ "\n");
			}

	}
}
