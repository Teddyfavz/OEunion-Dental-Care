package com.favcode.oeuniondentalcare.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

@Data
@Entity
@Table(name = "addresses")
public class Address extends BaseEntity{

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO,generator="native")
    @GenericGenerator(name = "native",strategy = "native")
    private int addressId;

    @NotBlank(message="Address cannot be blank")
    @Size(min=5, message="Address must be at least 5 characters long")
    private String address1;

    private String address2;

    @NotBlank(message="City cannot be blank")
    @Size(min=5, message="City must be at least 5 characters long")
    private String city;

    @NotBlank(message="State cannot be blank")
    @Size(min=2, message="State must be at least 2 characters long")
    private String state;

    @NotBlank(message="Zip Code cannot be blank")
    @Pattern(regexp="(^$|[0-9]{5})",message = "Zip Code must be 5 digits")
    private int zipCode;
}
