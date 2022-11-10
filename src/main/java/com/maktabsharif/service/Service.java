package com.maktabsharif.service;

import java.util.List;

import com.maktabsharif.entity.BaseEntity;

public interface Service<E extends BaseEntity> {
    void create(E e);

    List<E> findAll();

    E findById(String id);

    int count();
}
