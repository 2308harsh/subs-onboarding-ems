package com.hotstar.onboardingEMS.services;

import com.hotstar.onboardingEMS.Entity.Employee;

import java.util.List;

public interface EMSService {

    public List<Employee> getEmployees();
    public Employee addEmployee(Employee employee);
    public Employee getEmployee(Integer empId);
    public Employee deleteEmployee(Integer empId);
}
