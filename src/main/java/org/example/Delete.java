package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Delete {
    public void deleteStudent(Student student)
    {
        SessionFactory sf= new Configuration().addAnnotatedClass(Student.class).addAnnotatedClass(Department.class).configure().buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        session.remove(student);
        tx.commit();
    }
}
