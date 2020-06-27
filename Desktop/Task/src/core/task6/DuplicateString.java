package core.task6;


public class DuplicateString {

	public static void main(String[] args) {
		 
        
		 findDuplicateChars("AABBcCd");
        
    }
    
    private static void findDuplicateChars(String str) {
        System.out.println("Duplicates in- "+ str);
        int count;
        for(int i = 0; i < str.length(); i++) {
            // get a character
            char c = str.charAt(i);
            //starting count for any character
            count = 1;
            
           
            for(int j = i + 1; j < str.length(); j++) {
                 if(c == str.charAt(j)) {
                     count++;
                     // remove the char which is already counted
                     str = str.substring(0, j) + str.substring(j+ 1);
                 }
            }
            if(count > 1) {
                System.out.println(c + " found " + count + " times");
            }
        }
    }
}

 




