package fr.ex.market;

public interface Consumable {

	public boolean isRipe();
	
	public boolean isExpired();
	
	public void daysRemainingBeforeExpiration();
}
