import java.util.List;

public class Cart {

	List<Book> bookList;

	static final double DISCOUNT_2_BOOKS = 0.05;
	static final double DISCOUNT_3_BOOKS = 0.10;
	static final double UNIT_PRICE = 8;

	public Cart(List<Book> bookList) {
		this.bookList = bookList;
	}

	public double getPrice(){
		double price = bookList.size() * UNIT_PRICE;

		return applyDiscount(price);
	}

	private double applyDiscount(double price) {

		if (bookList.size() == 2){
			price *= 1 - DISCOUNT_2_BOOKS;
		}
		if(bookList.size() == 3){
			price *= 1 - DISCOUNT_3_BOOKS;
		}
		return price;
	}

}
