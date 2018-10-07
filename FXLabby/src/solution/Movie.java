package solution;


public class Movie {
	private String _title;
	private Price _price;
	
	public Movie(String title, Price priceCode) {
		_title = title;
		_price = priceCode;
	}
	
	public Price getPriceCode() {
		return _price;
	}
	
	public void setPriceCode(Price arg) {
		_price = arg;
	}
	public String getTitle (){
		return _title;
	}

	double getCharge(int daysRented) {
		return _price.getCharge(daysRented);
	}
	
	int getFrequentRenterPoints(int daysRented) {
		
		return _price.getFrequentRenterPoints(daysRented);	
	}
	
}