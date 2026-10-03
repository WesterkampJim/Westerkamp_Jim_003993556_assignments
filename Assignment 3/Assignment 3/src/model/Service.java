/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author jtwes
 */
public class Service {
    
    Integer serviceID;
    ServiceType serviceType;
    float cost;
    String mechanicFirstName;
    String mechanicLastName;
    Vehicle vehicle;
    
    ///in Minutes
    int serviceDuration;
    
    @Override
    public String toString(){
        return getServiceID().toString();
    }
    
    public Vehicle getVehical() {
        return vehicle;
    }

    public void setVehical(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    
    public Integer getServiceID() {
        return serviceID;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public float getCost() {
        return cost;
    }

    public String getMechanicFirstName() {
        return mechanicFirstName;
    }

    public String getMechanicLastName() {
        return mechanicLastName;
    }

    public Integer getServiceDuration() {
        return serviceDuration;
    }

    public void setServiceID(int serviceID) {
        this.serviceID = serviceID;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public void setMechanicFirstName(String mechanicFirstName) {
        this.mechanicFirstName = mechanicFirstName;
    }

    public void setMechanicLastName(String mechanicLastName) {
        this.mechanicLastName = mechanicLastName;
    }

    public void setServiceDuration(int serviceDuration) {
        this.serviceDuration = serviceDuration;
    }
    
    
    
    
}
