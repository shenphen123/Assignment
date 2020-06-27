package core.java;
import java.util.Scanner;
public class Operator {

	

	public static void main(String[] args) {
		
Scanner s = new Scanner(System.in);
System.out.println("Enter the two numbers: ");

int first = s.nextInt();
int second = s.nextInt();

System.out.println("Enter your option: ");
int option = s.nextInt();



int add = first + second;

int sub = first - second;

float div = (float) first / second;

int multi = first * second;





 
switch (option){

case 1: System.out.println("Addition:" + add);
         
break;
case 2: System.out.println("Subtraction:" + sub);
break;
case 3 : System.out.println("Division: "+ div);
break;
case 4: System.out.println("Multiplication: "+ multi);
break;
case 5: System.out.println("Enter two more numbers: ");

 int first1 = s.nextInt();
 int second2 = s.nextInt();
float ave = (( first1 + second2) / 2);
	System.out.println("Average:" + ave);
break;


}
int first1 = 0;
int second2 = 0;
if ((first < 0 || second < 0 ) || (first1 < 0 || second2 < 0)){
	System.out.println("Oops optionX(1/2/3/4/5/) is returning the negative number");

}

}
}



	
	

	



	

	


