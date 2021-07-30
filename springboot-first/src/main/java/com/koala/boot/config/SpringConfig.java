package com.koala.boot.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * day03
 * Create by koala on 2021-07-29
 */
@ComponentScan(value = "com.koala.boot",excludeFilters = {
        @ComponentScan.Filter(type= FilterType.ANNOTATION,value = Controller.class)
})

@Configuration
public class SpringConfig {
}
