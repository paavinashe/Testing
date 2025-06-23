package arrays;

public class CharacterCountConcatenate 
{

	public static void main(String[] args) 
	{
		
		String input = "MILLENIUM";
		
		// optional: to treat uppercase & lowercase the same
		
		input = input.toUpperCase();
		
		String output = "";
		
		for(int i = 0; i < input.length(); i++) 
		{
			char ch = input.charAt(i);
		
		
		    //Check if this character is first occurrence
		
			if(input.indexOf(ch) == i)
            {
        	      int count = 0;
        
                  //Count occurrences of ch
                  for(int j = 0; j < input.length();j++)
                     {
        	            if(input.charAt(j) == ch) 
        	            {
        		          count++;
        	            }
                     }
        
                 //Append character and count
                 output = output + ch + count;
        
            }
	
		}
		
		System.out.println(output);

	}

}
