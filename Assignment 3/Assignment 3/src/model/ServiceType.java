/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author jtwes
 */

import java.util.ArrayList;

public class ServiceType {
 private ArrayList<String> serviceTypes;

    public ServiceType() {
        serviceTypes = new ArrayList<>();
        serviceTypes.add("Oil Change");
        serviceTypes.add("Car Wash");
        serviceTypes.add("Puncture");
    }


    public ArrayList<String> getServiceTypes() {
        return serviceTypes;
    }

    public void addServiceType(String serviceType) {
        serviceTypes.add(serviceType);
    }

    public void removeServiceType(String serviceType) {
        serviceTypes.remove(serviceType);
    }
}

