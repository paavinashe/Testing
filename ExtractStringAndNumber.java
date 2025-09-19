package basicProgramming;

public class ExtractStringAndNumber {

	public static void main(String[] args) {	
     
		String str = "ABC345";
        // Extract substrings directly from the original string
        String str2 = str.substring(0, 3); // "ABC"
        String str3 = str.substring(3);    // "345"
        
        System.out.println("First part: " +str2);
        System.out.println("Second part: " +str3);
	}

}
