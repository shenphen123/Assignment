package core.java;
import java.util.Scanner;
public class IfelseIf {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value: ");
		float num = input.nextFloat();
		
	
		if (num > 0) {
			if (num < 1){
		
            
                System.out.println("Positive small number");
            }
			else if (num > 1000000)
            {
                System.out.println("Positive large number");
            }
            else
            {
                System.out.println("Positive number");
            }
		}
        
		else if (num < 0) 
        {
           if(Math.abs(num) < 1){
                System.out.println("Negative small number");
            }
            else if (Math.abs(num) > 1000000)
            {
                System.out.println("Negative large number");
            }
            else
            {
                System.out.println("Negative number");
            }
        }
        else
        {
            System.out.println("Zero");
        }
    }
}

