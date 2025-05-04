package hibernate;

import hibernate.config.AppConfig;
import hibernate.dao.UserDao;
import hibernate.model.Client;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.HexFormat;
import java.util.List;

public class MainApp {
    public static void main(String[] args) throws SQLException {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println("Hi1!");
        UserDao userDao = context.getBean(UserDao.class);
        Client client1 = new Client(
                "Kay",
                "Era",
                LocalDate.of(2020, 1, 8),
                'm',
                "kay.era@example.com",
                1234567890,
                "123 Elm St, Springfield, IL",
                HexFormat.ofDelimiter(":")
                        .parseHex("e0:4f:d0:20:ea:3a:69:10:a2:d8:08:00:2b:30:30:9d"),
                HexFormat.ofDelimiter(":")
                        .parseHex("e0:4f:d0:20:ea:3a:69:10:a2:d8:08:00:2b:30:30:9d")
        );
        userDao.add(client1);
        System.out.println("finish");

    }
}
