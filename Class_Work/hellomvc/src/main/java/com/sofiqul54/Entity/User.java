package com.sofiqul54.Entity;

public class User {
    private Long id;
    private String username;
    private String mobile;

    public User() {
    }

    public User(Long id, String username, String mobile) {
        this.id = id;
        this.username = username;
        this.mobile = mobile;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
