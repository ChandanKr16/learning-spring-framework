package me.chandankumar.learningspringframework.cdi;


import jakarta.inject.Named;

@Named
public class CDIDao {
    public CDIDao(){
        System.out.println("Creating CDI object");
    }
}
