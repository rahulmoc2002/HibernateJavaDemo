package org.example;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Student {
    @Id
    private  int rollId;
    @OneToMany(mappedBy = "student")
    public List<Department> departments;


    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    public int getRollId() {
        return rollId;
    }

    public void setRollId(int rollId) {
        this.rollId = rollId;
    }

    public String getsName() {
        return sName;
    }



    public void setsName(String sName) {
        this.sName = sName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private  String sName;

//    @Override
//    public String toString() {
//        return "Student{" +
//                "rollId=" + rollId +
//                ", departments=" + departments +
//                ", sName='" + sName + '\'' +
//                ", age=" + age +
//                '}';
//    }

    private  int age;

}
