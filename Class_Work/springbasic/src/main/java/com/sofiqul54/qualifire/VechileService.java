package com.sofiqul54.qualifire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VechileService {
    @Autowired
    @Qualifier(value = "hondaBean")
    private Vehicle vehicle;

    public void service(){
        vehicle.start();
        vehicle.stop();
    }
}
