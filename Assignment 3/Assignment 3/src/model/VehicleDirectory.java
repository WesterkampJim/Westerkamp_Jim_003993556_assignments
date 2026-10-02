/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author jtwes
 */
public class VehicleDirectory {
    private ArrayList<Vehicle> services;
    
    public VehicleDirectory(){
        this.services = new ArrayList<Vehicle>();        
    }
    
    public ArrayList<Vehicle> getVehicles(){
        return services;
    }
    
    public void setVehicle(ArrayList<Vehicle> accounts){
        this.services = services;
    }
    
    public Vehicle addVehicle(){
       Vehicle s = new Vehicle();
       services.add(s);
       return s;
    }
    
    public void deleteVehicle(Vehicle account){
        services.remove(account);
    }
    
    public Vehicle searchVehicle(String serviceID){
        for(Vehicle a : services){
            if(a.getVehicleID().contains(serviceID)){
                return a;
            }
        }
        return null;
    }
}
