package coreJava;



import java.util.ArrayList;

public class arrayListexample {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		// can accept duplicate values
		// array has fixes size but arrayList size grow dynamically
		// can access and insert any value in any index
		// can remove any index
		// arrayList, LinkedList, Vector- Implementing List Interface
		a.add("Raja");
		a.add("Mrunal");
		a.add("Mrunal");
		System.out.println(a.size());
		System.out.println(a.set(0, "Tester"));
		System.out.println(a.get(1));
		System.out.println(a.contains("Automation Team"));
		System.out.println(a);
		System.out.println(a.indexOf("Raja"));
		System.out.println(a.indexOf("Mrunal"));
		System.out.println(a.lastIndexOf("Mrunal"));
		a.remove(1);
		System.out.println(a);
		a.remove("Raja");
		System.out.println(a);

	}

}
