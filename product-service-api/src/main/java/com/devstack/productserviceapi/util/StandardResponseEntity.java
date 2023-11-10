package com.devstack.productserviceapi.util;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Coded By: Era Boy
 * Version: v0.1.0
 **/

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class StandardResponseEntity {
    private int code;
    private String message;
    private Object data;
}
