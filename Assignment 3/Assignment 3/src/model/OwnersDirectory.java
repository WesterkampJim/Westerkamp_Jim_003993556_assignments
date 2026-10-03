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
public class OwnersDirectory {
    private ArrayList<Owner> owners;
    
    public OwnersDirectory(){
        this.owners = new ArrayList<Owner>();        
    }
    
    public ArrayList<Owner> getOwners(){
        return owners;
    }
    
    public void setOwner(ArrayList<Owner> accounts){
        this.owners = owners;
    }
    
    public Owner addOwners(){
       Owner s = new Owner();
       owners.add(s);
       return s;
    }
    
    public void deleteOwner(Owner account){
        owners.remove(account);
    }
    
    public Owner searchOwner(String serviceID){
        for(Owner a : owners){
            if(a.getOwnerID().toString().contains(serviceID)){
                return a;
            }
        }
        return null;
    }
    
}
