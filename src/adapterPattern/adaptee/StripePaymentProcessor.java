package adapterPattern.adaptee;

public class StripePaymentProcessor {

    public void makeStripePayment() {
        //razorpay implementation
        System.out.println("Making payment using stripe");
    }

    public void getStripePayment(long id) {
        //razorpay implementation
        System.out.println("Getting payment status for stripe");
    }

}
