package com.cydeo.entity;

import com.cydeo.enums.CartState;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigInteger;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Cart extends BaseEntity{

    @Enumerated(EnumType.STRING)
    private CartState cartState;

    //one customer can have many carts; many state of carts:
    // checks out a cart and adds new products etc.
    @ManyToOne
    private Customer customer;

    @ManyToOne
    private Discount discount;
}
