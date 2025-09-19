package org.example;

import jakarta.persistence.*;

@Entity
public class Student {
    @Id
    private  int rollId;
    @OneToOne

    public Department department;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
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

    @Override
    public String toString() {
        return "Student{" +
                "rollId=" + rollId +
                ", department=" + department +
                ", sName='" + sName + '\'' +
                ", age=" + age +
                '}';
    }

    private  int age;

}
