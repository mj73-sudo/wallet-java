package com.maktabsharif;

import org.hibernate.Session;

import com.maktabsharif.configuration.DatabaseConfiguration;
import com.maktabsharif.entity.User;

/**
 * Hello world!
 *
 */
public class App {

    private static Session session;

    public static void main(String[] args) {
        System.out.println(".......Hibernate Maven Example.......\n");
        try {
            session = DatabaseConfiguration.buildSessionFactory().openSession();
            session.beginTransaction();

            User user = new User();
            user.setUsername("ali");

            session.save(user);
            System.out.println("\n.......Records Saved Successfully To The Database.......\n");

            // Committing The Transactions To The Database
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
}
