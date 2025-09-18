package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    private  int rollId;

    public int getRollId() {
        return rollId;
    }

    public void setRollId(int rollId) {
        this.rollId = rollId;
    }

    public String getsName() {
        return sName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollId=" + rollId +
                ", sName='" + sName + '\'' +
                ", age=" + age +
                '}';
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
    private  int age;

}
