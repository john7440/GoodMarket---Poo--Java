package fr.ex.market;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Product> marketInventory = new ArrayList<>();
		
		/// Création des fruits
		
		Fruits clementine = new Fruits("Clémentine", 2.90, "kg", 6, LocalDate.of(13,11,2025) , 20);
		Fruits datte = new Fruits("Datte", 7.00, "kg", 4, LocalDate.of(17, 01, 2024), 400);
		Fruits grenade = new Fruits("Grenade", 3.50, "kg", 3, LocalDate.of(10,11,2025) , 15);
		Fruits kaki = new Fruits("Kaki", 4.50, "kg", 3, LocalDate.of(8,11,2025) , 26);
		Fruits kiwi = new Fruits("Kiwi", 3.50, "kg", 5, LocalDate.of(02,11,2025) , 57);
		Fruits mandarine = new Fruits("Mandarine", 2.80, "kg", 6, LocalDate.of(26,10,2025) , 32);
		Fruits pamplemousse  = new Fruits("Pamplemousse", 2.00, "pièce", 8, LocalDate.of(19,02,2025) , 120);
		Fruits poire = new Fruits("Poire", 2.50, "kg", 5, LocalDate.of(12,10,2025) , 40);
		Fruits pomme  = new Fruits("Pomme", 1.50, "kg", 8, LocalDate.of(1,10,2025) , 100);
		
		

	}

}
