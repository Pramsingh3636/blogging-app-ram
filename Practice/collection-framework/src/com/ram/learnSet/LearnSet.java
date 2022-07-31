package com.ram.learnSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) 
	{
		// 1. it does not contain duplicate element
		
//		Set<Integer> set = new HashSet<>();     // it does not define order
		
//		Set<Integer> set = new LinkedHashSet<>();     // it defines order
		
		Set<Integer> set = new TreeSet<>(); // it gives in the sorted form
		
		set.add(23);
		set.add(13);
		set.add(27);
		set.add(116);
		set.add(33);
		
		System.out.println(set);
		set.add(116); //duplicate value
		System.out.println(set);

		System.out.println(set.contains(27));
		
		set.remove(116);
		System.out.println(set);
	
		
		System.out.println(set.isEmpty());
		System.out.println(set.size());
		
		set.clear();
		System.out.println(set);
	}

}
