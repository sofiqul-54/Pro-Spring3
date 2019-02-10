package com.sofiqul54.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope
public class Asingleton {
    public Asingleton() {
        System.out.println("Singleton Object Created.....");
    }
}
