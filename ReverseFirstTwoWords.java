package basicProgramming;

public class ReverseFirstTwoWords {

	public static void main(String[] args) {
	
		String str = "work smart man!";
		
		String [] words = str.split(" ");
		
		if(words.length>=2) {
		
			String temp = words [0];
			
			words [0] = words [1];
			
			words [1] = temp;
		}
		// Join the words back into a string
		
		String result = String.join(" ", words);
		
		System.out.println(result);

	}

}
