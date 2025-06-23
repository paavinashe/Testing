package basicProgramming;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		String str = "I am Poonam I lived in Pune";
        String[] words = str.split(" ");

        // Use LinkedHashSet to maintain insertion order and remove duplicates
        Set<String> uniqueWords = new LinkedHashSet<>();
        for (String word : words) {
            uniqueWords.add(word);
        }

        // Join the unique words back into a string
        String result = String.join(" ", uniqueWords);
        System.out.println(result);

	}

}
