package me.chandankumar.learningspringframework.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.xml.crypto.Data;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Student {


    private DatabaseConnection databaseConnection;

    @Autowired
    public Student(DatabaseConnection databaseConnection) {
        this.databaseConnection = databaseConnection;
    }

    public DatabaseConnection getDatabaseConnection(){
        return this.databaseConnection;
    }


}
