package com.example.services;

import java.util.List;
import java.util.Scanner;

import com.example.beans.Employee;
import com.example.dao.EmployeeDao;
import com.example.dao.EmployeeDaoImpl;

public class EmployeeServicesImpl implements EmployeeServices {
	Scanner sc = new Scanner(System.in);
	EmployeeDao edao;
	public EmployeeServicesImpl() {
		edao = new EmployeeDaoImpl();
	}
	@Override
	public int AddEmployee() {
		System.out.println("Enter employee id: ");
		int id = sc.nextInt();
		System.out.println("Enter employee name: ");
		String name = sc.next();
		Employee e = new Employee(id, name);
		return edao.AddEmployee(e);
	}
	@Override
	public boolean deleteEmployee() {
		System.out.println("Enter id of an employee which you want to delete");
		int id = sc.nextInt();
		return edao.deleteEmp(id);
	}
	@Override
	public List<Employee> displayAll() {
		return edao.GetAll();
	}
	@Override
	public int addAfterPosition() {
		return 0;
	}


}
