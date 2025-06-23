package arrays;

public class ObjectArray {

	public static void main(String[] args) {
		/*Object a[] = {10,10.5,'c',"qwer",true};
		for(Object i:a) 
		{
			System.out.println(i);
		}*/
		Object a [] = new Object[4];
		
		a[0]=10;
		a[1]=10.5;
		a[2]='s';
		a[3]="testing";
		a[0]=false;
		
		for(Object i:a) 
		{
			System.out.println(i);
		}
		

	}

}
