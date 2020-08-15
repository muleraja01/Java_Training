package coreJava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashMapexample {
	public static void main(String[] args) {
		
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(0, "Raja");
		hm.put(1, "AutomationTester");
		hm.put(2, "Pune");
		hm.put(3, "UFT");
		hm.put(4, "Selenium");
		System.out.println(hm.get(2));
		System.out.println(hm.containsKey(0));
		System.out.println(hm.containsValue("UFT"));
		hm.remove(2);
		System.out.println(hm.remove(2));
		System.out.println(hm.entrySet());
		Set sn=hm.entrySet();
		Iterator it=sn.iterator();
		
		while(it.hasNext()){
			Map.Entry mp=(Map.Entry)it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
			
		}
	}

}
