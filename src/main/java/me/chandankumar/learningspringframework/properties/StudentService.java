package me.chandankumar.learningspringframework.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class StudentService {

    @Value("${database.url}")
    private String dbUrl;

    public String getDbUrl(){
        return dbUrl;
    }

}
