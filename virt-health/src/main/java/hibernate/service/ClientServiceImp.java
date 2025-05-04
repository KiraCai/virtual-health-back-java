package hibernate.service;

import hibernate.dao.UserDao;
import hibernate.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClientServiceImp implements UserService{
    @Autowired
    private UserDao userDao;

    @Transactional
    @Override
    public void add(Client client) {
        userDao.add(client);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Client> listUsers() {
        return userDao.listUsers();
    }
}
