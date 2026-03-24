package com.unit3;



import java.util.Arrays;
import java.util.List;
import java.util.*;

class Employee {
	public int getS_id() {
		return S_id;
	}
	public void setS_id(int s_id) {
		S_id = s_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee(int s_id, String name, int salary) {
		super();
		S_id = s_id;
		this.name = name;
		this.salary = salary;
	}
	private  int S_id;
	 private String name;
	private int  salary;
	
}

public class SortClass {

	public static void main(String[] args) {
		
		ArrayList<Employee> list=new ArrayList<Employee>();
		list.add(new Employee(1,"Employee 1",20000));
		list.add(new Employee(2,"Employee 2",15000));
		list.add(new Employee(3,"Employee 3",30000));
		list.add(new Employee(4,"Employee 4",40000));
		list.add(new Employee(5,"Employee 5",50000));
		list.add(new Employee(6,"Employee 6",35000));
		System.out.println("\tSid\t\tname\t\t\tMarks");
		List<Employee>l=list.stream().sorted().toList();
		System.out.println(l);
	}

}

