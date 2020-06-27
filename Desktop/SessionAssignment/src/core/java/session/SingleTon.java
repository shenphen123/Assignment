package core.java.session;



public class SingleTon {
	private static SingleTon sObject;

	private SingleTon(){
	}
	public static SingleTon getInstance(){
		if(sObject == null){
			sObject = new SingleTon();
		}
		
		return sObject;
		
		
		
		}
	public void getMessage(){
		System.out.println(" You got a message.");
	}
	
	}
	
	

	

