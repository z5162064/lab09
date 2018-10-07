package solution;

import java.util.ArrayList;
import java.util.List;

public class RentalBasket implements RentalBundles {

	private List<RentalBundles> Items = new ArrayList<RentalBundles>();
	
	@Override
	public double getCharge() {
		double total = 0;
		for(RentalBundles rent: Items) {
			total += rent.getCharge();
		}
		return total;
	}

	@Override
	public int getFrequentRenterPoints() {
		int totalpoints = 0;
		for(RentalBundles r: Items) {
			totalpoints += r.getFrequentRenterPoints();
		}
		return totalpoints;
	}
	public void addRental(RentalBundles r) {
		Items.add(r);
	}
	
	public void removeRental(RentalBundles r) {
		Items.remove(r);
	}
	
	@Override
	public String getStatement() {
		String result = "";
		for(RentalBundles r: Items) {
			result += getStatement();
		}
		return result;
	}
}