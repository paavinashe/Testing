package stringexamples;

import java.util.Scanner;

public class CountWordsInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String s = sc.nextLine();
		int count = 0;
		for(int i=0;i<s.length()-1;i++) 
		{
			if((s.charAt(i)==' ')&&(s.charAt(i+1)!=' '))
			{
				count++;
			}
		}
		System.out.println("The total number of words in the given string are: "+count);
		

	}

}
