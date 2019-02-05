package com.sofiqul54;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Employee {
    private Long id;
    private String position;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", position='" + position + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @PostConstruct
    public void init() throws Exception{
        System.out.println("Init method after properties are set : " + id + " " + position);
    }

    @PreDestroy
    public void cleanUp() throws Exception{
        System.out.println("Employee is clean Up Now");
    }
}
