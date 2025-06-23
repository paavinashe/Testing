package arrayscodingexamples;

import java.util.Arrays;

public class checkArraysequal {

	public static void main(String[] args) {

         int a1 [] = {2,4,5,3};
         
         int a2 [] = {2,5,3};
         
         boolean status = Arrays.equals(a1,a2);
         
         if(status == true) 
         {
        	 System.out.println("Arrays are equal");
         }
         else 
         {
         System.out.println("Arrays are not equal");
         }
	}

}
