package com.maktabsharif.service;

import java.util.List;

import com.maktabsharif.configuration.Db;
import com.maktabsharif.entity.User;
import com.maktabsharif.repository.Repository;

public class UserService implements Service<User> {

    Repository<User> repository = Db.getUserRepository();

    public void create(User entity) {
        if (repository.findById(entity.getId()) == null) {
            repository.create(entity);
        }
    }

    public List<User> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    public User findById(String id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int count() {
        // TODO Auto-generated method stub
        return 0;
    }

}
