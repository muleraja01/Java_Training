package basicSyntax;

import java.util.Scanner;

public class sampleInputOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);// System.in is an Input Stream
		System.out.println("Enter Your Name:");
		String name = scan.nextLine();
		System.out.println("Entered Name is :" + name);
		System.out.println("Please enter Your Number");
		int num = scan.nextInt();
		System.out.println("Entered Number is :" + num);
	}

}
