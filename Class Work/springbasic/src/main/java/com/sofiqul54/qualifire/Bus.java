package com.sofiqul54.qualifire;

import org.springframework.stereotype.Component;

@Component(value = "busBean")
public class Bus implements Vehicle {

    @Override
    public void start() {
        System.out.println("Start BUS");
    }

    @Override
    public void stop() {
        System.out.println("Stopped BUS");
    }
}
