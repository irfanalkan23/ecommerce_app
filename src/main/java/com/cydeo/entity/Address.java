package com.cydeo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Address extends BaseEntity{
    private String name;
    private String street;
    private String zipCode;

    //in the diagram, I see the foreign key in address table, so put annotation here
    //many addresses can belong to one customer
    @ManyToOne
    private Customer customer;
}
