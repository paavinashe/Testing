package polymorphism;

public class Adder 
{
   int a=10;int b=20;
   
   void m1() 
   {
	   System.out.println(a+b);
   }
   void m1(int x, int y) 
   {
	   System.out.println(x+y);
   }
   void m1(int x, double y) 
   {
	   System.out.println(x+y);
   }
   void m1(double x,int y) 
   {
	   System.out.println(x+y);
   }
   public static void main(String[] args) 
   {
	   Adder add = new Adder();
	   add.m1();
	   add.m1(10.0,30);
	   add.m1(30,30.0);
	   add.m1(50,30);
   }
}
