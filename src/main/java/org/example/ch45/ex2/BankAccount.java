package org.example.ch45.ex2;

public class BankAccount {

    private String accountNumber;
    private String owner;
    private double balance;

    public BankAccount(String accountNumber, String owner, double balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance<0) {
            throw new IllegalArgumentException("Balance cannot be negative");
        }
        this.balance = balance;
    }


    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        if (owner == null || owner.isEmpty()) {
            throw new IllegalArgumentException("Owner cannot be null or empty");
        }
        this.owner = owner;
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        if (accountNumber == null || accountNumber.isEmpty()) {
            throw new IllegalArgumentException("Account number cannot be null or empty");
        }
        this.accountNumber = accountNumber;
    }






    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            throw new IllegalArgumentException("Invalid withdraw amount");
        }
    }
}
