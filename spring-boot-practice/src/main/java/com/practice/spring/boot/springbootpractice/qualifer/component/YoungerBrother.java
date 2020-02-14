package com.practice.spring.boot.springbootpractice.qualifer.component;

import org.springframework.stereotype.Component;

@Component("youngerBrother")
public class YoungerBrother implements ParentComponent {

    @Override
    public String displayValue() {
       return "Inside younger brother";
    }
}
