import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

class CartTest {

	@Test
	void whenEmptyList_ReturnPrice0() {
		// Given
		Cart cart = new Cart(List.of());

		// When
		double price = cart.getTotalPrice();

		// Then
		assertEquals(0, price, 0.1);

	}

	@Test
	void whenContains1Book_ReturnPrice8() {
		// Given
		Book book1 = new Book("Harry Potter 1", 1);
		Cart cart = new Cart(List.of(book1));

		// When
		double price = cart.getTotalPrice();

		// Then
		assertEquals(8, price, 0.1);

	}

	@Test
	void whenContains2Book_ReturnPrice15_2() {
		// Given
		Book book1 = new Book("Harry Potter 1", 1);
		Book book2 = new Book("Harry Potter 2", 1);
		Cart cart = new Cart(List.of(book1, book2));

		// When
		double price = cart.getTotalPrice();

		// Then
		assertEquals(15.2, price, 0.1);

	}

	@Test
	void whenContains3Book_ReturnPrice21_6() {
		// Given
		Book book1 = new Book("Harry Potter 1", 1);
		Book book2 = new Book("Harry Potter 2", 1);
		Book book3 = new Book("Harry Potter 3", 1);
		Cart cart = new Cart(List.of(book1, book2, book3));

		// When
		double price = cart.getTotalPrice();

		// Then
		assertEquals(21.6, price, 0.1);

	}

	@Test
	void whenContains4Book_ReturnPrice25_6() {
		// Given
		Book book1 = new Book("Harry Potter 1", 1);
		Book book2 = new Book("Harry Potter 2", 1);
		Book book3 = new Book("Harry Potter 3", 1);
		Book book4 = new Book("Harry Potter 4", 1);
		Cart cart = new Cart(List.of(book1, book2, book3, book4));

		// When
		double price = cart.getTotalPrice();

		// Then
		assertEquals(25.6, price, 0.1);

	}

	@Test
	void whenContains5Book_ReturnPrice30() {
		// Given
		Book book1 = new Book("Harry Potter 1", 1);
		Book book2 = new Book("Harry Potter 2", 1);
		Book book3 = new Book("Harry Potter 3", 1);
		Book book4 = new Book("Harry Potter 4", 1);
		Book book5 = new Book("Harry Potter 5", 1);
		Cart cart = new Cart(List.of(book1, book2, book3, book4, book5));

		// When
		double price = cart.getTotalPrice();

		// Then
		assertEquals(30, price, 0.1);

	}

	@Test
	void whenContains3BooksWithTwoTheSame_ReturnPrice23_2() {
		// Given
		Book book1 = new Book("Harry Potter 1", 2);
		Book book2 = new Book("Harry Potter 2", 1);
		Cart cart = new Cart(List.of(book1, book2 ));

		// When
		double price = cart.getTotalPrice();

		// Then
		assertEquals(23.2, price, 0.1);

	}

}