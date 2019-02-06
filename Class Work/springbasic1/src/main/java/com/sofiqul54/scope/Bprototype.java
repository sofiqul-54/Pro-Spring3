package com.sofiqul54.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Bprototype {
    public Bprototype() {
        System.out.println("Prototype Object Created.................");
    }
}
