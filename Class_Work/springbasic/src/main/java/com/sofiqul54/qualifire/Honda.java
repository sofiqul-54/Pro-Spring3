package com.sofiqul54.qualifire;

public class Honda implements Vehicle{

    @Override
    public void start() {
        System.out.println("Honda Started");
    }

    @Override
    public void stop() {
        System.out.println("Honda Stopped");
    }
}
