package com.hotstar.onboardingEMS.Entity;


import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Employee {

    private String name;
    @Id
    private Integer empId;
    private Integer age;

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Employee(String name, Integer empId, Integer age) {
        super();
        this.name = name;
        this.empId = empId;
        this.age = age;
    }
}
