public class Invoice {
    String customerName;
    Book[] books;

    public Invoice(String customerName, Book[] books) {
        this.customerName = customerName;
        this.books = books;
    }

    public double getTotalAmount() {
        double total = 0.0;
        for (Book book : books) {
            total += book.priceAfterDiscount();
        }
        return total;
    }

    public double getDiscountedTotal() {
        double discountedTotal = 0.0;
        for (Book book : books) {
            discountedTotal += book.getDiscountedPrice();
        }
        return discountedTotal;
    }

    public double getTotalWeight() {
        double totalWeight = 0.0;
        for (Book book : books) {
            totalWeight += book.getWeight();
        }
        return totalWeight;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }
}
