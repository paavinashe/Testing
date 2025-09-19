package basicProgramming;

public class AppendTheCharacter {

	public static void main(String[] args) {
		
		String str = "abc";
		String result = "";
		
		for(int i=0;i<str.length();i++) 
		{
			char ch = str.charAt(i);
			int repeat = i+2;  //'a' repeats 2 times, 'b' 3 times, 'c' 4 times
			
			for(int j=0;j<repeat;j++) 
			{
				result += ch;
			}
		}
		System.out.println(result);

	}

}
