package Com.Project.src;
class Employee{
	String name;
	String ssn;
	String dept;
	int salary;
	Employee() {}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee(String name, String ssn, String dept, int salary) {
		super();
		this.name = name;
		this.ssn = ssn;
		this.dept = dept;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", ssn=" + ssn + ", dept=" + dept + ", salary=" + salary + "]";
	}
	
	
}
public class EmployeeApp {

	
	Employee getEmployeeInfo(String str) {
		
		String name=str.substring(0,(str.indexOf('@')));
		String ssn=str.substring((str.indexOf('@')+1),str.indexOf('-'));
		String dept=str.substring((str.indexOf('-')+1),str.indexOf('#'));
		int sal=Integer.parseInt(str.substring(str.indexOf('#')+1));
		Employee employee=new Employee();
		employee.setName(name);
		employee.setSsn(ssn);
		employee.setDept(dept);
		employee.setSalary(sal);
		return employee;
	}

	String getEmployeeLevel(Employee e) {
		String level=null;
		String ssn=e.getSsn();
		String newssn=ssn.substring(ssn.length()-3);
		int ssnnumber=Integer.parseInt(newssn);
		if(ssnnumber>=1 && ssnnumber<=60)
			level="Employee Level:L1";
		else if(ssnnumber>=61 && ssnnumber<=120)
			level="Employee Level:L2";
		else if(ssnnumber>=121 && ssnnumber<=180)
		    level="Employee Level:L3";
		else
			level="Employee Level:L4";
		return level;
		
			
	}
	public static void main(String[] args) {
		EmployeeApp e=new EmployeeApp();
		System.out.println(e.getEmployeeInfo("abc@4356-uuuii#98"));
		System.out.println(e.getEmployeeLevel(new Employee("abc","125","uuuii",9889)));
		
	}
}
 