package coreJava;

public class reverseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="madam";
		String revString="";
		for (int i=s.length()-1;i>=0;i--) {
			System.out.println(s.charAt(i));
			revString=revString+s.charAt(i);
			if(s.equals(revString)) {
				System.out.println(revString);
				System.out.println("The sting is palindrome");
			}
		}
	
	}

}
