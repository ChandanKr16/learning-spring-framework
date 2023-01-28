package me.chandankumar.learningspringframework;

import me.chandankumar.learningspringframework.cdi.CDIBusinessService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LearningSpringFrameworkCdi {

    public static void main(String[] args) {


        ApplicationContext applicationContext = SpringApplication.run(LearningSpringFrameworkCdi.class, args);

        CDIBusinessService cdiBusinessService = applicationContext.getBean(CDIBusinessService.class);

        System.out.println(cdiBusinessService);

    }

}
