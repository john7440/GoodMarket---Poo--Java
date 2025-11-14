package fr.ex.market;

import java.time.LocalDate;

public class Main{

	public static void main(String[] args) {
		
		Market inventory = new Market();
		
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
		
		
		//Création des légumes
		Vegetables carotte = new Vegetables("Carotte", 1.30, "kg", 7, LocalDate.of(2025,4, 22), 68);
		Vegetables choux = new Vegetables("Choux de Bruxelles", 4.00, "kg", 4, LocalDate.of(2025, 6, 19), 123);
		Vegetables chouvert= new Vegetables("Choux vert", 2.50, "pièces", 12, LocalDate.of(2025, 1, 12), 165);
		Vegetables courge = new Vegetables("Courge Butternut", 2.50, "pièces", 6, LocalDate.of(2025,12, 22), 69);
		Vegetables endive = new Vegetables("Endive", 2.50, "kg", 5, LocalDate.of(2025,6, 2), 89);
		Vegetables epinard = new Vegetables("Epinard", 2.60, "kg", 4, LocalDate.of(2024,12, 22), 168);
		Vegetables poireau = new Vegetables("Poireau", 1.20, "kg", 5, LocalDate.of(2025,4, 15), 201);
		Vegetables potiron = new Vegetables("Potiron", 2.50, "pièces", 6, LocalDate.of(2025,4, 22), 68);
		Vegetables radis = new Vegetables("Radis noir", 5.00, "pièces", 10, LocalDate.of(2025,11, 8), 48);
		Vegetables salsifis = new Vegetables("Salsifis", 2.50, "kg", 3, LocalDate.of(2025, 3, 21), 125);
		
		

		// ajout a l'arrayList
		inventory.addProduct(clementine);
		inventory.addProduct(datte);
		inventory.addProduct(grenade);
		inventory.addProduct(kaki);
		inventory.addProduct(kiwi);
		inventory.addProduct(mandarine);
		inventory.addProduct(pamplemousse);
		inventory.addProduct(poire);
		inventory.addProduct(pomme);
		
		inventory.addProduct(carotte);
		inventory.addProduct(choux);
		inventory.addProduct(chouvert);
		inventory.addProduct(courge);
		inventory.addProduct(endive);
		inventory.addProduct(epinard);
		inventory.addProduct(poireau);
		inventory.addProduct(potiron);
		inventory.addProduct(radis);
		inventory.addProduct(salsifis);
		
		
		salsifis.calculateExpirationDate();
		
		System.out.println("--avant");
		System.out.println(datte);
		
		inventory.sellProduct("datte", 2);
		
		System.out.println("--après la vente");
		System.out.println(datte);
	}
	
	

}
