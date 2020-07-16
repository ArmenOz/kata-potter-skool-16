import java.util.List;

public class Cart {

	List<Book> bookList;

	public Cart(List<Book> bookList) {
		this.bookList = bookList;
	}

	public double getTotalPrice() {
		double totalPrice = 0;

		while (!isBookListEmpty()) {
			Package bookPackage = createPackageFromBookList();
			totalPrice += bookPackage.getPrice();
		}

		return totalPrice;
	}


	private Package createPackageFromBookList() {
		Package bookPackage = new Package(0);
		for (Book book:bookList) {
			if (book.getQuantity() > 0 ) {
				book.decreaseQuantity();
				bookPackage.addBook();
			}
		}
		return bookPackage;
	}

	private boolean isBookListEmpty() {
		for (Book book:bookList) {
			if (book.getQuantity() > 0) {
				return false;
			}
		}
		return true;
	}

}
