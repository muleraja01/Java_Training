package basicSyntax;

public class sampleArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[];
		a = new int[3];
		// Declare array with size int a[]=new int[3]
		a[0] = 10;
		a[1] = 20;
		a[2] = 50;
		System.out.println("The Addition of arrayValues :" + (a[0] + a[1] + a[2]));

		// Declare aray variable with {}
		int b[]= {10,20,40};
		System.out.println("The Addition of arrayValues :" + (b[0] + b[1] + b[2]));
	}

}
