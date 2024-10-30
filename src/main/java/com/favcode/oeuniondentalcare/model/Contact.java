package com.favcode.oeuniondentalcare.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class Contact {

    @NotBlank(message = "Name cannot be blank")
    @Size(min = 3, message = "Name must be at least 3 character long")
    private String name;

    @NotBlank(message = "Mobile number cannot be blank")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits")
    private String mobileNumber;

    @NotBlank(message = "Email cannot be blank")
    @Email(message = "Please enter a valid email address")
    private String email;

    @NotBlank(message = "Subject cannot be blank")
    @Size(min = 5, message = "Subject must be at least 5 character long")
    private String subject;

    @NotBlank(message = "Message cannot be blank")
    @Size(min = 10, message = "Message must be at least 10 character long")
    private String message;
}
