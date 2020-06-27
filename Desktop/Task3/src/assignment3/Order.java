package assignment3;
import java.util.Scanner;
public class Order {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int n1 = in.nextInt();
		System.out.println("Enter the second number: ");
		int n2 = in.nextInt();
		System.out.println("Enter the third number: ");
		int n3 = in.nextInt();
		
		if(n1 < n2 && n2 < n3){
			System.out.println("ICREASING");
			
		}else if (n1 > n2 && n2 > n3){
			System.out.println("DECREASING");
		}
		else {
			System.out.println("Neither incresing nor decresing order");
		}
		

	}

}
