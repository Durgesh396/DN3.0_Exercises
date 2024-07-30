package DigitalNuture;

public class AdapterPatternTest {
	
	    public static void main(String[] args) {
	        // Create adapters for different payment gateways
	        StripePaymentAdaptor stripeProcessor = new StripePaymentAdaptor(new StripePaymentGateway());
	        PayPalPaymentAdaptor payPalProcessor = new PayPalPaymentAdaptor(new PayPalPaymentGateway());
	        SquarePaymentAdaptor squareProcessor = new SquarePaymentAdaptor(new SquarePaymentGateway());

	        // Process payments through different gateways
	        stripeProcessor.processPayment(100.0);
	        payPalProcessor.processPayment(200.0);
	        squareProcessor.processPayment(300.0);
	    }
	}



