package com.practice.spring.boot.springbootpractice.qualifer.component;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("seniorBrother")
@Primary
public class ElderBrother implements ParentComponent {

    @Override
    public String displayValue() {
        return "Inside elder brother";
    }
}
