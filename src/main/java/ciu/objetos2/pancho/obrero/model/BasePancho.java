package ciu.objetos2.pancho.obrero.model;

public class BasePancho implements Pedido{
	
	private Pedido pedido;
	
	public BasePancho(Pedido pedido) {
		this.pedido = pedido;
	}
	
	@Override
	public Double precio() {
		return this.pedido.precio();
	}
	
	@Override
	public Integer poderDiarreico() {
		return this.pedido.poderDiarreico();
	}
}
