// Java program for treeset of user
// defined objects and using comparator

import java.io.*;
import java.util.Comparator;
import java.util.TreeSet;

@SuppressWarnings("unused")
class GFG {
	public static void main(String[] args)
	{
		// TreeSet of user defined objects
		// we will create TreeSet of employees
		System.out.println(
			"Sorting on the basis of name ascending order");

		// passing comparator using lambda expressions
		TreeSet<Employee> gfg
			= new TreeSet<>((Employee e1, Employee e2)
								->
							- (e1.name).compareTo(e2.name));
		gfg.add(new Employee(1, "ram", 24,"IT"));
		gfg.add(new Employee(2, "krishna", 23,"IT"));
		gfg.add(new Employee(3, "sita", 26,"IT"));
		gfg.add(new Employee(4, "lakshman", 25,"IT"));
		gfg.add(new Employee(1, "Kavitha", 24,"IT"));
		gfg.add(new Employee(2, "Vanitha", 23,"IT"));
		gfg.add(new Employee(3, "Sunitha", 26,"IT"));
		gfg.add(new Employee(4, "Aliya", 25,"IT"));
		gfg.add(new Employee(1, "Sana", 24,"IT"));
		gfg.add(new Employee(2, "Shiva", 23,"IT"));
		for (Employee employee : gfg) {
			System.out.println(employee);
		}

		// SecondComparator
		System.out.println(
			"Sorting on the basis of name ascending order");

		TreeSet<Employee> gfg2 = new TreeSet<>(
			(Employee e1,
			Employee e2) -> e1.name.compareTo(e2.name));

		// adding employee object to treeSet
		gfg2.add(new Employee(1, "ram", 24,"IT"));
		gfg2.add(new Employee(2, "krishna", 23,"IT"));
		gfg2.add(new Employee(3, "sita", 26,"IT"));
		gfg2.add(new Employee(4, "lakshman", 25,"IT"));
		gfg2.add(new Employee(1, "Kavitha", 24,"IT"));
		gfg2.add(new Employee(2, "Vanitha", 23,"IT"));
		gfg2.add(new Employee(3, "Sunitha", 26,"IT"));
		gfg2.add(new Employee(4, "Aliya", 25,"IT"));
		gfg2.add(new Employee(1, "Sana", 24,"IT"));
		gfg2.add(new Employee(2, "Shiva", 23,"IT"));
		// printing every employee object
		for (Employee employee : gfg2) {
			System.out.println(employee);
		}
	}
}

class Employee {
	// Employee has three attributes
	// id , name, salary,Department

	public int id;
	public String name;
	public Integer salary;
	public String Department;

	// default constructor
	Employee() {}

	// parameterized constructor
	Employee(int id, String name, int salary, String Department)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.Department = Department;
	}

	@Override public String toString()
	{
		return "" + this.id + " " + this.name + " "
			+ this.salary+ " "+this.Department;
	}
}
