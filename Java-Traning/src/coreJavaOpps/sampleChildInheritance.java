package coreJavaOpps;

public class sampleChildInheritance extends sampleInheritance {
	int a = 10;
	int b = 20;

	public int add() {
		System.out.println(a + b);
		return a + b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Inetance from Child Class
		sampleChildInheritance schildInh = new sampleChildInheritance();
		int X = schildInh.add();
		System.out.println("Access from Child Class :" + X);
		// inheritance from Parent Class
		sampleInheritance sInh = new sampleInheritance();
		int Y = sInh.add();
		System.out.println("access from Parent Class:" + Y);

	}

}
