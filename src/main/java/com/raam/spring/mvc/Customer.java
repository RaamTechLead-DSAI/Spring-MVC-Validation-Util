package com.raam.spring.mvc;

import jakarta.validation.constraints.*;

public class Customer {
    @NotNull(message="is required")
    @Size(min=2,message="is required")
    private String firstName;
    @NotNull(message="is required")
    @Size(min=2,message="is required")
    private String lastName;

    @Size(min = 10, max = 10, message = "Must be a valid UK number without preceding 0")
    @Pattern(regexp = "\\d{10}", message = "Must be a valid 10-digit UK number")
    private String phoneNumber;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
