package com.devstack.customerserviceapi.dto;

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
public class CustomerDto {
    private Long id;
    private String name;
    private String address;
    private double salary;
}
