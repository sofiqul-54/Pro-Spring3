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
public class Programmer extends Writer {

    public static void write() {
        System.out.println("Writing code");
    }
    
    public static void main(String[] args) {
        Writer w = new Programmer();
        w.write();
    }
}
