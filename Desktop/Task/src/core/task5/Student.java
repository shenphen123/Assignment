package core.task5;

public class Student {
	
	String name;
	public Student(String s){
		name = s;
	}
	public Student(){
		name = "Unknown";
	}

	public static void main(String[] args) {
		Student s = new Student("John");
		Student a = new Student();
System.out.println(s.name);
System.out.println(a.name);
	}

}
