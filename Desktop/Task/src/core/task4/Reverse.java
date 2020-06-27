package core.task4;
import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the sentence: ");
		String sentence = in.nextLine();
		sentence = sentence.trim();
		String result = "";
		char[] ch=sentence.toCharArray();
		for(int i = ch.length -1; i >=0; i--){
			result +=ch[i];
		}
		System.out.println("Reverse sentence: " + result.trim());

	}

}
