package arrays;

public class ReverseAString {

	public static void main(String[] args) {
		String str = "The india is optim";
		int leng = str.length();
		String rev = " ";
		for(int i = leng-1;i >= 0; i--) 
		{
			rev = rev+str.charAt(i);
			
		}
		System.out.println("The reverse of a string is "+rev);
		

	}

}
