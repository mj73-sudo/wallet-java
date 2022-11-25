package com.maktabsharif.service;

import java.util.List;

import com.maktabsharif.entity.Profile;
import com.maktabsharif.repository.Repository;

public class ProfileService implements Service<Profile> {
    Repository<Profile> repository = new Repository<>();

    @Override
    public void create(Profile e) {
        repository.create(e);
    }

    @Override
    public List<Profile> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Profile findById(String id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int count() {
        // TODO Auto-generated method stub
        return 0;
    }

}
