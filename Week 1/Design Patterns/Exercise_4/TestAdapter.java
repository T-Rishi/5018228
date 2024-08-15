
package com.mycompany.adapter;


public class TestAdapter {
    public static void main (String args[])
    {
        Paytm Paytm = new  Paytm();
        Gpay Gpay = new Gpay();
        
        PaymentProcessor PaytmProcessor = new PaytmAdapter(Paytm) ;
        PaymentProcessor GpayProcessor = new GpayAdapter(Gpay);
        
        PaytmProcessor.ProcessPayment(120.75);
        GpayProcessor.ProcessPayment(160.56);
    }
    
}
