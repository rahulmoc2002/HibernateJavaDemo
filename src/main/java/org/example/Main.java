package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        H2Console console = new H2Console();
        console.startH2();
        Student s1=new Student();
        s1.setRollId(9);
        s1.setsName("Virat");
        s1.setAge(18);
        System.out.println(s1);
        SessionFactory sf= new Configuration().addAnnotatedClass(Student.class).configure().buildSessionFactory();
        Session session=sf.openSession();
        Transaction transaction=session.beginTransaction();
        session.persist(s1);

        Fetch fetch=new Fetch();
        System.out.println(fetch.fetchStudent(1));
        Student s3=new Student();
        s3.setRollId(9);
        s3.setsName("Rajat");
        s3.setAge(33);
        Update update=new Update();
        update.updateStudent(s3);
        Student s2=fetch.fetchStudent(7);
        Delete delete=new Delete();
        delete.deleteStudent(s2);
        transaction.commit();
        session.close();
        sf.close();
    }
}