package arrays;

public class ArrayEx1 {

	public static void main(String[] args) {
		int a[]=new int[5];
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		// read element from array
		for(int i=0;i<=4;i++) 
		{
			System.out.print(a[i] +" ");
		}
		for(int i:a) 
		{
			System.out.println(i);
			
		}

	}

}
