package oopsconcept;

class Anima
{
	void eat()
    {
		System.out.println("eating.....");
    }
}
class Do extends Anima
{
	void bark()
	{
		System.out.println("barking....");
	}
}
class BabyDog extends Do
{
	void weap()
	{
		System.out.println("weaping...");
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) 
	{
		BabyDog bd = new BabyDog();
		bd.weap();
		bd.bark();
		bd.eat();
		

	}

}
