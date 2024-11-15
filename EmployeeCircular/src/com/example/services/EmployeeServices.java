package com.example.services;

import java.util.List;

import com.example.beans.Employee;

public interface EmployeeServices {

	int AddEmployee();

	boolean deleteEmployee();

	List<Employee> displayAll();

	int addAfterPosition();

}
