package DigitalNuture;

public class StripePaymentAdaptor {
	private StripePaymentGateway stripeGateway;

    public StripePaymentAdaptor(StripePaymentGateway stripeGateway) {
        this.stripeGateway = stripeGateway;
    }

    public void processPayment(double amount) {
        stripeGateway.makePayment(amount);
    }

	
}
