package com.maktabsharif.repository;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.maktabsharif.configuration.DatabaseConfiguration;
import com.maktabsharif.entity.BaseEntity;

public class Repository<E extends BaseEntity> {
    private List<E> db = new ArrayList<E>();

    public void create(E e) {
        Session session = null;
        try {
            session = DatabaseConfiguration.buildSessionFactory().openSession();
            session.beginTransaction();
            session.save(e);
            
            session.getTransaction().commit();
        } catch (Exception sqlException) {
            if (null != session.getTransaction()) {
                System.out.println("\n.......Transaction Is Being Rolled Back.......");
                session.getTransaction().rollback();
            }
            sqlException.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    public List<E> findAll() {
        Session session = null;
        try {
            session = DatabaseConfiguration.buildSessionFactory().openSession();
        
            Query query = session.createQuery("select u from User u join fetch u.accounts ");
            String q = "select * from users u inner join accounts a on a.user_id = u.id ";
            String hql="select u from User u join fetch u.accounts ";
            return query.list();
    
        } catch (Exception sqlException) {
            sqlException.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }

        return null;
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
