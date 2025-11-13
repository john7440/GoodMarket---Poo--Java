package fr.ex.market;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Product> marketInventory = new ArrayList<>();
		
		/// Création des fruits
		
		Fruits clementine = new Fruits("Clémentine", 2.90, "kg", 6, LocalDate.of(2025, 11, 10) , 20);
		Fruits datte = new Fruits("Datte", 7.00, "kg", 4, LocalDate.of(2024, 01, 17), 400);
		Fruits grenade = new Fruits("Grenade", 3.50, "kg", 3, LocalDate.of(2025, 10, 11) , 15);
		Fruits kaki = new Fruits("Kaki", 4.50, "kg", 3, LocalDate.of(2025, 8, 11) , 26);
		Fruits kiwi = new Fruits("Kiwi", 3.50, "kg", 5, LocalDate.of(2025, 2, 19) , 57);
		Fruits mandarine = new Fruits("Mandarine", 2.80, "kg", 6, LocalDate.of(2025, 10, 26) , 32);
		Fruits pamplemousse  = new Fruits("Pamplemousse", 2.00, "pièce", 8, LocalDate.of(2025, 02, 19) , 120);
		Fruits poire = new Fruits("Poire", 2.50, "kg", 5, LocalDate.of(2025, 12, 25) , 40);
		Fruits pomme  = new Fruits("Pomme", 1.50, "kg", 8, LocalDate.of(2025, 11, 10) , 100);
		
		System.out.println(pomme);

	}

}
