package com.ram.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnArrayList{

	public static void main(String[] args) 
	{
		List<Integer> list = new ArrayList<>();

		list.add(3);
		list.add(7);
		list.add(6);
		System.out.println(list);
		list.add(11);
		System.out.println(list);

		list.add(2, 13);
		System.out.println(list);

		List<Integer> newList = new ArrayList<>();

		newList.add(113);
		newList.add(24);
		newList.add(75);
		System.out.println(newList);

		list.addAll(newList); //add new list in the old list
		System.out.println(list);

		System.out.println(list.get(5)); // get the value from the index
		
		list.set(4, 200); //update the value in the index
		System.out.println(list);
		
		list.remove(2); //remove the value from the index
		System.out.println(list);
		
		// Iterate the list
		//1st -> For loop
		for(int i=0; i<list.size(); i++) {
			System.out.println("For element is : " + list.get(i));
		}
		
		System.out.println("xxxxxxxxx");
		
		// 2nd -> For Each 
		for(int element : list) {
			System.out.println("For Each element is : " + element);
		}
		
		System.out.println("xxxxxxxxx");
		
		//3.Iteration function
		
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.println("Iteration element is : " + it.next());
		}

	}

}
