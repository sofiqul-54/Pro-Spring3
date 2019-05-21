/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sofiqul54.ques.other1;

/**
 *
 * @author sofiqul54
 */
 class SuperClass {

     SuperClass(int x) {
         System.out.println("Super");
     }    
}

public class SubClass extends SuperClass{

     SubClass() {
         super(10);
         System.out.println("Sub 2");
    }

    
    }


