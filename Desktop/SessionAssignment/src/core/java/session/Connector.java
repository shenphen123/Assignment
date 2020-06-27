package core.java.session;

public abstract class Connector {

	public  abstract void openConnection();
	public  abstract void closeConnection();
	public  abstract void fireQuery();
		
	MsSQLConnection ms = new MsSQLConnection();
		
	
	
	
	public void displayConnector(){
		 System.out.println("Connecter: display");
		
			 
		 }
	
	public void loadedDBConnection() {
		System.out.println("Loaded DB Connection");
		
		
	}
	
	

}
