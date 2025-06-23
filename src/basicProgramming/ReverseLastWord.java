package basicProgramming;

public class ReverseLastWord {

	public static void main(String[] args) {
		String str = "The India is optim";
        String[] words = str.split(" ");
        String lastWord = words[words.length - 1];

        // Reverse the last word
        String reversed = new StringBuilder(lastWord).reverse().toString();

        // Replace last word with reversed word
        words[words.length - 1] = reversed;

        // Join the words back into a sentence
        String result = String.join(" ", words);
        System.out.println(result);

	}

}
