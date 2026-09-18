/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author jtwes
 */

public class Person {

    String FirstName;
    String LastName;
    int Age;
    boolean Married;
    Address homeAddress;
    Address localAddress;
    BankAccount bankAccount;
    
    
    
    public Person(){
         homeAddress = new Address();
         localAddress = new Address();
         bankAccount = new BankAccount();
        
       
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public Address getLocalAddress() {
        return localAddress;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public void setMarried(boolean Married) {
        this.Married = Married;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public int getAge() {
        return Age;
    }

    public boolean isMarried() {
        return Married;
    }

}




