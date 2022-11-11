package com.maktabsharif.service;

import java.util.List;


public interface Service<E> {
    void create(E e);

    List<E> findAll();

    E findById(String id);

    int count();
}
