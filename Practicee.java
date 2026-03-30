
package com.unit3;
import java.util.*;
import java.util.stream.Collectors;

class Employeee {
    int id;
    String name;
    @Override
	public String toString() {
		return "Employeee [id=" + id + ", name=" + name + ", salary=" + salary + ", age=" + age + ", department="
				+ department + "]";
	}
	double salary;
    int age;
    String department;

    public Employeee(int id, String name, double salary, int age, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.department = department;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }
    public int getAge() { return age; }
    public String getDepartment() { return department; }
}
public class Practicee{

	public static void main(String[]args) {

ArrayList<Employeee> empList = new ArrayList<>(Arrays.asList(
        new Employeee(101, "Amit", 50000, 25, "IT"),
        new Employeee(102, "Neha", 60000, 28, "HR"),
        new Employeee(103, "Ravi", 45000, 24, "IT"),
        new Employeee(104, "Karan", 70000, 30, "Finance"),
        new Employeee(105, "Pooja", 55000, 27, "HR"),
        new Employeee(106, "Rohit", 80000, 32, "IT"),
        new Employeee(107, "Simran", 65000, 29, "Finance"),
        new Employeee(108, "Amit", 50000, 25, "IT")
));
// Employeee result=empList.stream().filter(e -> e.getAge()<30)
//.max(Comparator.comparingDouble(Employeee::getSalary))
//.get();
//System.out.println(result);
//empList.stream().limit(5).forEach(System.out::println);
//empList.stream().skip(3).forEach(System.out::println);
//empList.stream()
//.sorted(Comparator.comparing(Employeee::getAge))
//.limit(2).forEach(System.out::println);
System.out.println("First 5 distinct employees");
empList.stream().sorted(Comparator.comparing(Employeee::getSalary)).distinct().limit(5).
collect(Collectors.toMap(Employeee::getName,e->e,(e1,e2)->e1)).values()
.forEach(System.out::println);

}}

