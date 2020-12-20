package com.mucahit.microservices.limitsservice;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "limits-service")//is sufficient to register the bean as a component.@Component can be removed
@Getter
@Setter
public class Configurations {

    private int minimum;
    private int maximum;
}
