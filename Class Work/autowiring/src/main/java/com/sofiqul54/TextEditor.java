package com.sofiqul54;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {
    @Autowired
    private SpellChecker spellChecker;

    public void checkSpelling(){
        spellChecker.checkSpelling();
    }
}
