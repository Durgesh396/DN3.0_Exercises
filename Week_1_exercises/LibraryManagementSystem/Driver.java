package DigitalNuture;

public class Driver {
	
	    public static void main(String[] args) {
	        Book[] books = {
	            new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald"),
	            new Book("B002", "To Kill a Mockingbird", "Harper Lee"),
	            new Book("B003", "1984", "George Orwell"),
	            new Book("B004", "Pride and Prejudice", "Jane Austen"),
	            new Book("B005", "Moby Dick", "Herman Melville")
	        };

	        Library library = new Library(books);

	        // Linear Search
	        System.out.println("Linear Search for '1984':");
	        Book book = library.linearSearchByTitle("1984");
	        System.out.println(book);

	        // Sort Books for Binary Search
	        library.sortBooksByTitle();

	        // Binary Search
	        System.out.println("\nBinary Search for '1984':");
	        book = library.binarySearchByTitle("1984");
	        System.out.println(book);
	    }
	}



