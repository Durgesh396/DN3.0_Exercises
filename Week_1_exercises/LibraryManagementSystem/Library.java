package DigitalNuture;

import java.util.Arrays;
import java.util.Comparator;

public class Library {
	
	    private Book[] books;

	    public Library(Book[] books) {
	        this.books = books;
	    }

	    public Book linearSearchByTitle(String title) {
	        for (Book book : books) {
	            if (book.getTitle().equalsIgnoreCase(title)) {
	                return book;
	            }
	        }
	        return null;
	    }

	    // Utility method to sort books by title for binary search
	    public void sortBooksByTitle() {
	        Arrays.sort(books, Comparator.comparing(Book::getTitle));
	    }

	    public Book binarySearchByTitle(String title) {
	        int left = 0;
	        int right = books.length - 1;

	        while (left <= right) {
	            int mid = left + (right - left) / 2;
	            int comparison = books[mid].getTitle().compareToIgnoreCase(title);

	            if (comparison == 0) {
	                return books[mid];
	            }

	            if (comparison < 0) {
	                left = mid + 1;
	            } else {
	                right = mid - 1;
	            }
	        }
	        return null;
	    }
	}


