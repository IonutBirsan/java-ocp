package org.example.ch45.ex7;

public class CreditCard implements Payable, Refundable {

    public void pay(double amount) {
        System.out.println("Paid " + amount + "$ using Credit Card");
    }


    public void refund(double amount) {
        System.out.println("Refunded " + amount + "$ to Credit Card");
    }
}
