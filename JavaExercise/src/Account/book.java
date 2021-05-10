package Account;

/**
 *
 * @author Nguyễn Xuân Thành
 */
public class book {

    private String name;
    private double price;
    private int qty = 0;
    private author author;

    public book(String name, double price, author author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public author getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "This book is " + name + ", it is of author " + author.getName() + ", email:" + author.getEmail();

    }
}
