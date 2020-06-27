package assignment3;
import java.util.Scanner;
public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the natural number: ");
		int num = in.nextInt();
		int sum = 0;
		
		for(int i = 1; i <=num; ++i){
			sum = sum + i;
		}
		System.out.println("Sum of natural numbers: " + sum);
		
	}

}
