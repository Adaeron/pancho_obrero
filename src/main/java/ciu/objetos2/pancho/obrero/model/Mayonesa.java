package ciu.objetos2.pancho.obrero.model;

import java.time.LocalDate;

/*
 * Concrete Decorator
 */

public class Mayonesa extends Agregado {

	public Mayonesa(LocalDate vencimiento, Pedido pedido) {
		super(vencimiento, pedido);
	}

	@Override
	public Double precio() {
		return Double.valueOf(50.0) + super.precio();
	}
}
