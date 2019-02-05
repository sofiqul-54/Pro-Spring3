package com.sofiqul54;

public class Employee {
    private  Long id;
    private String position;

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

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", position='" + position + '\'' +
                '}';
    }

    public void init() throws Exception{
        System.out.println("Init method make initial :" + id + position);
    }

    public void cleanUp() throws Exception{
        System.out.println("I am now Clean Up now");
    }
}
