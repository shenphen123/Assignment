package assignment3;
import java.util.Scanner;
public class WhileLoop {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the integer: ");
		
		long n = in.nextLong();

		
		int count = 0 ;
		int sum = 0;

        while(n != 0)
        {
        	sum += n%10;
            n /= 10;
            ++count;
            
        }
        
        
		
		
		
		System.out.println("Number of digits: " + count);
		System.out.println("Sum of digits: " +sum);
	}

}
