
public class TestStrategy {
     public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        PaymentStrategy CreditCard = new CreditCard("1234-5678-9876-5432");
        context.setPaymentStrategy(CreditCard);
        context.Pay(100.00);


        PaymentStrategy PayPal = new PayPal("abc@example.com");
        context.setPaymentStrategy(PayPal);
        context.Pay(200.00);
}
}
