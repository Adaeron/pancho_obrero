package ciu.objetos2.pancho.obrero.model;

import java.time.LocalDate;

public abstract class Agregado extends BasePancho {
	
	protected LocalDate fechaVencimiento;
	
	public Agregado(LocalDate vencimiento, Pedido pedido ) {
		super(pedido);
		this.fechaVencimiento = vencimiento;
	}
	
	@Override
	public Double precio() {
		return super.precio();
	}
	
	 @Override
	 public Integer poderDiarreico() {
		 Integer aux = 0;
		 
		 if(this.isVencido()) {
			 aux = 1;
		 }
		 
		 return aux + super.poderDiarreico();
		 
	 }
	 
	 public Boolean isVencido() {
		 return this.getFechaVencimiento().isBefore(LocalDate.now());
	 }
	 
	 //Getters & Setters

	public LocalDate getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(LocalDate fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	 
	 
	
	
}
