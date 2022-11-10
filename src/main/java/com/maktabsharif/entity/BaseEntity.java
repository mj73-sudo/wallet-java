package com.maktabsharif.entity;

import javax.persistence.Column;
import javax.persistence.Id;


public class BaseEntity {
    @Id
    @Column(name = "id")
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
