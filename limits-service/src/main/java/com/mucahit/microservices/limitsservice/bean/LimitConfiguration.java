package com.mucahit.microservices.limitsservice.bean;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class LimitConfiguration {

    private int minimum;
    private int maximum;
}
