/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Owner
 */
public class TestProgram {
    public static void main(String[] args) {
        Account testAccount = new Account(1122, 20000.0);
        
        testAccount.setAnnualInterestRate(4.5);
        testAccount.withdraw(2500);
        testAccount.deposit(3000);
        
        System.out.println("Balance: " + testAccount.getBalance() + "\nMonthly Interest: " + testAccount.getMonthlyInterest() + "\nDate Created: " + testAccount.getDateCreated());
    }
}
