package basicProgramming;

public class ReverseMiddleWordWithoutStrinbuilder1 {

	public static void main(String[] args) {
		 
		String str = "work smart Namrata";
		String [] words = str.split(" ");
		
		for(int i = 0;i<words.length;i++) 
		{
			if(words[i].equals("smart")) 
			{
				//Reverse it manually
				char [] chars = words[i].toCharArray();
			}
		}
	}

}
