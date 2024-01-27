package adapterPattern.adapter;

import adapterPattern.adaptee.RazorpayPaymentProcessor;
import adapterPattern.target.PaymentGateway;

public class RazorPayPaymentAdapter implements PaymentGateway {

    public RazorpayPaymentProcessor razorpayPaymentProcessor;

    public RazorPayPaymentAdapter(RazorpayPaymentProcessor razorpayPaymentProcessor) {
        this.razorpayPaymentProcessor = razorpayPaymentProcessor;
    }

    @Override
    public void makePayment() {
        this.razorpayPaymentProcessor.makeRazorPayment();
    }

    @Override
    public void getStatus(long id) {
        this.razorpayPaymentProcessor.getRazorPayStatus(id);
    }
}
