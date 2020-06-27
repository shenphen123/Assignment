package core.java;
import java.util.Scanner;
public class Ifelse {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int num = s.nextInt();
		 if(num%2==1){
			 System.out.println("NEW");
		 
		 }else if(num >= 2 && num <=5){
			 System.out.println("OLD");
			 
			 
			 
		 }else if (num >= 6 && num <= 30){
			 System.out.println("NEW");
			 
		 }else{
			 System.out.println("OLD");
		 }
		
		
	}

}
