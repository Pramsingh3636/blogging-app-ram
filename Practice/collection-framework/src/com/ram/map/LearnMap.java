package com.ram.map;

import java.util.HashMap;
import java.util.Map;

public class LearnMap {

	public static void main(String[] args)
	{
		Map<Integer, String> val = new HashMap<>();
		
		val.put(1, "one");
		val.put(2, "two");
		val.put(3, "three");
		val.put(4, "four");
		
		System.out.println(val);
		
//		val.putIfAbsent(23, "three"); //depends on key value
//		val.putIfAbsent(2, "seven");
		
		System.out.println(val.containsValue("four"));
		System.out.println(val);
		
		System.out.println(val.isEmpty());
		
		System.out.println(val.remove(3));
		
		//Iteration
		
		for(Map.Entry<Integer, String> e : val.entrySet()) {
			System.out.println(e);
			
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		
		for(Integer key : val.keySet()) {
			System.out.println(key);
		}
		for(String value : val.values()) {
			System.out.println(value);
		}
		
		

	}

}
