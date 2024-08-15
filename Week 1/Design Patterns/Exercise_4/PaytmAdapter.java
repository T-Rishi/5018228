
package com.mycompany.adapter;



public  class PaytmAdapter implements PaymentProcessor {
    private Paytm paytm;
public PaytmAdapter(Paytm paytm)
{
    this.paytm = paytm;
}
public void ProcessPayment(double amt){
    paytm.pay(amt);
}
}
