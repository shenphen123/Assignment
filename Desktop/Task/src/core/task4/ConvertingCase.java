package core.task4;

public class ConvertingCase {

	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("heLLo WOrLd");
		convertOpposite(str);
		System.out.println(str);
	}

	 static void convertOpposite(StringBuffer str) {
		int len = str.length();
		for( int i = 0; i < len; i++){
			Character c = str.charAt(i);
			if(Character.isLowerCase(c)){
			str.replace(i, i+1, Character.toUpperCase(c) + "");
			
				
		}else{
			str.replace(i, i+1, Character.toLowerCase(c)+"");
		}
		
	}

	 }
}
