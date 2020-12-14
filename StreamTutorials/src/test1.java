import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;




public class test1 {
	@Test
	public void regular() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Raja");
		names.add("Mrunal");
		names.add("Ashwini");
		names.add("Rajani");
		names.add("Pavan");
		int icount = 0;
		for (int i = 0; i < names.size(); i++) {
			String actual = names.get(i);
			if (actual.startsWith("R")) {
				icount++;
			}
		}
		System.out.println(icount);
	}
	@Test
	public void streamFilter() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Raja");
		names.add("Mrunal");
		names.add("Ashwini");
		names.add("Rajani");
		names.add("Pavan");
		names.add("sekhar");
		//there is no life for intermediate op if there is no terminal op
		//terminal operator will execute only if inter op(filter)returns true//
		//we can create stream
		//how to use filter in stream API.
		
		long c = names.stream().filter(s->s.startsWith("R")).count();
		System.out.println(c);
		long d=Stream.of("Raja","Mrunal","Ashwini","Rajani","Pavan","Ram").filter(s->
		{
			s.startsWith("R");
			return true;
		}).count();
		System.out.println("*****************************************");
		System.out.println(d);
		System.out.println("For Each Method in streams****************");
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		System.out.println("***********************Limit Method*************");
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
	}
@Test
public void streamMap() {
	ArrayList<String> names = new ArrayList<String>();
	names.add("Raja");
	names.add("Mrunal");
	names.add("Ashwini");
	names.add("Rajani");
	names.add("Pavan");
	names.add("sekhar");
	// print the name which has last letter as i with upper case
	System.out.println("******************* end with letter I ->convert to upper case *************");
	Stream.of("Raja", "Mrunal", "Ashwini", "Rajani", "Pavan", "Ram").filter(s -> s.endsWith("i"))
			.map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));
	// print the name which has first letter as R with upper case
	System.out.println("******************* Start with letter R ->convert to upper case *************");
	List<String> names1 = Arrays.asList("Raja", "Mrunal", "Ashwini", "Rajani", "Pavan");
	names.stream().filter(s->s.startsWith("R")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	Stream<String> newStream = Stream.concat(names.stream(), names1.stream());
	//newStream.sorted().forEach(s -> System.out.println(s));
	boolean flag = newStream.anyMatch(s->s.equalsIgnoreCase("Rajani"));
	System.out.println(flag);
	
}
@Test
public void streamCollect() {
	List<String>ls=Stream.of("Raja", "Mrunal", "Ashwini", "Rajani", "Pavan", "Ram").filter(s -> s.endsWith("i"))
	.map(s -> s.toUpperCase()).collect(Collectors.toList());
	System.out.println(ls.get(0));
	
	//print unique numbers in the array lIst
	List<Integer> values = Arrays.asList(3,2,4,5,3,4,2,5,2,5);
	values.stream().distinct().forEach(s->System.out.println(s));
	List<Integer> li = values.stream().distinct().sorted().collect(Collectors.toList());
	System.out.println(li.get(2));
}
}
