package com.example.backend.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class User {

    private final UUID user_id;
    private final String firstName, lastname, address;
    private final int mobile;

    //Binding the User's information to a JSON identifier
    public User(
            @JsonProperty("id") UUID user_id,
            @JsonProperty("firstName") String firstName,
            @JsonProperty("lastName") String lastname,
            @JsonProperty("address") String address,
            @JsonProperty("mobile") int mobile)
    {
        this.user_id = user_id;
        this.firstName = firstName;
        this.lastname = lastname;
        this.address = address;
        this.mobile = mobile;
    }

    public UUID getUser_id() {
        return user_id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public String getAddress() {
        return address;
    }

    public int getMobile() {
        return mobile;
    }
}
