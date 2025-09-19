package basicProgramming;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemDupFrStrwithStrbider {

	public static void main(String[] args) {
		 
		String str = "programming";
		
        //Use LinkedHashSet to remove duplicates and maintain the insertion order
		Set<Character>charset = new LinkedHashSet<>();
		for(char ch : str.toCharArray()) 
		{
			charset.add(ch);
		}
		StringBuilder result = new StringBuilder();
		for(char ch : charset) 
		{
			result.append(ch);
		}
		System.out.println(result);
	}

}
