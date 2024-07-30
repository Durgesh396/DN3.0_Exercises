package DigitalNuture;

public class SquarePaymentAdaptor {
	 private SquarePaymentGateway squareGateway;

	    public SquarePaymentAdaptor(SquarePaymentGateway squareGateway) {
	        this.squareGateway = squareGateway;
	    }

	    public void processPayment(double amount) {
	        squareGateway.executePayment(amount);
	    }

}
