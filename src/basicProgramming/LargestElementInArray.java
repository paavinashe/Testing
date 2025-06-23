package basicProgramming;

public class LargestElementInArray {
	
	static int a []= {40,50,30,70};
	static int largest() 
	{
		int i;
		int max=a[0];
		for(i=1;i<a.length;i++)
			if(a[i]>max)
				max=a[i];
		return max;
	}


	public static void main(String[] args) 
	{
		System.out.println("largest element in arraay is "+largest());
	}

}
