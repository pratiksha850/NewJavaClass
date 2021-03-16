package lab1;

import java.util.Scanner;

public class BankAccount {
    private double balance;
    private double interest;
    public String accountNumber;
    public BankAccount()
    {
        balance = 0;
        interest = 0;
    }

    public BankAccount(double initialBalance, double initialInterest)
    {
        balance = initialBalance;
        interest = initialInterest;
    }

    public void deposit(double amount)
    {
        balance = balance + amount;
    }

    public void withdraw(double amount)
    {
        balance = balance - amount;
    }

    public void addInterest()
    {
        balance = balance + balance * interest;
    }

    public double getBalance()
    {
        return balance;
    }
}
