package solution;

public class ChildrenPrice extends Price {

	@Override
	double getCharge(int daysRented){
		double thisAmount = 1.5;
		if (daysRented > 3)
			thisAmount += (daysRented - 3) * 1.5;
		return thisAmount;
	}
	
	@Override
	String getStatus() {
		return "Childrens";
	}
}
