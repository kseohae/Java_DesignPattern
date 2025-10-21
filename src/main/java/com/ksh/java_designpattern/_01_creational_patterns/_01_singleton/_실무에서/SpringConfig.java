package com.ksh.java_designpattern._01_creational_patterns._01_singleton._실무에서;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean
    public String hello() {
        return "hello";
    }
}
