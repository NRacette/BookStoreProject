/**
 * Description: This program creates a bookstore with invoices where users can input books with details and receive an invoice.
 *
 * INPUT:
 * 		Constants:
 * 			MAXBOOKS define the most books a person can check out.
 * 		User input:
 * 			title of book
 * 			price of book
 * 			weight of book
 *          discount of book
 *
 * 	COMPUTATION:
 * 		1. Creates a Book objectwith details for each book that user inputs in an array.
 * 		2. Create an Invoice object with the customer's name and the array of books associated.
 * 		3. Calculates total amount, discounted total, and total weight of the books.
 *
 * 	OUTPUT:
 * 		Prints out the invoice with customer name, book titles, weights, prices, discounts, and total amounts.
 * 	
 * 	@author: Nick Racette
 * 	@contact: Nick.Racette@go.minnestate.edu
 * 	@since: 9/21/2024
 * 
 * 	Course: CSCI 2082-70 Data Structures and Algorithms
 *
 * 	Institution: Century College
 * 
 * 	Instructor: Mathew Nyamgawa
 */

 // Driver class to test Book object creation and returning values with invoice.
public class Driver {
    public static void main(String[] args) throws Exception {
        // Create two Invoices with customer names
        Invoice invoice1 = new Invoice("Nick Racette");
        Invoice invoice2 = new Invoice("John Doe");
        
        // Add books to the invoices book array
        invoice1.addBook("Ikigai", 10.0, 1.2);
        invoice1.addBook("The Alchemist", 15.0, 1.5);
        invoice1.addBook("Atomic Habits", 12.0, 1.3);

        invoice2.addBook("Why We Sleep", 14.0, 1.4);
        invoice2.addBook("Deep Work", 11.0, 1.1);

        // Apply discounts 
        invoice1.applyDiscount(1, 10);
        invoice1.applyDiscount(2, 20);

        invoice2.applyDiscount(1, 10);
        invoice2.applyDiscount(2, 20);

        invoice1.adjustPrice(3, 2.00);

        System.out.println("Invoices");
        System.out.println(invoice1.toString());
        System.out.println(invoice2.toString());

        System.out.println("Invoices");
        System.out.println(invoice1.toString());
        System.out.println(invoice2.toString());
        System.out.println("\n================ END OF PROGRAM ================");

    }
}
