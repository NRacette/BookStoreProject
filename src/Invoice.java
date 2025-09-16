public class Invoice {
    String customerName;
    Book[] books;

    public Invoice(String customerName, Book[] books) {
        this.customerName = customerName;
        this.books = books;
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
