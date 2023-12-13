package ciu.objetos2.pancho.obrero.main;

import java.time.LocalDate;

import ciu.objetos2.pancho.obrero.model.BasePancho;
import ciu.objetos2.pancho.obrero.model.Mayonesa;
import ciu.objetos2.pancho.obrero.model.Mostaza;
import ciu.objetos2.pancho.obrero.model.Pancho;
import ciu.objetos2.pancho.obrero.model.Pedido;

public class Main {

	public static void main(String[] args) {
		Pancho pancho1 = new Pancho();
		Pedido panchosolo = new BasePancho(pancho1);
		Mayonesa panchoConMayonesa = new Mayonesa(LocalDate.of(2023, 11, 12), panchosolo);
		Mostaza panchoConMayoYMostaza = new Mostaza(LocalDate.of(2022, 11, 12), panchoConMayonesa);
		
		

	}

}
