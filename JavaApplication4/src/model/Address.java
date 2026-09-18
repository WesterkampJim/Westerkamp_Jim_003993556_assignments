/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author jtwes
 */
public class Address {
    String streetName;
    String unitNum;
    String city;
    String zipCode;
    String country;
    String personName;

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonName() {
        return personName;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getUnitNum() {
        return unitNum;
    }

    public String getCity() {
        return city;
    }

    public String getZipCode() {
        return zipCode;
    }
    
    public String getCountry() {
        return country;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public void setUnitNum(String unitNum) {
        this.unitNum = unitNum;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    
        public void setCountry(String country) {
        this.country = country;
    }
    
}
