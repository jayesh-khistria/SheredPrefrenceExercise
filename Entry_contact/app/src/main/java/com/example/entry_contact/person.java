package com.example.entry_contact;

import android.widget.ImageView;

public class person {
    String firstname;
    String lastName;

    public person() {
    }

    public person(String firstname, String lastName) {

        this.firstname = firstname;
        this.lastName = lastName;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
