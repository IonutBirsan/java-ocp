package org.example.ch45.ex2;

public class BankApp {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("account1", "Ionut", 5000);
        BankAccount account2 = new BankAccount("account2", "Ionut2", 10000);

        System.out.println(account1.getBalance());
        account1.deposit(1000);
        System.out.println(account1.getBalance());
        account1.withdraw(2000);
        System.out.println(account1.getBalance());

        System.out.println(account2.getBalance());
        account2.deposit(5000);
        System.out.println(account2.getBalance());
        account2.withdraw(10000);
        System.out.println(account2.getBalance());

    }


}
