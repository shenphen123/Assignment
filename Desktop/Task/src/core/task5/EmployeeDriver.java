package core.task5;

public class EmployeeDriver {

	public static void main(String[] args) {
		    Employee e1 = new Employee("Robert", 1994, 500000, "64C- WallsStreet");
		    Employee e2 = new Employee("Sam", 2000, 740000, "68d- WallsStreet");
		    Employee e3 = new Employee("John", 1999, 600000, "26B- WallsStreet");
		    System.out.println("Name\tYear of joining\tSalary\tAddress");
		    System.out.println(e1.getName()+"\t\t"+e1.getYear()+"\t"+e1.getSalary()+"\t"+e1.getAddress());  
		    System.out.println(e2.getName()+"\t\t"+e2.getYear()+"\t"+e2.getSalary()+"\t"+e2.getAddress());  
		    System.out.println(e3.getName()+"\t\t"+e3.getYear()+"\t"+e3.getSalary()+"\t"+e3.getAddress());  

	}

}
