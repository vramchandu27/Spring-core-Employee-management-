package com.Employee.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Employee {

	@Id
	private long rollno;
    private String ename;
    private int age;
    private String department;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(long rollno, String ename, int age, String department) {
		super();
		this.rollno = rollno;
		this.ename = ename;
		this.age = age;
		this.department = department;
	}
	public long getRollno() {
		return rollno;
	}
	public void setRollno(long rollno) {
		this.rollno = rollno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
}

