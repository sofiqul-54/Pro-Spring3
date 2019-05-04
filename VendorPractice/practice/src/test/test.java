/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;

/**
 * @author sofiqul54
 */
public class test {
    public static void main(String[] args) {
        ArrayList<Integer> points = new ArrayList<>();
        points.add(1);
        points.add(2);
        points.add(3);
        points.add(4);
        points.add(null);
        points.remove(2);
        points.remove(null);
        System.out.println(points);
    }

}
