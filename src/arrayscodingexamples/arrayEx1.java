package arrayscodingexamples;

import java.util.Arrays;

public class arrayEx1 {

	public static void main(String[] args) {
		//int a[] = {100,200,300,400};
		  int a[] = new int [5];
		  a[0]=10;
		  a[1]=20;
		  a[2]=30;
		  a[3]=40;
		  a[4]=50;
		  
		  System.out.println(a.length);
		  System.out.println(Arrays.toString(a));
		  /*for(int i=1;i<=a.length-1;i++) 
		  {
			  System.out.print(a[i] +" ");
		  }*/
		  for(int i:a) 
		  {
			  System.out.print(i+" ");
		  }
		  

	}

}
