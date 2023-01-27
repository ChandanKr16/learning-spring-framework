package me.chandankumar.componetscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonDao {

    @Autowired
    private ComponentJDBCTemplate componentJDBCTemplate;

}
