package basicProgramming;

public class LastWordReverse {

	public static void main(String[] args) {
		String str = "The India is optim";
        String[] words = str.split(" ");
        String lastWord = words[words.length - 1];

        // Reverse last word manually without using StringBuilder
        String reversed = "";
        for (int i = lastWord.length() - 1; i >= 0; i--) {
            reversed += lastWord.charAt(i);
        }

        // Replace the last word
        words[words.length - 1] = reversed;

        // Join the words back into a string
        String result = "";
        for (int i = 0; i < words.length; i++) {
            result += words[i];
            if (i != words.length - 1) {
                result += " ";
            }
        }

        System.out.println(result);

	}

}
