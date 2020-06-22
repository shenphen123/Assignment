package core.java.collection;


public class Employee {
private String empName;
private int id;

public Employee(int id, String empName){
	this.id = id;
	this.empName = empName;
	
}
public String getEmpName(){
	return empName;
	
}
public int getId(){
	return id;
}
public void callEmployee(){
	System.out.println("Employee: "+ id + empName);
}

@Override
public int hashCode(){
	return id;
}
@Override
public boolean equals(Object o){
	if(o == this){
		return true;
	}
	if(!(o instanceof Employee)){
		return false;
	}
	Employee emp = (Employee)o;
	return id == emp.id;
}
}



	