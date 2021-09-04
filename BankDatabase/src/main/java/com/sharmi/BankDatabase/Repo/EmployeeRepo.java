package com.sharmi.BankDatabase.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sharmi.BankDatabase.Model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
