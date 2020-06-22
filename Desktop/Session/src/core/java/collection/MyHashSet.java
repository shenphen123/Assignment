package core.java.collection;

import java.util.HashSet;
import java.util.Set;

public class MyHashSet {

	public static void main(String[] args) {
		
	
		
		Set<Employee> emp = new HashSet();
		
		Employee emp1 = new Employee(123, " John");
		Employee emp2 = new Employee(123, " Steve");
		
		if (emp1.equals(emp2)){
			System.out.println("Objects are equal");
		}else{
			System.out.println("Objects are not equal");
		}	
		emp.add(new Employee(123, " John"));
		emp.add(new Employee(123, " Steve"));
		
		for(Employee string : emp){
			string.callEmployee();
		}
	}

}
