
public class PayPal implements PaymentStrategy {
    private String email ;
    
    public PayPal (String email)
    {
        this.email = email;
    }
    
    @Override
    
    public void Pay(double amt)
    {
         System.out.println("Paid Rs. " + amt + " using PayPal: " + email);
    }
    
}
