package DigitalNuture;

public class StrategyPatternTest {
	
	    public static void main(String[] args) {
	        PaymentContext paymentContext = new PaymentContext();

	        // Pay using Credit Card
	        CreditCardPayment creditCardPayment = new CreditCardPayment("1234-5678-9876-5432", "John Doe");
	        paymentContext.setPaymentStrategy(creditCardPayment);
	        paymentContext.executePayment(250.00);

	        // Pay using PayPal
	        PayPalPayment payPalPayment = new PayPalPayment("john.doe@example.com");
	        paymentContext.setPaymentStrategy(payPalPayment);
	        paymentContext.executePayment(150.00);
	    }
	}





