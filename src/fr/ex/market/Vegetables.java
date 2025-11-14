package fr.ex.market;

import java.time.LocalDate;

public class Vegetables extends Product implements Consumable {

	public Vegetables(String name, double unitPrice, String unit, double stockQuantity, LocalDate pickingDate,
			int shelfLifeDays) {
		super(name, unitPrice, unit, stockQuantity, pickingDate, shelfLifeDays);
		
	}

	 @Override
	public void calculateExpirationDate() {
		 LocalDate expirationDate = getPickingDate().plusDays(getShelfLifeDays());
		    System.out.println("Expiration: " + expirationDate);
	}
		
	
	@Override
	public String toString() {
		return "Légume: " + this.getName() + "\n" +
			   "Stock: " + this.getStockQuantity() + " " + this.getUnit() + "\n"+
			   "Prix: " + this.getUnitPrice() + "€ /" + this.getUnit() + "\n" +
			   "Date de récolte: " + this.getPickingDate() + "\n" +
			   "Duré de conservation: " + this.getShelfLifeDays() + " jours\n";	
	}

	@Override
	public boolean isRipe() {
		LocalDate today = LocalDate.now();
	    long daysSincePicking = java.time.temporal.ChronoUnit.DAYS.between(getPickingDate(), today);
	    return daysSincePicking >= 15;
		
	}

	@Override
	public boolean isExpired() {
		LocalDate expirationDate = getPickingDate().plusDays(getShelfLifeDays());
	    return LocalDate.now().isAfter(expirationDate);
	}

	@Override
	public void daysRemainingBeforeExpiration() {
	    LocalDate expirationDate = getPickingDate().plusDays(getShelfLifeDays());
	    long daysRemaining = java.time.temporal.ChronoUnit.DAYS.between(LocalDate.now(), expirationDate);
	    
	    if (daysRemaining > 0) {
	        System.out.println("Il reste " + daysRemaining + " jours avant la DLC");
	    } else {
	        System.out.println("Attention!!! Le légume est déjà périmé!");
	    }
	}
}
