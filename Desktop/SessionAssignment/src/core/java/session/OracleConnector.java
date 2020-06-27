package core.java.session;

public class OracleConnector extends Connector {

	@Override
	public void openConnection() {
		System.out.println("Open Connection");
	}

	@Override
	public void closeConnection() {
		System.out.println("Close Connection");
		
	}

	@Override
	public void fireQuery() {
		System.out.println("Fire Query");
		
	}

}
