package com.example.test;

import java.util.List;
import java.util.Scanner;

import com.example.beans.Employee;
import com.example.services.EmployeeServices;
import com.example.services.EmployeeServicesImpl;

public class TestEmployee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeServices eserv = new EmployeeServicesImpl();
		int choice = 0;
		do {
			System.out.println("Enter your choice");
			System.out.println("1. Add employee \n 2. Delete an employee \n3. Add after key");
			System.out.println("4. Add Before key \n5. Search an employee \n6. Display All \n7. Exit");
			choice = sc.nextInt();
			switch(choice) {
			case 1-> {
				int i = eserv.AddEmployee();
				if(i==1) {
					System.out.println("Employee added at first");
				}
				else if(i==-1) {
					System.out.println("Employee already exists");
				}
			}
			case 2-> {
				boolean res = eserv.deleteEmployee();
				if(res) {
					System.out.println("employee deleted successfully");
				}
				else {
					System.out.println("Employee not deleted");
				}
				
			}
			case 3-> {
				int res = eserv.addAfterPosition();
			}
			case 6-> {
				List<Employee> e = eserv.displayAll();
				if(e.size()>0) {
					System.out.println(e);
				}
				else {
					System.out.println("List is empty");
				}
			}
			
			}
		} while(choice!=7);
	}

}
