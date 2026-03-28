package com.BLC.ELC;

public class BankApplication {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount();
        acc.setAccountNumber(123456789);
        acc.setAccountHolderName("Pavitra");
        acc.setBalance(5000);

        System.out.println("Account Number: " + acc.getAccountNumber());
        System.out.println("Name: " + acc.getAccountHolderName());
        System.out.println("Balance: " + acc.getBalance());

        // Update balance
        acc.setBalance(8000);
        System.out.println("Updated Balance: " + acc.getBalance());
    }
}