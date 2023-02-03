package me.chandankumar.learningspringframework.xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class XMLStudent {

    private XMLDatabaseConnection databaseConnection;

    public XMLStudent() {
    }

    public XMLStudent(XMLDatabaseConnection databaseConnection) {
        this.databaseConnection = databaseConnection;
    }

    public XMLDatabaseConnection getDatabaseConnection(){
        return this.databaseConnection;
    }

    public void setDatabaseConnection(XMLDatabaseConnection databaseConnection) {
        this.databaseConnection = databaseConnection;
    }
}
