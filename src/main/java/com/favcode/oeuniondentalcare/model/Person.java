package com.favcode.oeuniondentalcare.model;

import com.favcode.oeuniondentalcare.annotation.FieldValueMatch;
import com.favcode.oeuniondentalcare.annotation.PasswordValidator;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

@Data
@Entity
@FieldValueMatch.List({
        @FieldValueMatch(
                field = "pwd",
                fieldMatch = "confirmPwd",
                message = "Password does not match!"
        ),
        @FieldValueMatch(
                field = "email",
                fieldMatch = "confirmEmail",
                message = "Email address does not match!"
        )
})
public class Person extends BaseEntity{

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO,generator="native")
    @GenericGenerator(name = "native",strategy = "native")
    private int personId;

    @NotBlank(message="Name cannot be blank")
    @Size(min=3, message="Name must be at least 3 characters long")
    private String name;

    @NotBlank(message="Mobile number cannot be blank")
    @Pattern(regexp="(^$|[0-9]{10})",message = "Mobile number must be 10 digits")
    private String mobileNumber;

    @NotBlank(message="Email cannot be blank")
    @Email(message = "Please provide a valid email address" )
    private String email;

    @NotBlank(message="Please confirm email address!")
    @Email(message = "Please provide a valid confirm email address" )
    @Transient
    private String confirmEmail;

    @NotBlank(message="Password cannot be blank")
    @Size(min=5, message="Password must be at least 5 characters long")
    @PasswordValidator
    private String pwd;

    @NotBlank(message="Please confirm password!")
    @Size(min=5, message="Confirm Password must be at least 5 characters long")
    @Transient
    private String confirmPwd;

}