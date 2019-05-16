/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sofiqul54.ques008;

/**
 *
 * @author sofiqul54
 */
public class Customer {
    
    ElectricAccount acct = new ElectricAccount();

    public void useElectricity(double kWh) {
        acct.addKWh(kWh);
    }
    
    
}

class ElectricAccount {
    
    private double kWh;
    private double rate = 0.07;
    private double bill;
    
    public void addKWh(double kWh) {
        if (kWh > 0) {
            this.kWh += kWh;
            this.bill = this.kWh * rate;
        }
    }
    
  
    
}
