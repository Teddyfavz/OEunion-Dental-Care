package com.favcode.oeuniondentalcare.model;

import lombok.Data;

@Data
public class Contact {
    private String name;
    private String phoneNumber;
    private String email;
    private String subject;
    private String message;
}
