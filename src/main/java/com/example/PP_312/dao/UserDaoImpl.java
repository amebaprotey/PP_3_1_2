package com.example.PP_312.dao;

import com.example.PP_312.model.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserDaoImpl implements Dao{

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public void add(User user) {
        entityManager.persist(user);
    }

    @Override
    public List<User> listUsers() {
        return entityManager.createQuery("From User").getResultList();

    }

    @Override
    public User show(int id) {
        return entityManager.find(User.class,id);
    }

    @Override
    public void update(int id, User user) {
        User user1 = show(id);
        user1.setName(user.getName());
        user1.setSurname(user.getSurname());
        entityManager.merge(user1);

    }

    @Override
    public void delete(int id) {
        entityManager.remove(show(id));
    }


}
