package DigitalNuture;

public class Driver {

	public static void main(String[] args) {
		 InventorySystem inventorySystem = new InventorySystem();

	        // Adding products
	        Product product1 = new Product("P001", "Laptop", 10, 999.99);
	        Product product2 = new Product("P002", "Smartphone", 20, 499.99);
	        inventorySystem.addProduct(product1);
	        inventorySystem.addProduct(product2);

	        // Display products
	        System.out.println("After adding products:");
	        System.out.println(inventorySystem.getProduct("P001"));
	        System.out.println(inventorySystem.getProduct("P002"));

	        // Updating product
	        Product updatedProduct1 = new Product("P001", "Laptop", 15, 949.99);
	        inventorySystem.updateProduct("P001", updatedProduct1);

	        // Display updated product
	        System.out.println("\nAfter updating product P001:");
	        System.out.println(inventorySystem.getProduct("P001"));

	        // Deleting a product
	        inventorySystem.deleteProduct("P002");

	        // Display products after deletion
	        System.out.println("\nAfter deleting product P002:");
	        System.out.println(inventorySystem.getProduct("P001"));
	        System.out.println(inventorySystem.getProduct("P002"));

	}

}
