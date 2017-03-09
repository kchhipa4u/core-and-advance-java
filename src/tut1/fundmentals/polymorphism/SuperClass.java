package tut1.fundmentals.polymorphism;


/**
 * @author kanhaiya.chhipa
 *
 *Covariant type and @Override concept Demonstration
 */
public class SuperClass {
	
	public String method1(){
		return "just Demo";
	}
	
	public SuperClass myMethod(){
		return new SuperClass();
	}
	
	public static String staticMethod(){
		return "I am super class static method";
	}

}
