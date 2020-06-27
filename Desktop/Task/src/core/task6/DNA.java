package core.task6;

import java.util.Scanner;

public class DNA {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String dna = sc.nextLine();
		System.out.println(makeComplementDNA(dna));

	
	}
public static String makeComplementDNA(String dna){
	dna = dna.replaceAll("A" ,"Z");
	dna = dna.replaceAll("T" ,"A");
	dna = dna.replaceAll("Z" ,"T");
	dna = dna.replaceAll("C" ,"Z");
	dna = dna.replaceAll("G" ,"C");
	dna = dna.replaceAll("Z" ,"G");
	return dna;
		 
	}

}
