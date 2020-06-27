package core.java.exception;

public class Manager {

	public static void main(String[] args) {
		boolean valid = true;
		NameCheck nc = new NameCheck();
		
		try{
		nc.validation("temp");
		
		}catch(InvalidNameException ex){
		System.out.println(ex.getMessage());
		valid = false;
		}
		
		System.out.println("Name check valid " + valid );
	}

}
