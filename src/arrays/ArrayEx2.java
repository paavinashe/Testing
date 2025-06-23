package arrays;

public class ArrayEx2 {

	public static void main(String[] args) {
		String s [] = new String[3];
		
		s[0]="Welcome";
		s[1]="to";
		s[2]="training";
		
		System.out.println(s.length);
		System.out.println(s[0].concat(s[1].concat(s[2])));
		
		for(String a:s) 
		{
			System.out.println(a);
		}

	}

}
