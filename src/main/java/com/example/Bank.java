package com.example;

// Starter code for Bank class
public class Bank {
    // Attributes
    private String bankName;
    private String accountHolderName;
    private String accountNumber;
    private double balance;

    // Add a constructor here
    public Bank(String bankName, String accountHolderName, String accountNumber, double balance) {
        this.bankName = bankName;
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Bank Name :" + bankName);
        System.out.println("Holder Name :" + accountHolderName);
        System.out.println("Account Number :" + accountNumber);
        System.out.println("Account Balance :" + balance);
        // TODO: Implement this method
    }

    // Method to deposit money
    public void deposit(double amount) {
        this.balance = this.balance + amount;
        System.out.println("After Deposit " + amount + " Total Balance is : " + this.balance);
        // TODO: Implement this method
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        this.balance -= amount;
        System.out.println("After Withdraw " + amount + " Total Balance is :" + this.balance);
        // TODO: Implement this method
    }
}
