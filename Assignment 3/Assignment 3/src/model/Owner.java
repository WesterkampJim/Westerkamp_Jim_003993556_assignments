/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.time.LocalDateTime;
/**
 *
 * @author jtwes
 */
public class Owner {
    String ownerID;
    String ownerFirstName;
    String ownerLastName;
    
    //use JDatePicker with this
    LocalDateTime serviceDate;

    ///change the name of the object to the ownerID when java tries to show the "string name" of the object.
    @Override
    public String toString(){
        return getOwnerID();
    }
    
    public String getOwnerID() {
        return ownerID;
    }

    public String getOwnerFirstName() {
        return ownerFirstName;
    }

    public String getOwnerLastName() {
        return ownerLastName;
    }

    public LocalDateTime getServiceDate() {
        return serviceDate;
    }

    public void setOwnerID(String ownerID) {
        this.ownerID = ownerID;
    }

    public void setOwnerFirstName(String ownerFirstName) {
        this.ownerFirstName = ownerFirstName;
    }

    public void setOwnerLastName(String ownerLastName) {
        this.ownerLastName = ownerLastName;
    }

    public void setServiceDate(LocalDateTime serviceDate) {
        this.serviceDate = serviceDate;
    }
    
    
    
}
