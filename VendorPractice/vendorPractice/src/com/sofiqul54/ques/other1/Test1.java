/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sofiqul54.ques.other1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sofiqul54
 */
public class Test1 {

    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("Java");
        String s2 = "Loven";
        s1.append(s2);
        s1.substring(4);
        int foundAt = s1.indexOf(s2);
        System.out.println(foundAt);
    }

}
