package fr.ex.market;

import java.time.LocalDate;

public class Vegetables extends Product {

	public Vegetables(String name, double unitPrice, String unit, double stockQuantity, LocalDate pickingDate,
			int shelfLifeDays) {
		super(name, unitPrice, unit, stockQuantity, pickingDate, shelfLifeDays);
		
	}

	@Override
	public void calculateExpirationDate() {
		// TODO Auto-generated method stub
		
	}

}
