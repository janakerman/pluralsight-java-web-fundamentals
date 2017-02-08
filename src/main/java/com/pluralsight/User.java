package com.pluralsight;

/**
 * Created by jakerman on 08/02/2017.
 */
public class User {

    private String name;
    private String email;

    public User() {}

    public User(String _name, String _email) {
        this.name = _name;
        this.email = _email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
