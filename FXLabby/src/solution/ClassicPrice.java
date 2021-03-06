package solution;

public class ClassicPrice extends Price {

	@Override
	double getCharge(int daysRented) {
		double thisAmount = 2.5;
		if(daysRented > 5) {
			thisAmount += 2.5*daysRented + (daysRented-5)*0.5;
		} 
		return thisAmount;
	}
	
	@Override
	String getStatus() {
		return "Classic";
	}

}
