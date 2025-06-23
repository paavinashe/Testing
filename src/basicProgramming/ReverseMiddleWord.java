package basicProgramming;

public class ReverseMiddleWord {

	public static void main(String[] args) {
		String str = "The India is optim";
        String[] words = str.split(" ");

        // Loop through the words to find "India"
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("India")) {
                // Use StringBuilder to reverse it
                StringBuilder sb = new StringBuilder(words[i]);
                words[i] = sb.reverse().toString();
                break; // Stop after reversing the first occurrence
            }
        }

        // Join words back into a sentence
        String result = String.join(" ", words);
        System.out.println(result);

	}

}
