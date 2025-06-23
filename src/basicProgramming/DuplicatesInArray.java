package basicProgramming;

public class DuplicatesInArray {

	public static void main(String[] args) 
	{
		int a[]= {20,40,20,30,20,30,20,20};
		int count=0;
		int num=20;
		
		for(int i:a) 
		{
			if(i==num) 
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
