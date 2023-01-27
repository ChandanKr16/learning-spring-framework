package me.chandankumar.learningspringframework.basics;

import org.springframework.stereotype.Component;

@Component
public class PartTimeEmployee implements Employee{
    @Override
    public int getPay() {
        return 5000;
    }
}
