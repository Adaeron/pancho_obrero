package ciu.objetos2.pancho.obrero.model;

public class Pancho implements Pedido{
	
	public Pancho() {
		
	}

	@Override
	public Double precio() {
		return Double.valueOf(500.0);
	}
	
	@Override
	public Integer poderDiarreico() {
		return 0;
	}
	
}
