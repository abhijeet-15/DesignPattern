package adapterPattern.adapter;

import adapterPattern.adaptee.StripePaymentProcessor;
import adapterPattern.target.PaymentGateway;

public class StripePaymentAdapter implements PaymentGateway {

    private StripePaymentProcessor stripePaymentProcessor;
    public StripePaymentAdapter(StripePaymentProcessor stripePaymentProcessor) {
        this.stripePaymentProcessor = stripePaymentProcessor;
    }

    @Override
    public void makePayment() {
        this.stripePaymentProcessor.makeStripePayment();
    }

    @Override
    public void getStatus(long id) {
        this.stripePaymentProcessor.getStripePayment(id);
    }
}
