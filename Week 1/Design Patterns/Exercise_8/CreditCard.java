
public class CreditCard implements PaymentStrategy{
    private String CardNo;

public CreditCard(String CardNo)
{
    this.CardNo=CardNo;
}

public void Pay(double amt)
{
    System.out.println("Paid Rs." + amt + " using Credit Card: " + CardNo);
}
}
