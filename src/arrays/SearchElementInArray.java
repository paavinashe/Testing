package arrays;

public class SearchElementInArray 
{

	public static void main(String[] args) {
		int a[]= {12,30,60,50};
		
		int Search_Element=50;
		
		boolean status  =false;
		
		for(int i=0;i<a.length;i++) 
		{
			if(a[i] == Search_Element) 
			{
				System.out.println("Element found");
			    status= true;
				break;
			}
		}
		if(status==false)
		
		{
			System.out.println("not found");
		}
		

	}

}
