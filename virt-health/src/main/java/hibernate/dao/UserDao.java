package hibernate.dao;

import hibernate.model.Client;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserDao {
    void add(Client client);
    List<Client> listUsers();
}
