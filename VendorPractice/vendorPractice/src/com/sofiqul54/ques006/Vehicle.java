/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sofiqul54.ques006;

/**
 *
 * @author sofiqul54
 */
public class Vehicle {

    String type = "4w";
    int maxSpeed = 100;

    Vehicle(String type, int maxSpeed) {
        this.type = type;
        this.maxSpeed = maxSpeed;
    }
}

class Car extends Vehicle {

    String trans;

    public Car(String type, int maxSpeed) {
        super(type, maxSpeed);
    }

    public Car(String trans, String type, int maxSpeed) {
        super(type, maxSpeed);
        this.trans = trans;
    }

    public static void main(String[] args) {
        Car c1 = new Car("4w", 150);
        Car c2 = new Car("manual", "4w", 150);
        System.out.println(c1.type+" "+c1.maxSpeed);
        System.out.println(c2.type+" "+c2.maxSpeed+" "+c2.trans);
    }
}
