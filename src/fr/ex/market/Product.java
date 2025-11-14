package fr.ex.market;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Product {
	
	//Data
	
	private int id;
	private static int nextId = 1;
	
	private String name;
	private double unitPrice;
	private String unit;
	private double stockQuantity;
	private LocalDate pickingDate;
	private int shelfLifeDays;
	
	
	//constructor
	public Product(String name, double unitPrice, String unit, double stockQuantity, LocalDate pickingDate,int shelfLifeDays) {
		this.id = nextId;
		setName(name);
		setUnitPrice(unitPrice);
		setUnit(unit);
		setStockQuantity(stockQuantity);
		setPickingDate(pickingDate);
		setShelfLifeDays(shelfLifeDays);
		nextId++;
		
	}

	
	// getter and setter

	public int getProductId() {
		return id;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getUnitPrice() {
		return unitPrice;
	}


	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}


	public String getUnit() {
		return unit;
	}


	public void setUnit(String unit) {
		this.unit = unit;
	}


	public double getStockQuantity() {
		return stockQuantity;
	}


	public void setStockQuantity(double stockQuantity) {
		this.stockQuantity = stockQuantity;
	}


	public LocalDate getPickingDate() {
		return pickingDate;
	}


	public void setPickingDate(LocalDate pickingDate) {
		this.pickingDate = pickingDate;
	}


	public int getShelfLifeDays() {
		return shelfLifeDays;
	}


	public void setShelfLifeDays(int shelfLifeDays) {
		this.shelfLifeDays = shelfLifeDays;
	}
	

	// methods
	public abstract void calculateExpirationDate();
	
	public void updateStockAfterSell(ArrayList<Product> inventory, String name, int quantity) {
		for(Product product : inventory) {
			if (name.equalsIgnoreCase(product.getName())){
				if (quantity <= product.getStockQuantity() && quantity > 0) {
					product.setStockQuantity(product.getStockQuantity() - quantity);
					System.out.println("Voici votre achat: " + "\n" + product.getName() + "\n" + 
										product.getUnitPrice() + " x " + quantity + " = " + (product.getUnitPrice() * quantity) + " €" );
				} else {
					System.out.println("Désolé la quantité séectionnée n'est pas disponible!");
				}
				
			}
		}
		
		
	}

}
