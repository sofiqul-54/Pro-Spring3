/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sofiqul54.ques032;

/**
 *
 * @author sofiqul54
 */
 class Alpha {
    int ns;
    static int s;

    public Alpha(int ns) {
        if(s < ns){
        s = ns;
        this.ns = ns;
        }
    }
    void doPrint(){
        System.out.println("ns = " + ns + " s = " + s);
    }    
}

public class TestA{
    public static void main(String[] args) {
        Alpha ref1 = new Alpha(50);
        Alpha ref2 = new Alpha(125);
        Alpha ref3 = new Alpha(100);
        ref1.doPrint();
        ref2.doPrint();
        ref3.doPrint();
    }
}


