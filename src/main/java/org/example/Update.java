package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Update {
    public void updateStudent(Student s){
        SessionFactory sf= new Configuration().addAnnotatedClass(Student.class).configure().buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        session.merge(s);
        tx.commit();
    }
}
