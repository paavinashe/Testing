package basicProgramming;

public class ContainsVowels {

	public static void main(String[] args) {
		String str = "Hello World";  // You can change the string here

        boolean hasVowel = false;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                hasVowel = true;
                break;  // No need to check further once we find a vowel
            }
        }

        if (hasVowel) {
            System.out.println("The string contains vowels.");
        } else {
            System.out.println("The string does not contain vowels.");
        }

	}

}
