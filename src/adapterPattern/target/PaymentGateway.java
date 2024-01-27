package adapterPattern.target;

public interface PaymentGateway {

    public void makePayment();
    public void getStatus(long id);

}
