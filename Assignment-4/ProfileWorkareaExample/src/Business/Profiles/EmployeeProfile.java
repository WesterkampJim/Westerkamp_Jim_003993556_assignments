/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Profiles;

import Business.Person.Person;

/**
 *
 * @author kal bugrara
 */
public class EmployeeProfile extends Profile {
    ///some attributes for the employee
    String jobTitle;
    boolean isTenured;
    float hourlyWage;

    public String getJobTitle() {
    return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public boolean isTenured() {
        return isTenured;
    }

    public void setTenured(boolean isTenured) {
        this.isTenured = isTenured;
    }

    public float getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(float hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public EmployeeProfile(Person p) {

        super(p); 

    }
    //updated, every employee is not an admin.
    @Override 
    public String getRole(){
        return  "Employee";
    }

    @Override
    public String toString(){

        return getPerson().toString();
    }

}