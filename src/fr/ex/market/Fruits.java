package fr.ex.market;

import java.time.LocalDate;

public class Fruits extends Product {

	public Fruits(String name, double unitPrice, String unit, double stockQuantity, LocalDate pickingDate,
			int shelfLifeDays) {
		super(name, unitPrice, unit, stockQuantity, pickingDate, shelfLifeDays);
		
	}

	@Override
	public void calculateExpirationDate() {
		// TODO Auto-generated method stub
	}
	
	@Override
	public String toString() {
		return "Fruit: " + this.getName() + "\n" +
			   "Stock: " + this.getStockQuantity() + " " + this.getUnit() + "\n"+
			   "Prix: " + this.getUnitPrice() + "€ /" + this.getUnit() + "\n" +
			   "Date de récolte: " + this.getPickingDate() + "\n" +
			   "Duré de conservation: " + this.getShelfLifeDays() + " jours\n";
				
	}

}
