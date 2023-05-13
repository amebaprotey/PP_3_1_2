package com.example.PP_312.dao;


import com.example.PP_312.model.User;

import java.util.List;

public interface Dao {
    void add(User user);
    List<User> listUsers();
    User show(int id);
    void update(int id, User user);
    void delete(int id);
}
