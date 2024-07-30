package DigitalNuture;

public class PayPalPaymentAdaptor {
	private PayPalPaymentGateway payPalGateway;

    public PayPalPaymentAdaptor(PayPalPaymentGateway payPalGateway) {
        this.payPalGateway = payPalGateway;
    }

    public void processPayment(double amount) {
        payPalGateway.sendPayment(amount);
    }
}


