package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.*;

class Student {
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
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public Student(int s_id, String name, int marks) {
		super();
		S_id = s_id;
		this.name = name;
		this.marks = marks;
	}
	private  int S_id;
	 private String name;
	private int  marks;
	@Override
	public String toString() {
		return "Student [S_id=" + S_id + ", name=" + name + ", marks=" + marks + "]";
	}
}

public class FilterApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List <Integer> data =Arrays.asList(24,56,23,45,67);
//		ArrayList<Integer> list=new ArrayList<Integer>();
//		list.addAll(List.of(23,56,78,23,45,67,85,95,112));
//		System.out.println(list);
//		list.addAll(data);
//		System.out.println(list);
		
//	List<Integer> data=Arrays.asList(10,15,20,25,30,11,17,16);
//	ArrayList<Integer> list=new ArrayList<Integer>();
//	list.addAll(data);
		
	//	list.stream().filter((n)->n>=50 && 60).forEach((n)->System.out.print(n+" "));
		//List<Integer>g60=list.stream().filter((n)->n>60 && n<90).toList();
		
		//list.stream().filter((n)->n%2==0).forEach(System.out::println);
		
//		List<Integer>g60=data.stream().filter((n)->n%2==0).toList();
//		System.out.println();
//		System.out.println(g60);
		
		 // second q
//		List<String> s1=Arrays.asList("Amit","Ravi","Anil","Vikas","Ashok","Rahul");
//		ArrayList<String> list=new ArrayList<String>();
//		list.addAll(s1);
//		list.stream().filter((n)->n.charAt(0)=='A').forEach(System.out::println);
		
		// q4
		
//		List<String> s1=Arrays.asList("java","python","c","react","next.js","node.js");
//	ArrayList<String> list=new ArrayList<String>();
//	list.addAll(s1);
//	list.stream().filter((n)->n.length()>4).forEach(System.out::println);
		// q5
//	List<String> s1=Arrays.asList("java",null,"spring",null,"react");
//	ArrayList<String> list=new ArrayList<String>();
//	list.addAll(s1);
//	List<String> l1=list.stream().filter((n)->n != null).toList();
//	System.out.println(l1);
	
//	q15
//	List<Integer> s2=Arrays.asList(10,15,20,25,30);
//	ArrayList<Integer> list=new ArrayList<Integer>();
//	list.addAll(s2);
//	list.stream().filter((n)->n>15).filter((n)->n%2==0).forEach(System.out::println);
	
		//q16
		ArrayList<Student> list=new ArrayList<Student>();
		list.add(new Student(1,"Student 1",65));
		list.add(new Student(2,"Student 2",55));
		list.add(new Student(3,"Student 3",70));
		list.add(new Student(4,"Student 4",45));
		list.add(new Student(5,"Student 5",90));
		list.add(new Student(6,"Student 6",50));
		System.out.println("\tSid\t\tname\t\t\tMarks");
		list.stream().filter(student->student.getMarks()>60).forEach((student)->{
			String result=String.format("\t%d\t\t%s\t\t%d",student.getS_id(),student.getName(),student.getMarks());
			System.out.println(result);
		});
	}

}
