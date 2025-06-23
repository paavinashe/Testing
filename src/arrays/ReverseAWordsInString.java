package arrays;

public class ReverseAWordsInString {

	public static void main(String[] args) {
		String str = "The India is optim";
		
		//Split the Srting into words
		String[] words = str.split(" ");
		
		//Reverse the words
		String rev = "";
		for(int i=words.length-1;i>=0;i--) 
		{
			rev += words[i] + " ";
		}
		
		//Remove the trailing space
		rev = rev.trim();
		
		//Print the reversed string
		System.out.println("The reverse of a string is "+rev);
		
		
		

	}

}
