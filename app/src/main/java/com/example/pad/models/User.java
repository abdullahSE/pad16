package com.example.pad.models;

public class User {

    private int id;
    private String email, name, kenteken;

    public User(int id, String email, String name, String kenteken) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.kenteken = kenteken;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getKenteken() {
        return kenteken;
    }
}
