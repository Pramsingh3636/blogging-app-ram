package Assignment1;


public class ArrayString 
{
	public static void main(String[] args) 
	{
		String s1 = "Hello Ramsingh. This is java for you ! ";
		String s2 = s1.concat("Ramsingh");
		System.out.println(s1);
		System.out.println(s2);
		
		//methods
		int length = s1.length();
		System.out.println("Length of s1 : " +length);
		
		char charAt = s1.charAt(3);
		System.out.println(charAt);
		
		int epos = s1.indexOf('e');
		System.out.println("position of e is : "+epos);
		
		int indexOf = s1.indexOf("is");
		System.out.println(indexOf);
		
		int indexOf2 = s1.indexOf("big");
		System.out.println(indexOf2);
		
		boolean startsWith = s1.startsWith("java");
		System.out.println(startsWith);
		
		boolean endsWith = s1.endsWith(" ! ");
		System.out.println(endsWith);

		boolean contains = s1.contains("this");
		System.out.println(contains);
		
		s1.indexOf("e");
		int lastIndexOf = s1.lastIndexOf("e");
		System.out.println(lastIndexOf);
		
		String substring = s1.substring(8);
		System.out.println(s1);
		System.out.println(substring);
		
		String substring2 = s1.substring(8,10);
		System.out.println(substring2);
		
		String upperCase = s1.toUpperCase ();
		System.out.println(upperCase);
		
		String f = "ganesh";
		String s = "RAM";
		int diff = f.compareTo(s);
		System.out.println("diff = " + diff);
		
		s1 = "this is java for you";
		String[] words = s1.split(" ");
		for(String word : words)
			System.out.println(word);
		
		char[] charArray = s1.toCharArray();
		for(char ch : charArray)
			System.out.println(ch);
			
	}
}
