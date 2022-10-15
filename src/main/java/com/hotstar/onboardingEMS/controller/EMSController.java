package com.hotstar.onboardingEMS.controller;

import com.hotstar.onboardingEMS.Entity.Employee;
import com.hotstar.onboardingEMS.services.EMSServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EMSController {

    @Autowired
    private EMSServiceImpl empService;

    @GetMapping(value = "/test")
    public String test() {
        return "testing....";
    }

    @GetMapping(value = "/employees")
    public List<Employee> getEmployees() {
        return this.empService.getEmployees();
    }

    @PostMapping(value = "/addEmployee")
    public Employee addEmployee(@RequestBody Employee employee) {
        return this.empService.addEmployee(employee);
    }

    @GetMapping(value = "/employee/{empId}")
    public Employee getEmployee(@PathVariable String empId) {
        return this.empService.getEmployee(Integer.parseInt(empId));
    }

    @DeleteMapping(value = "/employee/{empId}")
        public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable String empId) {
        try {
            this.empService.deleteEmployee(Integer.parseInt(empId));
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>((HttpStatus.INTERNAL_SERVER_ERROR));
        }
    }
}
