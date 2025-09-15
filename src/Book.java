

public class Book {
    private String title;
    private double weight;
    private double price;
    private double discount = 0.0;

    public void adjustPrice(double adjustment) {
        this.price += adjustment;
    }

    public double priceAfterDiscount() {
        return price - (price * discount);
    }

    public boolean equals(Book other) {
        if (this.title.equals(other.title) && this.weight == other.weight && this.price == other.price) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return "Title: " + title + ", Weight: " + weight + "Price: $" + price + ", Discount: " + discount;
    }

    public Book(String title, double weight, double price, double discount) {
        this.title = title;
        this.weight = weight;
        this.price = price;
        this.discount = discount;
    }
    

    public String getTitle() {
        return title;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscount() {
        return discount;
    }

    public double getDiscountedPrice() {
        return price - (price * discount);
    }

}
