package org.example.ch45.ex7;

public class Crypto implements Payable, Refundable {

    public void pay(double amount) {
        System.out.println("Paid " + amount + "$ using Crypto");
    }


    public void refund(double amount) {
        System.out.println("Refunded " + amount + "$ to Crypto Wallet");
    }

}
