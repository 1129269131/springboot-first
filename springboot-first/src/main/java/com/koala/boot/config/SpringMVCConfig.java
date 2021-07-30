package com.koala.boot.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * day03
 * Create by koala on 2021-07-29
 */
@ComponentScan(value = "com.koala.boot",includeFilters = {
        @ComponentScan.Filter(type= FilterType.ANNOTATION,value = Controller.class)
},useDefaultFilters = false)
public class SpringMVCConfig {
}