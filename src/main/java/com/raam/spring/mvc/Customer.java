package com.raam.spring.mvc;

import jakarta.validation.constraints.*;

public class Customer {
    @NotNull(message="is required")
    @Size(min=2,message="is required")
    private String firstName;
    @NotNull(message="is required")
    @Size(min=2,message="is required")
    private String lastName;

    //@Size(min = 10, max = 10, message = "Must be a valid UK number without preceding 0")
    @Pattern(regexp = "\\d{10}", message = "Must be a valid 10-digit UK number")
    private String phoneNumber;

    @Pattern(regexp = "^(?i)[A-Z]{1,2}\\d[A-Z\\d]? ?\\d[A-Z]{2}$", message = "Enter valid UK postcode")
    private String postCode;

    @NotNull(message = "Date of Birth cannot be null")
    @Pattern(regexp = "^\\d{2}/\\d{2}/\\d{4}$", message = "Enter Date of Birth in the format dd/MM/yyyy")
    private String dateOfBirth;

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

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

}
