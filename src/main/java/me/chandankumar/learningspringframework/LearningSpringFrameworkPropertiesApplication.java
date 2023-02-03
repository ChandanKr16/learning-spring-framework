package me.chandankumar.learningspringframework;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import me.chandankumar.learningspringframework.basics.Employee;
import me.chandankumar.learningspringframework.basics.FullTimeEmployee;
import me.chandankumar.learningspringframework.basics.PartTimeEmployee;
import me.chandankumar.learningspringframework.properties.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:app.properties")
public class LearningSpringFrameworkPropertiesApplication {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public static void main(String[] args) {


        ApplicationContext applicationContext = SpringApplication.run(LearningSpringFrameworkPropertiesApplication.class, args);

        System.out.println(applicationContext.getBean(StudentService.class).getDbUrl());


    }



}
