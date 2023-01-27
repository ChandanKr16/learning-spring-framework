package me.chandankumar.learningspringframework;

import me.chandankumar.learningspringframework.basics.Employee;
import me.chandankumar.learningspringframework.basics.FullTimeEmployee;
import me.chandankumar.learningspringframework.basics.PartTimeEmployee;
import me.chandankumar.learningspringframework.scope.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LearningSpringFrameworkScopeApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(LearningSpringFrameworkScopeApplication.class, args);

        Student studentOne = applicationContext.getBean(Student.class);
        Student studentTwo = applicationContext.getBean(Student.class);

        System.out.println(studentOne);
        System.out.println(studentTwo);

        System.out.println(studentOne.getDatabaseConnection());
        System.out.println(studentTwo.getDatabaseConnection());



    }

}
