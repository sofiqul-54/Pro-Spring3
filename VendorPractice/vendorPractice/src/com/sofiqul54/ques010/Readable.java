/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sofiqul54.ques010;

/**
 *
 * @author sofiqul54
 */
public interface Readable {

    public void readBook();

    public void setBookMark();
}

abstract class Book implements Readable {

    public void readBook() {
    }
}

 abstract class BBook extends Book {

    public void readBook() {
    }

    public void setBookMark() {
    }
}
