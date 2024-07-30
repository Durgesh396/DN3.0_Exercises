package DigitalNuture;

public class Driver {
	 public static void main(String[] args) {
	        Order[] orders = {
	            new Order("O001", "Alice", 250.50),
	            new Order("O002", "Bob", 150.75),
	            new Order("O003", "Charlie", 300.40),
	            new Order("O004", "David", 100.00),
	            new Order("O005", "Eve", 200.00)
	        };

	        // Bubble Sort
	        System.out.println("Bubble Sort:");
	        SortingAlgorithms.bubbleSort(orders);
	        for (Order order : orders) {
	            System.out.println(order);
	        }

	        // Quick Sort
	        Order[] orders2 = {
	            new Order("O001", "Alice", 250.50),
	            new Order("O002", "Bob", 150.75),
	            new Order("O003", "Charlie", 300.40),
	            new Order("O004", "David", 100.00),
	            new Order("O005", "Eve", 200.00)
	        };

	        System.out.println("\nQuick Sort:");
	        SortingAlgorithms.quickSort(orders2, 0, orders2.length - 1);
	        for (Order order : orders2) {
	            System.out.println(order);
	        }
	    }
	

}
