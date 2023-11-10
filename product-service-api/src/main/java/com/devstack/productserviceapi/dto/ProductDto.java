package com.devstack.productserviceapi.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;

/**
 * Coded By: Era Boy
 * Version: v0.1.0
 **/

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProductDto {
    private Long code;
    private String description;
    private double unitPrice;
    private int qtyOnHand;
}
