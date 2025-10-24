package org.example.ch45.ex7;

public class Main {

    public static void main(String[] args) {

        CreditCard creditCard = new CreditCard();
        Paypal paypal = new Paypal();
        Crypto crypto = new Crypto();

        processPayment(creditCard, 10.0);
        processPayment(paypal, 20.0);
        processPayment(crypto, 30.0);

        processRefund(creditCard, 5.0);
        processRefund(paypal, 10.0);
        processRefund(crypto, 15.0);

    }

    public static void processPayment(Payable payable, double amount) {
        payable.pay(amount);
    }

    public static void processRefund(Refundable refundable, double amount) {
        refundable.refund(amount);
    }
}
