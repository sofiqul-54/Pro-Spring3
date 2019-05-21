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
public class Test {
    public static void main(String[] args) {
        int cardVal = 13;
        
        switch (cardVal) {
case 4: case 5: case 6:
case 7: case 8:
System.out.println("Hit");
break;
case 9: case 10: case 11:
System.out.println("Double");
break;
case 15: case 16:
System.out.println("Surrender");
break;
default:
System.out.println("Stand");
}
    }
    
}
