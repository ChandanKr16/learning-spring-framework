package me.chandankumar.learningspringframework;

import me.chandankumar.learningspringframework.basics.Employee;
import me.chandankumar.learningspringframework.basics.FullTimeEmployee;
import me.chandankumar.learningspringframework.basics.PartTimeEmployee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LearningSpringFrameworkBasicApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(LearningSpringFrameworkBasicApplication.class, args);

        Employee chandan = applicationContext.getBean(FullTimeEmployee.class);
        Employee rahul = applicationContext.getBean(PartTimeEmployee.class);

        System.out.println(chandan.getPay());
        System.out.println(rahul.getPay());


    }

}
