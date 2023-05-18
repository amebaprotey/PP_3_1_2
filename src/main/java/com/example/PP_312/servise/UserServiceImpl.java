package com.example.PP_312.servise;


import com.example.PP_312.dao.Dao;
import com.example.PP_312.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService{

    private Dao userDao;
    @Autowired
    public UserServiceImpl(Dao userDao) {
        this.userDao = userDao;
    }
    public List<User> findAll(){
        return userDao.listUsers();
    }
    public User findOne(int id){
        return userDao.show(id);
    }
    @Transactional
    public void save(User user){
        userDao.add(user);
    }
    @Transactional
    public void update(int id, User user){
        userDao.update(id,user);

    }
    @Transactional
    public void delete(int id){
        userDao.delete(id);
    }
}
