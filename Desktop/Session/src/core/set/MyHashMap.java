package core.set;

import java.util.HashMap;

import java.util.Map;



public class MyHashMap {

	public static  void main(String[] args) {
		Map <GenerateId, Employee> instEmployee = new HashMap<GenerateId, Employee>();
		GenerateId gid = new GenerateId(123);
		GenerateId gid1 = new GenerateId(124);
		GenerateId gid2 = new GenerateId(123);
		Employee emp = new Employee("John");
		Employee emp1 = new Employee("Steve");
		Employee emp2 = new Employee("Mary");
		
		
		instEmployee.put(gid, emp);
		instEmployee.put(gid1, emp1);
		instEmployee.put(gid2, emp2);
		
		
		
		for(Map.Entry<GenerateId, Employee> obj : instEmployee.entrySet()){
			GenerateId id = obj.getKey();
			Employee e = obj.getValue();
		
			
			
				
			
			System.out.println("Key " + id.getId() + " Value " + e.getName());
		
	}
		
	}
}
	


