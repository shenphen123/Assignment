package core.task4;

public class String1 {

	public static void main(String[] args) {
		 String a = "This is a Java language"; 
		  
	        minMaxLengthWords(a);
	        System.out.print("Minimum length word: "
	                + minWord 
	                ); 
	    } 
	        
		static String minWord = ""; 
		  
	    static void minMaxLengthWords(String input)  
	    { 
	        
	        int len = input.length(); 
	        int si = 0, ei = 0; 
	        int min_length = len, min_start_index = 0 ; 
	  
	       
	        while (ei <= len)  
	        { 
	            if (ei < len && input.charAt(ei) != ' ') 
	            { 
	                ei++; 
	            }  
	            else
	            { 
	                 
	                int curr_length = ei - si; 
	  
	                if (curr_length < min_length)  
	                { 
	                    min_length = curr_length; 
	                    min_start_index = si; 
	                } 
	  
	                
	                ei++; 
	                si = ei; 
	            } 
	        } 
	  
	        
	        minWord = input.substring(min_start_index, min_start_index + min_length); 
	       
}
}
	