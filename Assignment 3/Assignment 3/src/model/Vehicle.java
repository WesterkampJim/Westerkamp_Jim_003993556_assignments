/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author jtwes
 */
public class Vehicle {
    Integer vehicleID;
    String make;
    String model;
    String registrationNumber;
    int year;
    //enum to keep data consistent.
    String serviceOpted;
    //1 Owner object per Vehicle
    Owner owner;

    
    @Override
    public String toString(){
        return String.valueOf(getVehicleID());
    }
    
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Owner getOwner() {
        return owner;
    }

    public Integer getVehicleID() {
        return vehicleID;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getYear() {
        return year;
    }

    public String getServiceOpted() {
        return serviceOpted;
    }

    public void setVehicleID(Integer vehicleID) {
        this.vehicleID = vehicleID;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setServiceOpted(String serviceOpted) {
        this.serviceOpted = serviceOpted;
    }
    
    
    
}



