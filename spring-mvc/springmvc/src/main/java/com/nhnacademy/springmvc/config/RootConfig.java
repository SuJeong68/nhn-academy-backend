package com.nhnacademy.springmvc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

@Configuration
// Stereo Type Bean Scan
@ComponentScan(basePackages = { "com.nhnacademy.springmvc" },
        // @Controller 제외
        excludeFilters = { @ComponentScan.Filter(Controller.class) })
public class RootConfig {
}
