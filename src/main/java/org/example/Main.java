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
        Department department = new Department();
        department.setDept_Id(2);
        department.setDept_Name("Computer Science and Engineering");
        department.setDept_Code("CSE");
        System.out.println(department);
        Student s1=new Student();
        s1.setRollId(12);
        s1.setsName("Virat");
        s1.setAge(18);
        s1.setDepartment(department);
        System.out.println(s1);
        SessionFactory sf= new Configuration().addAnnotatedClass(Student.class).addAnnotatedClass(Department.class).configure().buildSessionFactory();
        Session session=sf.openSession();
        Transaction transaction=session.beginTransaction();
        session.persist(department);
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
//        delete.deleteStudent(s2);
        transaction.commit();
        session.close();
        sf.close();
    }
}