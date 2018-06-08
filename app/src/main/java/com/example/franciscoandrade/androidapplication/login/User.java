package com.example.franciscoandrade.androidapplication.login;

public class User {
    private int id;
    private String firstName;
    private String latName;

    public User( String firstName, String latName) {

        this.firstName = firstName;
        this.latName = latName;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLatName() {
        return latName;
    }

    public void setLatName(String latName) {
        this.latName = latName;
    }
}
