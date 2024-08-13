package org.example.util;

import org.example.entity.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null){
            sessionFactory = new Configuration()
                    .configure("hibernate.cfg.xml")
                    .addAnnotatedClass(User.class)
                    .addAnnotatedClass(Smartphone.class)
                    .addAnnotatedClass(Diary.class)
                    .buildSessionFactory();
        }

        return sessionFactory;
    }
    public static void closeSessionFactory() {
        if (sessionFactory != null){
            sessionFactory.close();
        }
    }
}
