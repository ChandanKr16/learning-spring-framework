package me.chandankumar.learningspringframework;

import me.chandankumar.componetscan.PersonDao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("me.chandankumar")
public class LearningSpringFrameworkComponentScanApplication {

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(LearningSpringFrameworkBasicApplication.class, args);

        PersonDao personDao = applicationContext.getBean(PersonDao.class);

        System.out.println(personDao);

    }
}
