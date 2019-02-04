package com.sofiqul54;

public class SimpleBean {
    private final String DEFAULT_NAME="Sofiqul Islam";

    private String name = null;
    private  int age = Integer.MIN_VALUE;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "SimpleBean{" +
                "DEFAULT_NAME='" + DEFAULT_NAME + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public  void init(){
        System.out.println("Initializing bean");
        if(name == null){
            System.out.println("Using default bean");
            name = DEFAULT_NAME;
        }
        if(age==Integer.MIN_VALUE){

            throw new IllegalArgumentException("You must set the age property of of type" + SimpleBean.class);
        }
    }
}
