package core.task4;

public class String2 {
public static void main(String [] args) {
	String str = "   This is    my    box       "; 
    
    
    str = str.replaceAll("\\s", ""); 
   
    System.out.println(str);
}
}
