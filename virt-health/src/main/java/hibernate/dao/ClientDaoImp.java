package hibernate.dao;

import hibernate.model.Client;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Repository
public class ClientDaoImp implements UserDao{
    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    @Override
    public void add(Client client) {
        sessionFactory.getCurrentSession().save(client);
    }

    @Transactional
    @Override
    public List<Client> listUsers() {
        TypedQuery<Client> query=sessionFactory.getCurrentSession().createQuery("from Client");
        return query.getResultList();
    }
}
