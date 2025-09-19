package org.example;


import jakarta.persistence.Entity;

import jakarta.persistence.Id;

@Entity
public class Department {
    public int getDept_Id() {
        return dept_Id;
    }

    public void setDept_Id(int dept_Id) {
        this.dept_Id = dept_Id;
    }

    @Id
    public int dept_Id;

    public String getDept_Name() {
        return dept_Name;
    }

    public void setDept_Name(String dept_Name) {
        this.dept_Name = dept_Name;
    }

    public String dept_Name;
    public String dept_Code;




    public String getDept_Code() {
        return dept_Code;
    }
    public void setDept_Code(String dept_Code) {
        this.dept_Code = dept_Code;
    }

    @Override
    public String toString() {
        return "Department{" +
                "dept_Id=" + dept_Id +
                ", dept_Name='" + dept_Name + '\'' +
                ", dept_Code='" + dept_Code + '\'' +
                '}';
    }
}
