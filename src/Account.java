
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Owner
 */
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    
    public Account() {
        id = 0;
        balance = 0.0;
        annualInterestRate = 0.0;
        dateCreated = new Date();
    }
    
    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        annualInterestRate = 0.0;
        dateCreated = new Date();
    }
    
    public int getID() {
        return id;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    
    public void setID(int id) {
        this.id = id;
    }
    
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    
    public String getDateCreated() {
        return dateCreated.toString();
    }
    
    public double getMonthlyInterestRate() {
        return annualInterestRate / 12.0;
    }
    
    public double getMonthlyInterest() {
        return balance * (getMonthlyInterestRate() / 100);
    }
    
    public void withdraw(double withdrawal) {
        balance -= withdrawal;
    }
    
    public void deposit(double depositAmount) {
        balance += depositAmount;
    }
}
