package stringexamples;

import java.util.Arrays;

public class Day1 {

	public static void main(String[] args) {
		//length
		/*String s = "welcome";
		System.out.println(s.length());
		
		//concat
		String s1 = "welcome";
		String s2 = " to training";
		String s3 = " of automation";
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
		System.out.println(s1.concat(s2+s3));
		System.out.println(s1+s2+s3);
		
		//trim
		String s4 = "   welcome   ";
		System.out.println("string before trimming " +s4.length());
		System.out.println(s4);
		System.out.println(s4.trim());
		System.out.println(s4.trim().length());
		
		//charAt()
		String S = "automation";
		System.out.println(S.charAt(0));
		
		//contains
		String s5 = "welcome";
		System.out.println(s5.contains(s1)); //
		System.out.println(s5.contains("com"));
		System.out.println(s5.contains("wel"));
		System.out.println(s5.equalsIgnoreCase("WELCOME"));
		System.out.println(s5.replace('e', 'a'));
		
		String str = "selenium webdriver with java";
		System.out.println(str.replace("java","python"));*/
		
		/*String str = "automation";
		System.out.println(str.substring(0, 2)); //au
		System.out.println(str.substring(4, 10)); //mation
		System.out.println(str.substring(0, 4));*/ //auto
		
		//Split on the basis of delimeter
        /*String s = "abc123@gmail.com"; 
        String []a = s.split("@");
        System.out.println(Arrays.toString(a));
        System.out.println(a[0]);
        System.out.println(a[1]);*/
		
		/*String s = "Welcome";
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());*/
		
		/*String s = "$15,20,25";
		System.out.println(s.replace("$","").replace(",",""));
		
		String S = "abc,123@xyz"; //abc  123  xyz
		String []arr1 = S.split(",");//abc  123@xyz
		System.out.println(Arrays.toString(arr1));//[abc, 123@xyz]
		System.out.println(arr1[0]); //abc
		System.out.println(arr1[1]); //123@xyz
		
		String arr2[] = arr1[1].split("@");
		System.out.println(Arrays.toString(arr2));
		System.out.println(arr1[0]);
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);*/
		
		String str = "John kenedy";
		
		//System.out.println(str.replace('J', 'j').contains("john"));
		
		//System.out.println(str.contains("john"));
		
		System.out.println(str.toLowerCase().contains("john"));
		
		
		
		
		
		
		
		
        
	}

}
