package hibernate.service;

import hibernate.model.Client;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    void add(Client client);
    List<Client> listUsers();
}
