package javapractice;

public class ExtractStringAndNumber {

	public static void main(String[] args) {
		
          String str = "a1b2c3";
          
          String letters = "";
          String numbers = "";
          
          for(char ch : str.toCharArray()) 
          {
        	 if(Character.isLetter(ch)) 
        	 {
        		 letters += ch;   //Concatenate letters
        	 }else if(Character.isDigit(ch)) 
        	 {
        		 numbers += ch;
        	 }
          }
          System.out.println("letters: "+letters);
          System.out.println("numbers: "+numbers);
	}

}
