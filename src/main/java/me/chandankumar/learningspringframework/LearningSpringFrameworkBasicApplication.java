package me.chandankumar.learningspringframework;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import me.chandankumar.learningspringframework.basics.Employee;
import me.chandankumar.learningspringframework.basics.FullTimeEmployee;
import me.chandankumar.learningspringframework.basics.PartTimeEmployee;
import org.apache.commons.logging.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LearningSpringFrameworkBasicApplication {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(LearningSpringFrameworkBasicApplication.class, args);

        Employee chandan = applicationContext.getBean(FullTimeEmployee.class);
        Employee rahul = applicationContext.getBean(PartTimeEmployee.class);

        System.out.println(chandan.getPay());
        System.out.println(rahul.getPay());


    }

    @PostConstruct
    public void postConstruct(){
        logger.info("Post Construct method called");
    }

    @PreDestroy
    public void preDestroy(){
        logger.info("Pre Destroy method called");
    }

}
