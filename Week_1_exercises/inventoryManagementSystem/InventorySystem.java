package DigitalNuture;


	import java.util.HashMap;
	import java.util.Map;

	public class InventorySystem {
	    private Map<String, Product> inventory = new HashMap<>();

	    // Add a Product
	    public void addProduct(Product product) {
	        inventory.put(product.getProductId(), product);
	    }

	    // Update a Product
	    public void updateProduct(String productId, Product updatedProduct) {
	        if (inventory.containsKey(productId)) {
	            inventory.put(productId, updatedProduct);
	        } else {
	            System.out.println("Product not found.");
	        }
	    }

	    // Delete a Product
	    public void deleteProduct(String productId) {
	        if (inventory.containsKey(productId)) {
	            inventory.remove(productId);
	        } else {
	            System.out.println("Product not found.");
	        }
	    }

	    // Get a Product
	    public Product getProduct(String productId) {
	        return inventory.get(productId);
	    }
	}



