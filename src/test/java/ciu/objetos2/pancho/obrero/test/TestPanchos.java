package ciu.objetos2.pancho.obrero.test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import ciu.objetos2.pancho.obrero.model.BasePancho;
import ciu.objetos2.pancho.obrero.model.Mayonesa;
import ciu.objetos2.pancho.obrero.model.Mostaza;
import ciu.objetos2.pancho.obrero.model.Pancho;
import ciu.objetos2.pancho.obrero.model.Pedido;

public class TestPanchos {
	
	@DisplayName("Pancho sin nada")
	@Test
	public void panchoSinNada() {
		Pancho pancho1 = new Pancho();
		Pedido panchoSolo = new BasePancho(pancho1);
		assertEquals(Double.valueOf(500.0), panchoSolo.precio());
	}
	
	@DisplayName("Pancho con mayonesa")
	@Test
	public void PanchoConMayonesa() {
		Pancho pancho1 = new Pancho();
		Pedido panchosolo = new BasePancho(pancho1);
		Pedido panchoConMayonesa = new Mayonesa(LocalDate.parse("2022-11-11"), panchosolo);
		//assertEquals(Double.valueOf(550.0), panchoConMayonesa.precio());
		assertEquals(Integer.valueOf(1), panchoConMayonesa.poderDiarreico());
	}
	
	@DisplayName("Pancho con mostaza")
	@Test
	public void PanchoConMostaza() {
		Pancho pancho1 = new Pancho();
		Pedido panchosolo = new BasePancho(pancho1);
		Pedido panchoConMostaza = new Mostaza(LocalDate.parse("2022-11-11"), panchosolo);
		assertEquals(Double.valueOf(550.0), panchoConMostaza.precio());
	}
	
	@DisplayName("Pancho con mayonesa y mostaza")
	@Test
	public void PanchoConMayoYMostaza() {
		Pancho pancho1 = new Pancho();
		Pedido panchosolo = new BasePancho(pancho1);
		Pedido panchoConMayonesa = new Mayonesa(LocalDate.of(2022, 9, 11), panchosolo);
		Pedido panchoConMayoYMostaza = new Mostaza(LocalDate.of(2023, 11, 11), panchoConMayonesa);
		assertEquals(Double.valueOf(600.0), panchoConMayoYMostaza.precio());
		assertEquals(Integer.valueOf(1), panchoConMayoYMostaza.poderDiarreico());
	}
	
	

}
