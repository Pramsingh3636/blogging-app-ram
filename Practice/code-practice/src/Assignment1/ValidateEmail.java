package Assignment1;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmail 
{
	public static void main(String[] args) 
	{
		ArrayList<String> emails = new ArrayList<String>();  

		emails.add("pramsingh3636@gmail.co.in");  
		emails.add("ramsinghpatel511@gmail.com");  
	
		//Add invalid emails in list  
		emails.add(".pramsingh3636@gmail.com");  
		emails.add("ramsinghpatel511@gmail.com.");  
		 
		//Regular Expression   
		String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)"
				+ "*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
		
		//Compile regular expression to get the pattern  
		Pattern pattern = Pattern.compile(regex);  
		
		//Iterate emails array list  
		for(String email : emails)
		{  
			//Create instance of matcher   
			Matcher matcher = pattern.matcher(email);  
			System.out.println(email +" : "+ matcher.matches()+"\n");  
		}  
	}  
}  
