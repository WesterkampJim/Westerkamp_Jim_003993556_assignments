/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccounts;

import Business.Profiles.Profile;
import java.util.Date;



/**
 *
 * @author kal bugrara
 */
public class UserAccount {
    
    Profile profile;
    String username;
    String password;
    Date lastAccessed;
    Date lastUpdated;
    String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    public UserAccount (Profile profile, String un, String pw){
        username = un;
         password = pw;
         this.profile = profile;
        lastAccessed = new Date();
        lastUpdated = new Date();
    }
    
    public void recordAccess() {
        lastAccessed = new Date();
    }
    
    public Date getLastAccessed() {
    return lastAccessed;
    }

    public void setLastAccessed(Date lastAccessed) {
        this.lastAccessed = lastAccessed;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
    
    public void setUserName(String username) {
        this.username = username;
        lastUpdated = new Date();
    }

    public void setPassword(String password) {
        this.password = password;
        lastUpdated = new Date();
    }
    
    public String getPersonId(){
        return profile.getPerson().getPersonId();
    }
    public String getUserLoginName(){
        return username;
    }

        public boolean isMatch(String id){
        if(getPersonId().equals(id)) return true;
        return false;
    }
    public boolean IsValidUser(String un, String pw){

        if (username.equalsIgnoreCase(un) && password.equals(pw)) return true;
        else return false;

    }
    public String getRole(){
        return profile.getRole();
    }

    public Profile getAssociatedPersonProfile(){
        return profile;
    }


    public void setAssociatedPersonProfile(Profile p){
        lastUpdated = new Date();
        this.profile = p;
    }
        
    @Override
        public String toString(){
            
            return getUserLoginName();
        }
        
}

