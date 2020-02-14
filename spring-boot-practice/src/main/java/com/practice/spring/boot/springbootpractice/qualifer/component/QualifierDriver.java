package com.practice.spring.boot.springbootpractice.qualifer.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class QualifierDriver {

    @Autowired
    @Qualifier("youngerBrother")
    private ParentComponent parent;

    public String displayAutowiredObject(){
        return parent.displayValue();
    }
}
