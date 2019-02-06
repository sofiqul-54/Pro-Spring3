package com.sofiqul54.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Address {
    private String hoseNo;
    private String country;

    public Address() {
        System.out.println("Object Created.....................");
    }

    public String getHoseNo() {
        return hoseNo;
    }

    public void setHoseNo(String hoseNo) {
        this.hoseNo = hoseNo;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void show(){
        System.out.println("Show...........");
    }
}
