package core.java.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;


public class MyHashMap {

	public static void main(String[] args){
		Map<EmployeeID, String> _mapEmp = new HashMap<EmployeeID, String>();
	 
	 EmployeeID emp1 = new EmployeeID(1, "John1");
	 EmployeeID emp2 = new EmployeeID(2, "John2");
	 EmployeeID emp3 = new EmployeeID(3, "John3");
	
	_mapEmp.put(emp1, emp1.getEmployee());
	_mapEmp.put(emp2, emp2.getEmployee());
	_mapEmp.put(emp3, emp3.getEmployee());
	
	
	emp1.setEmployee("Not John1");
	emp2.setEmployee("Not John2");
	emp3.setEmployee("Not John3");
	
	System.out.println(_mapEmp.get(emp1));
	System.out.println(_mapEmp.get(emp2));
	System.out.println(_mapEmp.get(emp3));
	
	EmployeeID emp4 = new EmployeeID(1, "John4");
	System.out.println(_mapEmp.get(emp4));
	}
	

}
