
public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void Pay(double amt) {
        if (paymentStrategy != null) {
            paymentStrategy.Pay(amt);
        } else {
            System.out.println("Please select a payment method first.");
        }
    }
}
