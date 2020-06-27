package core.java.session;

public class MsSQLConnection extends Connector {

	@Override
	public void openConnection() {
		System.out.println("Open connection for MsSQL");
		
	}

	@Override
	public void closeConnection() {
		System.out.println("Close conneciton for MsSQL");
		
	}

	@Override
	public void fireQuery() {
		System.out.println("Fire query for MsSQL");
	}

}
