package core.java.session;

public class Email {

	
		private String add1;
		private String add2;
		
		public String getAdd1(){
			return add1;
			
		}
		 public void setAdd1(String add1){
			 this.add1 = ("John123@gmail.com");
			 
		 }
		 
		 public String getAdd2(){
			 return add2;
		 }
		
		public void setAdd2(String add2){
			this.add2 = ("mary345@gmail.com");
			
			System.out.println("Your email id is " + add1 + add2);
		}
		
	}


