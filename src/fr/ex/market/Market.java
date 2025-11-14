package fr.ex.market;

import java.util.ArrayList;

public class Market {
	
	private ArrayList<Product> inventory = new ArrayList<>();

    public void addProduct(Product product) {
        inventory.add(product);
    }
    
    public ArrayList<Product> getInventory() {
        return inventory;
    }
    
    public void sellProduct(String name, int quantity) {
        if (!inventory.isEmpty()) {
            inventory.get(0).updateStockAfterSell(inventory, name, quantity);
        }else {
            System.out.println("Le marché est vide, aucun produit disponible.");
        }
    }
}
