package org.generation.italy;

public class Furgone extends VeicoloMotore {

	protected int capacita;

	public Furgone(int id, int anno, int cilindrata, String marca) {
		super(id, anno, cilindrata, marca);
		this.capacita= capacita;
	}
	

	public String toString() {
		return super.toString() + capacita +" ";
		}
	
	
}
