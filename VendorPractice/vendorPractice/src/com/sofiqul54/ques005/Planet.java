/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sofiqul54.ques005;

/**
 *
 * @author sofiqul54
 */
abstract class Planet {

    protected void revolve() {
    }

    abstract void rotate();
}

class Earth extends Planet {

    public void revolve() { //protected void revolve()

    }

    protected void rotate() {
    }
}
