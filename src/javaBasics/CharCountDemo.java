package javaBasics;

public class CharCountDemo 
{

	public static void main(String[] args) 
	{
		
		String input = "millenium";
        String output = "";

        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            boolean alreadyPrinted = false;

         // Check if character is already in output
            for (int j = 0; j < output.length(); j++) {
                if (output.charAt(j) == current) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (!alreadyPrinted) {
                int count = 0;

                // Count total occurrences of current character
                for (int k = 0; k < input.length(); k++) {
                    if (input.charAt(k) == current) {
                        count++;
                    }
                }

                // Append character and count
                output = output + current + count;
            }
        }

        System.out.println(output); // Should print: m2i2l2e1n1u1

	}

}
