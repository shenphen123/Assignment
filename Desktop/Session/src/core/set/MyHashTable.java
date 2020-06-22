package core.set;

import java.util.Hashtable;


public class MyHashTable {

	public static void main(String[] args) {
		
Hashtable<GenerateId, Employee> t = new Hashtable<GenerateId, Employee>();

GenerateId gid = new GenerateId(123);
GenerateId gid1 = new GenerateId(124);
Employee emp = new Employee("John");
Employee emp1 = new Employee("Steve");

t.put(gid, emp);
t.put(gid1, emp1);


System.out.println("Key " + gid.getId() + " Value " + emp.getName());
System.out.println("Key " + gid1.getId() + " Value " + emp1.getName());	}

}



	