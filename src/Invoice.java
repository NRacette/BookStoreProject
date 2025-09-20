/* 
* Invoice class to hold customer name and array of books being purchased. 
* Includes methods to calculate total amount, discounted total, and total weight of books.
* Also includes methods to add books, adjust prices, and apply discounts.
*/
public class Invoice {
    String customerName;
    Book[] books;
    static final int MAX_BOOKS = 3;
    static final double TAX_RATE = 7.5; 


    // Default constructor
    public Invoice() {
        this.customerName = "";
        this.books = new Book[MAX_BOOKS];
    }

     //Constructor to create a new Invoice.
    public Invoice(String customerName) {
        this.customerName = customerName;
        this.books = new Book[MAX_BOOKS]; // Create books array with 3 positions
    }

    // Method to calculate total amount of all books being purchased
    public double getTotalAmount() {
        double total = 0.0;
        for (Book book : books) {
            if (book != null) {
                total += book.priceAfterDiscount();
            }
        }
        return total;
    }

    // Method to calculate total discounted amount of all books being purchased
    public double getDiscountedTotal() {
        double discountedTotal = 0.0;
        for (Book book : books) {
            if (book != null) {
                discountedTotal += book.getDiscountedPrice();
            }
        }
        return discountedTotal;
    }

    // Method to calculate total weight of all books being purchased
    public double getTotalWeight() {
        double totalWeight = 0.0;
        for (Book book : books) {
            if (book != null) {
                totalWeight += book.getWeight();
            }
        }
        return totalWeight;
    }

    // Method to add a book to the invoice
    public void addBook(String title, double price, double weight) throws Exception {
    for (int i = 0; i < books.length; i++) {
        if (books[i] == null) {
            books[i] = new Book(title, weight, price);
            return; 
        }
    }
    throw new Exception("Cannot add more than " + MAX_BOOKS + " books.");
}

    // Method to adjust price of books by its position in the array
    public void adjustPrice(int bookNum, double priceAdjustment) throws Exception {
        int i = bookNum - 1; 
        if (i < 0 || i >= MAX_BOOKS || books[i] == null) {
            throw new Exception("Over max book amount: " + bookNum);
        }
        books[i].adjustPrice(priceAdjustment);
    }

    // Method to apply discount to books by its position in the array
    public void applyDiscount(int bookNum, double discount) throws Exception {
        int i = bookNum - 1; 
        if (i < 0 || i >= MAX_BOOKS || books[i] == null) {
            throw new Exception("Over max book amount: " + bookNum);
        }
        books[i].setDiscount(discount);
    }
    // Method to calculate tax on the total amount
    public double calculateTax(double amount) {
        double taxAmount = amount * (TAX_RATE / 100.0);
        return taxAmount;
    }

    // Override toString method to provide a string representation of the Invoice
    @Override
    public String toString() {
        String output = "Customer: " + customerName + "\n\n";
        output += "Books Purchased:\n";
        
        for (Book book : books) {
            if (book != null) {
                output += book.toString() + "\n";
            }
        }
        // Calculate totals for the invoice
        double totalBeforeDiscount = getTotalAmount();
        double totalAfterDiscount = getDiscountedTotal();
        double taxAmount = calculateTax(totalAfterDiscount);
        double overallCost = totalAfterDiscount + taxAmount;
        //Add formatted totals to the output string
        output += String.format("Total Weight: %.2f lbs\n\n", getTotalWeight());
        output += String.format("Subtotal: $%.2f\n", totalBeforeDiscount);
        output += String.format("Subtotal Discounted: $%.2f\n", totalAfterDiscount);
        output += String.format("Tax (%.1f%%): $%.2f\n", TAX_RATE, taxAmount);
        output += String.format("TOTAL DUE: $%.2f\n", overallCost);
        return output;
    }
    //Customer Name getter method
    public String getCustomerName() {
        return customerName;
    }

    //Book getter method
    public Book[] getBooks() {
        return books;
    }

    //Customer Name setter method
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    //Book setter method
    public void setBooks(Book[] books) {
        this.books = books;
    }
}
