public class Driver {
    public static void main(String[] args) throws Exception {
        Book book1 = new Book("Book1", 1.2, 10.0, 0.15);
        Book book2 = new Book("Book2", 1.5, 15.0, 0.10);
        Book book3 = new Book("Book3", 1.3, 12.0, 0.20);

        Book[] books = {book1, book2, book3};

        Invoice invoice = new Invoice("Nick Racette", books);

        System.out.println("Customer Name: " + invoice.getCustomerName());
        System.out.println("Books Purchased:");
        for (Book book : invoice.getBooks()) {
            System.out.println(book);
            System.out.println("Price after discount: $" + book.priceAfterDiscount());
        }

    }
}
