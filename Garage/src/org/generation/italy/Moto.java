package org.generation.italy;

public class Moto extends VeicoloMotore {
		
	protected int tempi;

	public Moto(int id, int anno, int cilindrata, String marca) {
		super(id, anno, cilindrata, marca);
		this.tempi=tempi;
	}

	public String toString() {
		return super.toString() + tempi;
				
	}
}
