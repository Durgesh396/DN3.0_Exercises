package DigitalNuture;

import java.util.Arrays;
import java.util.Comparator;

public class SearchAlgorithms {//linear search implementation
	

	    public static Product linearSearch(Product[] products, String productName) {
	        for (Product product : products) {
	            if (product.getProductName().equals(productName)) {
	                return product;
	            }
	        }
	        return null;
	    }
	
//binary search implementation
public static Product binarySearch(Product[] products, String productName) {
    Arrays.sort(products, Comparator.comparing(Product::getProductName));
    int left = 0;
    int right = products.length - 1;

    while (left <= right) {
        int mid = left + (right - left) / 2;
        int comparison = products[mid].getProductName().compareTo(productName);

        if (comparison == 0) {
            return products[mid];
        } else if (comparison < 0) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }
    return null;
}
}



