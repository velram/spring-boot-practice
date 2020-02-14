package com.practice.spring.boot.springbootpractice.qualifier.controller;

import com.practice.spring.boot.springbootpractice.qualifer.component.QualifierDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Velmurugan Moorthy
 * 14.02.2020
 * A class to explain how qualifier works in SpringBoot
 */
@RestController
@RequestMapping("/qualifier/demo")
public class QualifierDriverController {

    @Autowired
    private QualifierDriver qualifierDriverService;

    @GetMapping("/display-value")
    public String invokeDisplayValue(){
        return qualifierDriverService.displayAutowiredObject();
    }

}
