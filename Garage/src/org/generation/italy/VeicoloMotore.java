package org.generation.italy;

public class VeicoloMotore {

	protected int id, anno, cilindrata;
	protected String marca;
	
	public VeicoloMotore(int id, int anno, int cilindrata, String marca) {
		super();
		this.id = id;
		this.anno = anno;
		this.cilindrata = cilindrata;
		this.marca = marca;
	}

	@Override
	public String toString() {
	return  id + " " + anno + " " + cilindrata + " " + marca + " ";	
}
}