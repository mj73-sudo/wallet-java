package com.maktabsharif.repository;

import java.util.ArrayList;
import java.util.List;

import com.maktabsharif.entity.BaseEntity;

public class Repository<E extends BaseEntity> {
    private List<E> db = new ArrayList<E>();

    public void create(E e) {
        db.add(e);
    }

    public List<E> findAll() {
        return db;
    }

    public E findById(String id) {
        for (E entity : db) {
            if (entity.getId().equals(id)) {
                return entity;
            }
        }
        return null;
    }

    public int count() {
        return db.size();
    }
}
