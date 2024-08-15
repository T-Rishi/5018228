
package com.mycompany.adapter;


public class GpayAdapter implements PaymentProcessor {
        private Gpay Gpay;
public GpayAdapter(Gpay Gpay)
{
    this.Gpay  = Gpay;
}

public void ProcessPayment(double amt){
    Gpay.pay(amt);
}    
}
