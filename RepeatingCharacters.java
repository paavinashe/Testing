package javapractice;

public class RepeatingCharacters {

	public static void main(String[] args) {
		
		String str = "This is java selenium";
		
		//Convert to lower case and trim the space
		str = str.toLowerCase().replace(" ","");
		
		//Now loop through each character
		for(int i= 0;i<str.length();i++) 
		{
			char ch = str.charAt(i);
			int count = 0;
		
		
		//Count occurrences of this character
		for(int j=0;j<str.length();j++) 
		{
			if(str.charAt(j) == ch) 
			{
				count ++;
			}
		}
		
		//Print only if repeated and not printed
		if(count > 1 && str.indexOf(ch)== i) 
		{
			System.out.println(ch +" = "+count);
		}
	}
 }

}
