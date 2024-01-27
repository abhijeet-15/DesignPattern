package adapterPattern;

import adapterPattern.adaptee.RazorpayPaymentProcessor;
import adapterPattern.adaptee.StripePaymentProcessor;
import adapterPattern.adapter.RazorPayPaymentAdapter;
import adapterPattern.adapter.StripePaymentAdapter;

public class Main {

    public static void main(String[] args) {

        // Using Razorpay through the adapter
        RazorpayPaymentProcessor razorpayPaymentProcessor = new RazorpayPaymentProcessor();
        RazorPayPaymentAdapter rAdapter = new RazorPayPaymentAdapter(razorpayPaymentProcessor);
        rAdapter.makePayment();
        rAdapter.getStatus(12);

        // Using Stripe through the adapter
        StripePaymentProcessor stripePaymentProcessor = new StripePaymentProcessor();
        StripePaymentAdapter sAdapter = new StripePaymentAdapter(stripePaymentProcessor);
        sAdapter.makePayment();
        sAdapter.getStatus(15);

    }
}
