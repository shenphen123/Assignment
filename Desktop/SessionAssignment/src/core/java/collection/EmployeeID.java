package core.java.collection;

public class EmployeeID {
private int id;
private String employee;
public EmployeeID(int id, String employee){
	this.id = id;
	this.employee = employee;
	
}
public String getEmployee(){

	return employee;
}

public int getID(){
	return id;
}
public void setEmployee(String employee){
	this.employee = employee;
}
public void setID(int id){
	this.id = id;
}

@Override
public int hashCode(){
	final int val = 15;
	int result = 1;
	result = val * result + id;
	return result;

}
@Override 
public boolean equals(Object obj){
	if (this == obj){
		return true;
	}
	if (obj == null){
		return false;
	}
	
	if (this.getClass() != obj.getClass()){
		return false;
	}
	EmployeeID other = (EmployeeID)obj;
	if(this.id != other.id){
		return false;
	}
	return true;
}

}