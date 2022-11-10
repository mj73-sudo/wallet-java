package com.maktabsharif.entity;

import com.maktabsharif.util.Utils;

public class BaseEntity {
    private String id;

    public BaseEntity() {
        this.id = Utils.generateId();
    }

    public String getId() {
        return id;
    }
}
