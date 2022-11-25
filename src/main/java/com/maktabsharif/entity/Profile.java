package com.maktabsharif.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.maktabsharif.util.Utils;

@Entity
@Table(name = "profiles")
public class Profile extends BaseEntity{
    @Id
    private String id;

    private String username;

    private String password;

    private String email;

    // @OneToOne
    // @MapsId
    // @JoinColumn(name = "id")
    // private User user;

    // public User getUser() {
    //     return user;
    // }

    // public void setUser(User user) {
    //     this.user = user;
    // }

    public Profile() {
        id = Utils.generateId();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
