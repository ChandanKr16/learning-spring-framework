package me.chandankumar.learningspringframework.basics;

import org.springframework.stereotype.Component;

@Component
public class FullTimeEmployee implements Employee{
    @Override
    public int getPay() {
        return 10000;
    }
}
