package core.java.session;

public class SingleTonDriver {

	public static void main(String[] args) {
		
		 SingleTon s1 = SingleTon.getInstance();
		s1.getMessage();
	}

}
