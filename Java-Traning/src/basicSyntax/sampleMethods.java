package basicSyntax;

public class sampleMethods {

	
	public int a=10, b=20;
	public void add() {
		int result;
		result=a+b;
		System.out.println(result);
	}
	public void add(int a, int b) {
		int result;
		result=a+b;
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sampleMethods sm=new sampleMethods();
		sm.add();
		sm.add(30, 20);

	}

}
