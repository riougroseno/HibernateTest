package com.bookapi.hibernatecoba.com.syahrizal.spring.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.syahrizal.spring.controller"})
public class WebConfig extends WebMvcConfigurationSupport {


}
