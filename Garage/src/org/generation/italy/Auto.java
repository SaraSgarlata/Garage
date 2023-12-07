package org.generation.italy;

public class Auto extends VeicoloMotore{
	
	protected	int porte;
	protected	char alimentazione;


	public Auto(int id, int anno, int cilindrata, String marca, int porte, char alimentazione) {
	super(id, anno, cilindrata, marca);
	this.porte=porte;
	this.alimentazione=alimentazione;
}
	
	
	public String toString() {
	return super.toString() + "" + porte + "" + alimentazione;
	
	}	
}
