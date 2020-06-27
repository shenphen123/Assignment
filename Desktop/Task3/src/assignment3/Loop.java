package assignment3;
import java.util.Scanner;
public class Loop {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		
		
			System.out.println("Enter the  integer : ");
			int num = in.nextInt();
			int sum = 0; float avg;
			for (int i = 0; i <=10; ++i){
			
			sum += num + i;
			
			}
			avg = sum / 10.0f;
			System.out.println("Sum of 10 intergers: " + sum);
			System.out.println("Average of 10 integers: " + avg);
			 
			
		}

	}


