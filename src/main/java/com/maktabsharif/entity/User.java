package com.maktabsharif.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.maktabsharif.util.Utils;

@Entity
@Table(name = "users")
public class User extends BaseEntity {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "username")
    private String username;

    public User() {
        id = Utils.generateId();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getId() {
        return id;
    }

    // public void setId(Long id) {
    // this.id = id;
    // }

}
