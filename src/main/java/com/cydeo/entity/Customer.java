package com.cydeo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Customer extends BaseEntity{
    private String email;
    private String firstName;
    private String lastName;
    private String userName;

    //we can do this, but not a good practice. keep Customer as light as possible
    //you don't need this, if you don't need balance information whenever you call Customer object
    //this makes bidirectional
//    @OneToOne(mappedBy = "customer")
//    private Balance balance;
}
