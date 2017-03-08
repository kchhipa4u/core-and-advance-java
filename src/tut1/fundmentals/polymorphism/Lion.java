package tut1.fundmentals.polymorphism;

public class Lion extends Animal {
	
	public void food()
	{
		System.out.println("Lion is eating food");
	}
	
	public void m1(int x, int y)
	{
		System.out.println("Number is : " + x + " and " + y);
	}
	
	public Lion getObj(){
		return new Lion();
	}
}
