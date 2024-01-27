package adapterPattern.adaptee;

public class RazorpayPaymentProcessor {

    public void makeRazorPayment() {
        //razorpay implementation
        System.out.println("Making payment using razorpay");
    }

    public void getRazorPayStatus(long id) {
        //razorpay implementation
        System.out.println("Getting payment status for razorpay");
    }

}
