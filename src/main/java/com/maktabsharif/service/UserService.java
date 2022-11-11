package com.maktabsharif.service;

import java.util.List;

import com.maktabsharif.configuration.Db;
import com.maktabsharif.entity.User;
import com.maktabsharif.repository.Repository;

public class UserService implements Service<User> {

    Repository<User> repository = Db.getUserRepository();


    public void create(User entity) {
      
    }

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(String id) {
        return repository.findById(id);
    }

    @Override
    public int count() {
        return repository.count();
    }

}
