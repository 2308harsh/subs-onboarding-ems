package com.hotstar.onboardingEMS.interactor;

import com.hotstar.onboardingEMS.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeInteractor extends JpaRepository<Employee, Integer> {
}
