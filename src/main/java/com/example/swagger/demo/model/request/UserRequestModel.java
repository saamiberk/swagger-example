package com.example.swagger.demo.model.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Details about the user")
public class UserRequestModel {

    @ApiModelProperty(notes = "The person's name")
    private String firstName;
    @ApiModelProperty(notes = "The person's surname")
    private String lastName;
    @ApiModelProperty(notes = "The person's email, must be unique")
    private String email;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
