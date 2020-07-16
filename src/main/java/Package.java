import java.util.HashMap;
import java.util.Map;

public class Package {

    private int numberOfBooks;
    static final double UNIT_PRICE = 8;
    static final double DISCOUNT_2_BOOKS = 0.05;
    static final double DISCOUNT_3_BOOKS = 0.10;
    static final double DISCOUNT_4_BOOKS = 0.20;
    static final double DISCOUNT_5_BOOKS = 0.25;

    static Map<Integer,Double> map;
    static {
        map = new HashMap<>();
        map.put(2, DISCOUNT_2_BOOKS);
        map.put(3, DISCOUNT_3_BOOKS);
        map.put(4, DISCOUNT_4_BOOKS);
        map.put(5, DISCOUNT_5_BOOKS);
    }

    public Package(int numberOfBooks) {
        this.numberOfBooks = numberOfBooks;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public void setNumberOfBooks(int numberOfBooks) {
        this.numberOfBooks = numberOfBooks;
    }

    public void addBook() {
        numberOfBooks += 1;
    }

    public double getPrice(){
        double price = numberOfBooks * UNIT_PRICE;

        return applyDiscount(price);
    }

    private double applyDiscount(double price) {

        if (numberOfBooks > 1) {
            price *= 1 - map.get(numberOfBooks);
        }
        return price;
    }
}
