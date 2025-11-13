package fr.ex.market;

import java.time.LocalDate;

public abstract class Product {
	
	//Data
	
	private static int productId = 0;
	
	private String name;
	private double unitPrice;
	private String unit;
	private double stockQuantity;
	private LocalDate pickingDate;
	private int shelfLifeDays;
	
	
	//constructor
	public Product(int productId, String name, double unitPrice, String unit, double stockQuantity, LocalDate pickingDate,int shelfLifeDays) {
		
	}

	
	// getter and setter

	public static int getProductId() {
		return productId;
	}

	public static void setProductId(int productId) {
		Product.productId = productId;
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
}
