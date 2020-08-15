package coreJavaOpps;

public class samplePolymorpshim_overLoading {

	public void add(int a, int b) {
		System.out.println(a+b);
	}
	public void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	public void add(double a, double b) {
		System.out.println(a+b);
	}
	public void add(double a, double b, double c) {
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		samplePolymorpshim_overLoading overloading=new samplePolymorpshim_overLoading();
		overloading.add(10, 30);
		overloading.add(10, 20, 30);
		overloading.add(10.5, 20.3, 30.4);
	}

}
