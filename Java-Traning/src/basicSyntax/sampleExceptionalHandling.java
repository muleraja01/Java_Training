package basicSyntax;

public class sampleExceptionalHandling {

	public static void main(String[] args) {
		try {
			int a = 10, b = 0;
			int result = a / b;
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println("The Exception Occured is :" + e);
		}
	}
}
