package solution;

public class RegularPrice extends Price {

	@Override
	double getCharge(int daysRented){
		double thisAmount = 5;
		if(daysRented > 3) {
			thisAmount += daysRented-3;
		}
		return thisAmount;
	}
	
	@Override
	String getStatus() {
		return "Regular";
	}
}
