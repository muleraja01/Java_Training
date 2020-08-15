package basicSyntax;

public class sampleStringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="selenium";
		String str2="SELENIUM";
		String str3="SELENIUM";
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str3));
		//Round method uses math tpo convert to integer
		double a=10.356;
		double b=958.988;
		System.out.println(Math.round(a));
		System.out.println(Math.round(b));
		
		//String convrts to Characheter
		char d='A';
		char e='B';
		char f='1';
		System.out.println(Character.isAlphabetic(d));
		System.out.println(Character.isAlphabetic(e));
		System.out.println(Character.isAlphabetic(f));
		
		
		
		
	}

}
