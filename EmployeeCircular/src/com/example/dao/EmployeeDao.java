package com.example.dao;

import java.util.List;

import com.example.beans.Employee;

public interface EmployeeDao {

	int AddEmployee(Employee e);

	boolean deleteEmp(int id);

	List<Employee> GetAll();

}
