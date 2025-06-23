package arrays;

public class CountTheWordsOfAString {

	public static void main(String[] args) {
		
		String s = "This is a test";
		
		System.out.println("Output String is:" +s);
		
		String [] words = s.split(" ");
		
		int length;
		
		length = (s.isEmpty() || words.length == 0) ? 0 : words.length;
		
	    System.out.println("The number of words in a string are:" +length);

	}

}
