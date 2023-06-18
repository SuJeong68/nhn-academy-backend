package com.nhnacademy.springmvc.config;

import com.nhnacademy.springmvc.Base;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

/**
 * Root ApplicationContext용
 *
 * @author sudang
 * @date   2023/06/18
**/
@Configuration
@ComponentScan(basePackageClasses = Base.class,
        excludeFilters = { @ComponentScan.Filter(Controller.class)})
public class RootConfig {}
