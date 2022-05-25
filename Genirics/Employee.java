import java.util.HashSet;
import java.util.Set;

public class Employee {
	private int empId;
	private String empName;
	private int salary;
	private String department;
	public Employee(int i, String empName,int salary,String department) {
		super();
		this.empId = i;
		this.empName = empName;
		this.salary = salary;
		this.department = department;
	}
	public final int getEmpId() {
		return empId;
	
	}
public final void setEmpId(int empId){
	this.empId = empId;
}
public final String getEmpName() {
return empName;
}
public final void setEmpName(String empName) {
	this.empName = empName;
}
public final int getsalary() {
	return salary;
}
	public final void setsalary(int salary) {
		this.salary = salary;
}
	public final String getdepartment() {
		return department;
	}
	public final void setdepartment(String department) {
		this.department = department;
	}
	public String toString() {
		return "Employee [empId=" + empId + ",empName=" + empName + ",salary="+ salary +",department= "+ department +"]";
	}
	public int hashCode() {
    return this.empId;
	}
	public boolean equals(Object obj) {
		Employee employee = (Employee) obj;
		return true;
		}
	public boolean equals1(Object obj) {
		Employee employee = (Employee) obj;
		if(employee.empId == this.empId) {
			employee.setEmpName(this.empName);
			employee.setsalary(this.salary);
			employee.setdepartment(this.department);
		}
		return true;
	}
	//else
	{
		//return false;
	}
public static void main(String[] args) {
	Set<Employee>employees = new HashSet<>();
	employees.add(new Employee(1, "sheerin",100000,"cse"));
	employees.add(new Employee(1, "zoya",100000,"cse"));
	employees.add(new Employee(1, "sunny",100000,"cse"));
	employees.add(new Employee(2, "maahir",100000,"cse"));
	employees.add(new Employee(2, "sulthana",100000,"cse"));
	System.out.println(employees);
}
}