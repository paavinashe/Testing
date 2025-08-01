package basicProgramming;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesUsingLinkedHasgSet {

	public static void main(String[] args) {
		
		String str = "programming";
		
		//Use LinkedHashSet to remove duplicates and maintain the insertion order
		Set <Character> charSet = new LinkedHashSet<>();
		
		//Add the characeter to the set
		for(char ch : str.toCharArray()){
			charSet.add(ch);
		}
		
		//Build the result string 
		StringBuilder result = new StringBuilder();
		for(char ch : charSet) {
			result.append(ch);
		}
		System.out.println("Original string: " +str);
		System.out.println("String witout duplicates: " +result.toString());
		}

}
