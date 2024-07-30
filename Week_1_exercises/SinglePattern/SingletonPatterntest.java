package DigitalNuture;

public class SingletonPatterntest {
	
	    public static void main(String[] args) {
	        Logger logger1 = Logger.getInstance();
	        Logger logger2 = Logger.getInstance();

	        // Log messages
	        logger1.log("First message");
	        logger2.log("Second message");

	        // Check if both logger instances are the same
	        if (logger1 == logger2) {
	            System.out.println("Both logger instances are the same.");
	        } else {
	            System.out.println("Logger instances are different.");
	        }
	    }
	}



