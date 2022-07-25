package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Collections {

	public static void main(String[] args) {
		
		Collection<String> strings = Arrays.asList("one","two","three","four","eleven");
		Collection<String> list = new ArrayList<String>(strings);
		
		list.removeIf(s-> s.length()>4);//removed only eleven
		list.forEach(s->System.out.println(s));
		
		List<String> myList = Arrays.asList("a","b","c","d");
		System.out.println("Using ReplaceAll : ");
		myList.replaceAll(s-> "("+s+")");//a -> (a)
		myList.forEach(s->System.out.println(s));
	
		System.out.println("---------------");
		
		Map<Integer, String> m1 = new HashMap();
		m1.put(1, "a");
		m1.put(2,"b");
		m1.put(3, null);
		System.out.println("\n Elements");
		System.out.println(m1);
		
		String res = m1.get(3);
		String res1 = m1.get(4);
		System.out.println("Using get  3: "+res+", 4: "+res1);
		
		String res2 = m1.getOrDefault(3, "f");
		String res3 = m1.getOrDefault(4, "g");
		System.out.println("Using getOrDefault  3: "+res2+", 4: "+res3);
		System.out.println("------------------");
		
		m1.put(2, "h");
		System.out.println("using put 2: " + m1.get(2));
		
		m1.putIfAbsent(6, "i");
		System.out.println("using putifAbsent 6: " + m1.get(6));
		System.out.println("------------------");
		
		m1.replace(1, "a", "z");
		System.out.println("Replacing the old value of  1 : "+m1.get(1));
		System.out.println("------------");
		
	
		Map<String, Integer> m2 = new HashMap();
		m2.put("adarsh", 14);
		m2.put("anush",11);
		m2.put("ajay",12);
		System.out.println(m2);
		m2.compute("anush",(key,value)-> value*2);
		System.out.println("Using Compute anush : "+m2.get("anush"));
		System.out.println("---------");
		m2.put("ajay", null);
		m2.merge("ajay", 11, (key,value)-> value*2);
		System.out.println("Using merge : "+m2.get("ajay"));
		
	}
	

}
