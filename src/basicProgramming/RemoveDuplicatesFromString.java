package basicProgramming;

public class RemoveDuplicatesFromString {
	
	public static void main(String args[]) {
	
	String input = "programming";
	
	String result = "";
	
	for(int i=0;i<input.length();i++)
	{
		
		char ch = input.charAt(i);
		
		//Add character to the string if not already present
		if(result.indexOf(ch) == -1) 
		{
			result += ch;
			
		}
	}
	
	System.out.println("Original:" +input);
	
	System.out.println("Without duplicates:" +result);
	

}
	
}
