package coreJava;

import java.util.HashSet;
import java.util.Iterator;

public class hashSetexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Hashset, Treeset, LinkedHasSet Implement set Interface
// Doesnt accept duplicates,
// there is no guarantee stored in seqential order,iyt stores in ramdom Order

		HashSet<String> hs = new HashSet<String>();
		hs.add("Raja");
		hs.add("Rajani");
		hs.add("Pavan");
		hs.add("Pavan");
		hs.add("India");
		hs.add("Onshore");
		System.out.println(hs);
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		Iterator<String> i = hs.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

	}

}