package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee {
	
	int age;
	String name;
	double salary;
	
	public Employee(String name, int age, double salary) {
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	
	@Override
	public String toString() {
		return name + "(Age: " + age + ", Salary: $" + salary + ")";
	}
	
	

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Alice",30,50000));
		employees.add(new Employee("John",28,30000));
		employees.add(new Employee("Bob",35,60000));
		
		Collections.sort(employees,new SalaryComparator());
		System.out.println("Sorted by salary: "+employees);

	}

}
