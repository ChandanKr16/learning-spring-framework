package me.chandankumar.learningspringframework.xml;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;


public class XMLDatabaseConnection {

    public XMLDatabaseConnection(){
        System.out.println("Database connection established");
    }
}
