package me.chandankumar.learningspringframework;

import me.chandankumar.learningspringframework.scope.Student;
import me.chandankumar.learningspringframework.xml.XMLStudent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@Configuration
//@ComponentScan
public class LearningSpringFrameworkXMLApplication {


    private static Logger LOGGER = LoggerFactory.getLogger(LearningSpringFrameworkXMLApplication.class);

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        LOGGER.info("BEANS -> {}", (Object) applicationContext.getBeanDefinitionNames());


        System.out.println(applicationContext.getBeanDefinitionCount());

        XMLStudent studentOne = applicationContext.getBean(XMLStudent.class);
        XMLStudent studentTwo = applicationContext.getBean(XMLStudent.class);

        System.out.println(studentOne);
        System.out.println(studentTwo);

        System.out.println(studentOne.getDatabaseConnection());
        System.out.println(studentTwo.getDatabaseConnection());



        applicationContext.close();



    }

}
