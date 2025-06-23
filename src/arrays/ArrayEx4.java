package arrays;

public class ArrayEx4 {

	public static void main(String[] args) {
		int a[] = {100,200,300,400,500};
		
		
		//find the length of an array
		//System.out.println(a.length);
		
		//reading single value from an array
		//System.out.println(a[4]);
		
		//normal for loop
		/*for(int i=0;i<a.length;i++) //a<=4,a<5,a<=a.length-1,a<a.length -->all are correct
		{
			System.out.println(a[i]);
		}*/
		//enhanced for loop
		for(int x:a) 
		{
			System.out.println(x);
		}

	}

}
