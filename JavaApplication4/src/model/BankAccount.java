/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author jtwes
 */
public class BankAccount {
    String bankName;
    double currentBalance;
    float yearlyGrowth;
    String pin;
    String accountNumber;
    String personName;

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonName() {
        return personName;
    }
    
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public void setYearlyGrowth(float yearlyGrowth) {
        this.yearlyGrowth = yearlyGrowth;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    
    
    
    public String getBankName() {
        return bankName;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public float getYearlyGrowth() {
        return yearlyGrowth;
    }

    public String getPin() {
        return pin;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    
    
    
    
    
}

