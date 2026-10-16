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
public class FacultyProfile extends Profile {


//    Transcript transcript;
    //   EmploymentHistroy employmenthistory;

    public FacultyProfile(Person p) {
        super(p);

//        transcript = new Transcript(this);
//        employmenthistory = new EmploymentHistroy();
    }
    
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

    @Override
    public String getRole() {
        return "Faculty";
    }

    public boolean isMatch(String id) {
        return person.getPersonId().equals(id);
    }
    
    @Override
    public String toString(){

        return getPerson().toString();
    }

}
