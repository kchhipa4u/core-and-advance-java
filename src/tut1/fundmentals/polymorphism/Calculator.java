package tut1.fundmentals.polymorphism;

/*
 * method overloading
 * 
 * 1. It depends on arguments of method.
 * 2. All overloading methods name must be same.
 * 3. Number of arguments may vary or should be different
 * 4. only change the variable name in overloaded method will give compile time error
 * 5. overloading of methods does not depends on return type.
 * 6. Overloading can be done in same or sub class
 * 7. final keyword is allowed in case of overloading.
 * 8. Access Modifier - Doesn't matter
 * 9. Exception Thrown - Doesn't matter
 * 10. private method can be overloaded in java
 * 11. Main method can be overloaded in java
 * 12. Both static and instance method can be overloaded in java
 * 
 */

public class Calculator {
	
	 public final int sum(int x, int y) throws Exception
	{
		return x+y;
	}
	
	// this will give compile time error
	/*public double sum(int a, int b){
		return a+b;
	}*/
	
	public static double sum(double x, double y)
	{
		return x+y;
	}
	
	public int sum(int x, int y, int z)
	{
		return x+y+z;
	}

}
