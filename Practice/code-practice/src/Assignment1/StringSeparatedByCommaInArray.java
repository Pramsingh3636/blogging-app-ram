package Assignment1;


public class StringSeparatedByCommaInArray {

	public static void main(String[] args) 
	{
		String str = "Hello,Hell,Hel,He";
		
		String[] names = str.split(",");
		
		for(String sep : names)
		{
			System.out.println(sep);
		}

	}

}
