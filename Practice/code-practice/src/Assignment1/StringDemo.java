package Assignment1;

import java.util.LinkedHashSet;
import java.util.Set;

public class StringDemo {

	public static void main(String[] args)
	{
		String name = "Ramsingh Patel";
		
		/*Remove Duplicate character from String */
		
//		1. Using indexOf Method
		StringBuilder sb1 = new StringBuilder();
		for(int i=0; i<name.length(); i++)
		{
			char ch = name.charAt(i);
			int indx = name.indexOf(ch, i+1);
			if(indx == -1)
			{
				sb1.append(ch);
			}
		}
		System.out.println(sb1);
		
//		2. Using Lambda Expression java1.8
		StringBuilder sb2 = new StringBuilder();
		name.chars().distinct().forEach(ch -> sb2.append((char)ch));
		System.out.println(sb2);
		
//		3. Using set hashSet Method
		StringBuilder sb3 = new StringBuilder();
		Set<Character> set = new LinkedHashSet();
		for(int i=0; i<name.length(); i++)
		{
			set.add(name.charAt(i));
		}
		for(Character ch : set)
		{
			sb3.append(ch);
		}
		System.out.println(sb3);
	
		
		

	}

}
