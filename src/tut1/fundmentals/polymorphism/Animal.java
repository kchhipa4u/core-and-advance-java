package tut1.fundmentals.polymorphism;

/*
 * Overriding Rules :
 * 
 * 0. Method Name :- Overriding, and overridden method name must be same.
 * 1. overriding and overridden method signature must be same
 * 2. Method overriding is not possible in same class
 * 3. Number of Parameters :- Same number of parameters
 * 4. Access Modifier Rule :- Child class method modifier must have more visibility than Parent class.
 * 5. However method signature must be same but there is an exception here that we can change return type in case of 
 *    covariant type (Parent or Child)
 * 6. It supports runtime binding
 * 7. Final method can't be overridden
 * 8. Overriding is not possible in same class while overloading is possible in same class.
 * 9. Only instance method can be overridden in java not static
 * 10. Private method can't be overridden in java.
 * 11. Can't override Main method in java bcz it is static.
 * 12. It is important to know that instance variable are never overridden in java.
 * 13. Exception Thrown :-
 *       Overriding method must not throw new or broader checked exception
 *       Though, overriding method may throw new narrower (subclass) checked exception.
 *       Overriding method can throw any runtime exception
 * 14. @Override annotation :-
 *      It is used for compile time check to ensure that SubClass has successfully overridden of SuperClass.
 *      It helps spell check mistake done by developer.
 */
		
public class Animal {

	protected void food()
	{
		System.out.println("Animal can eat food...");
	}
	
	public void m1(int x)
	{
		System.out.println("Number is : " + x);
	}
	
	public Animal getObj(){
		return new Animal();
	}
	
}
