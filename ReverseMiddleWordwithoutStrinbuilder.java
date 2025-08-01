package basicProgramming;

public class ReverseMiddleWordwithoutStrinbuilder {
	
	public static void main(String[] args) 
	{
		String str = "This is java language";
		
		String [] words = str.split(" ");
		
		String result = "";
		
		//Use for loop to reverse first two words of a string
		for(int i = 1; i >= 0; i--) 
		{
			result += words[i] + " ";
 		}
		
		//Add remaining words starting from index 2
		for(int i = 2; i < words.length; i++) 
		{
			result += words[i] + " ";
		}
		
		// Trim the final result to remove trailing space
		System.out.println(result.trim());
	}

}
