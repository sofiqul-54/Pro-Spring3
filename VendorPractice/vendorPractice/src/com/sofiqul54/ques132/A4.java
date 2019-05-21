/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sofiqul54.ques132;

/**
 *
 * @author sofiqul54
 */
 class Test {
    public static void main(String[] args) {
        Student[] students = new  Student[3];
        students[1] = new Student("Richard");
        students[1] = new Student("Donald");
        for (Student s  : students) {
            System.out.println(""+s.name);
        }
    }
    
}


