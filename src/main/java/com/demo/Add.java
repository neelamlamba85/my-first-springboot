package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Add {
    @Autowired
    Data data;
    public int addition()
    {
        int sum=0;
        sum =data.no1+data.no2;
        return sum;
    }
}
