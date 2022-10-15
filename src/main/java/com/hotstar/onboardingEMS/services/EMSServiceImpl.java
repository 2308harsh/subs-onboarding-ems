package com.hotstar.onboardingEMS.services;

import com.hotstar.onboardingEMS.Entity.Employee;
import com.hotstar.onboardingEMS.interactor.EmployeeInteractor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EMSServiceImpl implements EMSService {

    @Autowired
    private EmployeeInteractor interactor;

    public EMSServiceImpl() {
//        employeesList = new ArrayList<>();
//        employeesList.add(new Employee("john", 12345, 22));
//        employeesList.add((new Employee("tim", 12354, 23)));
    }

    @Override
    public List<Employee> getEmployees() {
        return interactor.findAll();
    }

    @Override
    public Employee addEmployee(Employee employee) {
        interactor.save(employee);
        return employee;
    }

    @Override
    public Employee getEmployee(Integer empId) {
        Employee emp = interactor.findById(empId).get();
        return emp;
    }

    @Override
    public Employee deleteEmployee(Integer empId) {
        Employee emp = interactor.findById(empId).get();
        interactor.delete(emp);
        return emp;
    }
}
