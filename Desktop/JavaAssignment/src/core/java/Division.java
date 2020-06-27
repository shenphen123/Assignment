package core.java;
import java.util.Scanner;
public class Division {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number :" );
int num = sc.nextInt();
if ((num%3) == 0 && (num%5) == 0){
System.out.println("Consultadd JAVA Training");
}else if ((num%3) == 0){
	System.out.println("Consultadd");
	
}else if ((num%5) == 0){
	System.out.println("JAVA Training");
	
}else{
	System.out.println("Not divisible by 5 and 3");
}

	}
}


