package com.devstack.productserviceapi.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Coded By: Era Boy
 * Version: v0.1.0
 **/

@Entity
@Table(name = "product")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product {
    @Id
    private Long code;
    @Column(name = "description", nullable = false)
    private String description;
    @Column(name = "unitPrice", nullable = false)
    private double unitPrice;
    @Column(name = "qtyOnHand", nullable = false)
    private int qtyOnHand;
}
