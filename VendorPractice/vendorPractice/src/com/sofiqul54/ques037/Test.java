/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sofiqul54.ques037;

/**
 *
 * @author sofiqul54
 */
public class Test {
    public static void main(String[] args) {
        double discount = 0;
        int qty = Integer.parseInt(args[0]);
        
        if(qty>=90){discount = 0.5;}
        if(qty>80 && qty<90){discount = 0.2;}
        
        discount = (qty>=90) ? 0.5 : (qty>80) ? 0.2 : 0;
    }
    
}
