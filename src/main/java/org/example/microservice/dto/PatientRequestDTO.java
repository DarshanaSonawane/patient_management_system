package org.example.microservice.dto;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public class PatientRequestDTO {

    @NotBlank(message = "Email is required")
    @Size(max=100,message="name cannot exceed 100 chracterr")
    private  String name;

    @NotBlank(message =  "Date of birth is required")
    @Email(message = "email shoulf be valid")
    private  String email;

    @NotNull(message = "Registered data is required")
    private String registeredDate;


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @NotNull(message = "birth data  data is required")
    private String dateOfBirth;

    @NotNull(message="address could not be null")
    private String address;

    private LocalDate RegisteredDate;

    public void setRegisteredDate(LocalDate registeredDate) {
        RegisteredDate = registeredDate;
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

    public String getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(String registeredDate) {
        this.registeredDate = registeredDate;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

}
