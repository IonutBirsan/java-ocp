package org.example.ch45.ex7;

public class Paypal implements Payable, Refundable {

    public void pay(double amount) {
        System.out.println("Paid " + amount + "$ using Paypal");
    }


    public void refund(double amount) {
        System.out.println("Refunded " + amount + "$ to paypal");
    }
}
