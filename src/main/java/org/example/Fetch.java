package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Fetch {
    public Student fetchStudent(int id)
    {
        Student s2=null;
        SessionFactory sf= new Configuration().addAnnotatedClass(Student.class).addAnnotatedClass(Department.class).configure().buildSessionFactory();
        Session session=sf.openSession();
        s2=session.find(Student.class,id);
        return s2;
    }


}
