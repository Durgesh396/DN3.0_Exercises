package DigitalNuture;

public class ProxyPatternTest {

	    public static void main(String[] args) {
	        Image image1 = new ProxyImage("http://example.com/image1.jpg");
	        Image image2 = new ProxyImage("http://example.com/image2.jpg");

	        // Display image1
	        System.out.println("First display of image1:");
	        image1.display();
	        System.out.println();

	        // Display image1 again (should use cached image)
	        System.out.println("Second display of image1:");
	        image1.display();
	        System.out.println();

	        // Display image2
	        System.out.println("First display of image2:");
	        image2.display();
	        System.out.println();
	    }
	}



