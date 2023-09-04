package com.cydeo.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Category extends BaseEntity{
    private String name;

//    private List<Product> productList;
    //having the field here is much more load compared to having in Product class
}
