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


public class StudentProfile extends Profile {


    String NUID;
    //Transcript transcript;
    //   EmploymentHistory employmenthistory;

    public StudentProfile(Person p) {
        super(p);

//        transcript = new Transcript(this);
//        employmenthistory = new EmploymentHistroy();
    }

    public void setNUID(String NUID) {
        this.NUID = NUID;
    }

    public String getNUID() {
        return NUID;
    }

    
    @Override
    public String getRole() {
        return "Student";
    }

    public boolean isMatch(String id) {
        return person.getPersonId().equals(id);
    }
    
        @Override
        public String toString(){
            
            return getNUID();
        }

}
