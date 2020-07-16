public class Book {

	String title;
	Integer quantity;

	public Book(String title, Integer quantity) {

		this.title = title;
		this.quantity = quantity;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void decreaseQuantity() {
		this.quantity -= 1;
	}

	public String getTitle() {
		return title;
	}
}
