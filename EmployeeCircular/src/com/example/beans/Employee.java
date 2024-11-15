package com.example.beans;

public class Employee {
	private int id;
	private String ename;
	public Employee() {
		super();
	}
	public Employee(int id, String ename) {
		this.id = id;
		this.ename = ename;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", ename=" + ename + "]";
	}
	

}
