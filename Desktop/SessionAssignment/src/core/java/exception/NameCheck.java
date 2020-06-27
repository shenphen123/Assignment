package core.java.exception;

public class NameCheck {

	public void validation(String name) throws InvalidNameException {
		System.out.println("name check");
		
		if(name == "test"){
			
			InvalidNameException n = new InvalidNameException("Invalid name exception");
			throw n;
		}
	}

	
	}

	
		
	

