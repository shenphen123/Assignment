package core.java;
import java.util.Scanner;
public class Loop {
	
int num;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < 50; i++){
		System.out.println("Enter a number: ");
	int num = in.nextInt();
	
	
		if ( num < 0){
			System.out.println("It's Over");
			break;
			
		}else if (num >= 0){
			   
			 
			 System.out.println("Good Going");
			 continue;

}
	}
	}
}



