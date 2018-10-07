package solution;

public class NewReleasePrice extends Price {

	@Override
	double getCharge(int daysRented){
		double thisAmount = 5;
		if (daysRented >1) {
			thisAmount += 5 * daysRented;
		}
		return thisAmount;
	}
	
	@Override
	int getFrequentRenterPoints(int daysRented) {
		return (daysRented > 1) ? 2: 1;
	}

	@Override
	String getStatus() {
		return "New";
	}
}
