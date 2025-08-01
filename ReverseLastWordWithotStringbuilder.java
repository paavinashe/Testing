package basicProgramming;

public class ReverseLastWordWithotStringbuilder {

	public static void main(String[] args) {
		 
		String str = "java programming";
		String words[] = str.split(" ");
		String result = "";
		
		//Reverse the last word
		String lastWord = words[words.length - 1];
		String reverseLast = "";
		
		for(int i = lastWord.length()-1; i>=0; i--) 
		{
			reverseLast += lastWord.charAt(i);
		}
		
		//Reconstruct the result string
		for(int i = 0; i < words.length-1; i++) 
		{
			result += words[i] + " ";
		}
		
		result += reverseLast;
		System.out.println(result);

	}

}
