package com.concurrency;

import java.util.concurrent.ConcurrentHashMap;

public class Main {

	public static void main(String[] args) {
		
		
        ConcurrentHashMap<Integer, String> m1 = new ConcurrentHashMap<>();
        m1.put(1, "abc");
        m1.put(2, "def");
        m1.put(3, "ghi");
        System.out.println(m1);
        
        m1.putIfAbsent(1, "zzz");
        System.out.println(m1);
        System.out.println("---------");        
        m1.remove(1, "abc");
        System.out.println(m1);
        System.out.println("-------------");
        
        m1.putIfAbsent(4, "added");
        System.out.println(m1);
        System.out.println("-----------");
        
        m1.replace(2, "def", "replaced");
        System.out.println(m1);
        System.out.println("------------");
    
        ConcurrentHashMap<Integer, String> m2 = new ConcurrentHashMap<>();
        m2.putAll(m1);
        System.out.println(m2);///copied from m1
        System.out.println("---------");
        
   
        System.out.println("accessing : 3 "+m2.get(3));//accessing n0.3
        System.out.println("----------");
     
        m2.remove(3);
        System.out.println(m2);//removed n0.3
        System.out.println("----------");
     
        
        m2.clear();//cleared
        System.out.println(m2);//empty
	}

}
