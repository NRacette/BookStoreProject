/* 
 * Book class to hold information about a book, including title, weight, price, and discount. 
 * Includes methods to adjust price, calculate price after discount, and override equals and toString methods.
 */
public class Book {
    private String title;
    private double weight;
    private double price;
    private double discount;

    // Default constructor
    public Book() {
        this.title = "";
        this.weight = 0.0;
        this.price = 0.0;
        this.discount = 0.0;
    }

    //Constructor to create a new Book.
    public Book(String title, double weight, double price) {
        this.title = title;
        this.weight = weight;
        this.price = price;
        this.discount = 0.0; // Default discount is 0%
    }
    
    // Method to adjust the price of the book by a specified amount
    public double adjustPrice(double adjustment) {
        double adjustedPrice = this.price += adjustment;
        return adjustedPrice;
    }
    // Method to calculate the price after applying the discount
    public double priceAfterDiscount() {
        double discountedAmount = this.price * this.discount;
        double finalPrice = this.price - discountedAmount;
        return finalPrice;
    }
    // Equals method to compare two Book objects using title, weight, and price values
    public boolean equals(Book other) {
        if (this.title.equals(other.title) && this.weight == other.weight && this.price == other.price) {
            return true;
        } else {
            return false;
        }
    }
    // Override toString method to provide a string representation of the Book object
    @Override
    public String toString() {
        return "Title: " + title + ", Weight: " + weight + " lbs, Price: $" + price + ", Discount: " + discount;
    }
    // Getter title method
    public String getTitle() {
        return title;
    }
    // Getter weight method
    public double getWeight() {
        return weight;
    }
    // Getter price method
    public double getPrice() {
        return price;
    }
    // Getter discount method
    public double getDiscount() {
        return discount;
    }
    // Getter discounted price method
    public double getDiscountedPrice() {
        return price - (price * discount);
    }
    // Setter methods for title
    public void setTitle(String title) {
        this.title = title;
    }
    // Setter methods for weight
    public void setWeight(double weight) {
        this.weight = weight;
    }
    // Setter methods for price
    public void setPrice(double price) {
        this.price = price;
    }
    // Setter methods for discount
    public void setDiscount(double discountPercentage) {
    this.discount = discountPercentage / 100.0;
    }

}
