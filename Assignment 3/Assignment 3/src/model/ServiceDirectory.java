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
public class ServiceDirectory {
    private ArrayList<Service> services;
    
    public ServiceDirectory(){
        this.services = new ArrayList<Service>();        
    }
    
    public ArrayList<Service> getServices(){
        return services;
    }
    
    public void setService(ArrayList<Service> accounts){
        this.services = services;
    }
    
    public Service addService(){
       Service s = new Service();
       services.add(s);
       return s;
    }
    
    public void deleteService(Service account){
        services.remove(account);
    }
    
    public Service searchService(String serviceID){
        for(Service a : services){
            if(a.getServiceID().toString().contains(serviceID)){
                return a;
            }
        }
        return null;
    }
    
}
