package tut1.fundmentals.polymorphism;

public class SubClass extends SuperClass {

	@Override
	public SubClass myMethod(){
		return new SubClass();
	}
	
	/*@Override
	public int method1() {
		return 0;
	}*/
	
	@Override
	public String method1() {
		return "Kamlesh";
	}
	
	public static String staticMethod(){
		return "I am sub class static method";
	}
	
	public String method2()
	{
		return "I am method2";
	}
}
