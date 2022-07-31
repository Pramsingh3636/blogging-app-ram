package com.ram.learnCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnCollectionClass {

	public static void main(String[] args) 
	{
		List<Student> std = new ArrayList<>();
		
		std.add(new Student("Ramsingh", 11));
		std.add(new Student("Ram", 14));
		std.add(new Student("Harish", 15));
		std.add(new Student("Ganesh", 13));
		std.add(new Student("Shiva", 12));
		
		System.out.println(std);
		
		Collections.sort(std, (o1, o2) -> o1.name.compareTo(o2.name) ); //using lambda
		
		//Using Collection
		Collections.sort(std, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.name.compareTo(o2.name);
			}	
		});
		System.out.println("sorted by Name : "+std);
		
		Collections.sort(std);
		System.out.println("Sorted By Roll No : "+std);
		
		
//		List<Integer> list = new ArrayList<>();
//		
//		list.add(23);
//		list.add(11);
//		list.add(3);
//		list.add(39);
//		list.add(45);
//		list.add(3);
//
//		System.out.println(list);
//		
//		System.out.println("min value : " + Collections.min(list));
//		System.out.println("max value : " + Collections.max(list));
//		
//		System.out.println("frequency : "+Collections.frequency(list, 3));
//		
//		Collections.sort(list, Comparator.reverseOrder());
//		System.out.println(list);
	}

}
