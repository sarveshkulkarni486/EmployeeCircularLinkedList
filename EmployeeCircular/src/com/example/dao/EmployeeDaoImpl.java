package com.example.dao;

import java.util.ArrayList;
import java.util.List;

import com.example.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	class Node{
		Employee e;
		Node next;
		public Node(Employee e) {
			this.e = e;
			this.next = null;
		}
	}
	Node head, tail;
	public EmployeeDaoImpl() {
		head = null;
		tail = null;
	}
	@Override
	public int AddEmployee(Employee e) {
		Node newnode = new Node(e);
		if(head == null) {
			head = newnode;
			tail = newnode;
		}else {
			tail.next=newnode;
			tail = newnode;
		}
		tail.next = head;
		return 1;
		
	}
	@Override
	public boolean deleteEmp(int id) {
		if(head == null) {
			return false;
		}
		else {
			Node temp = head;
			Node prev = null;
			while(temp.next!=head && temp.e.getId()!=id) {
				prev = temp;
				temp = temp.next;
			}
			if(temp==head & temp.e.getId()==id) {
				head.next = temp.next;
				tail.next= head;
				temp.next= null;
				temp=null;
				return true;
			}
			else if(temp.next!=head && temp.e.getId()==id) {
				prev.next = temp.next;
				temp.next = null;
				temp = null;
				return true;
			}
			else if(temp.next==head && temp.e.getId()==id) {
				prev.next=temp.next;
				tail = prev.next;
				tail = prev;
				temp.next = null;
				temp = null;
				return true;
			}
			
		}

		return false;
	}
	@Override
	public List<Employee> GetAll() {
		if(head==null) {
			return null;
		}
		else {
			Node temp = head;
			List<Employee> lst = new ArrayList<Employee>();
			while(temp.next!=head) {
				lst.add(temp.e);
				temp = temp.next;
			}
			lst.add(temp.e);
			return lst;
	
		}
	}
	

}
