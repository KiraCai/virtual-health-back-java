package hibernate;

import hibernate.config.AppConfig;
import hibernate.model;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;
import java.util.List;

public class MainApp {
    public static void main(String[] args) throws SQLException {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println("Hi1!");
        //UserService userService = context.getBean(UserService.class);
    }
}
