package tut1.fundmentals.polymorphism;

public class StaticDynamicBindingTest {
	
	public static void main(String[] args) {
		SuperClass sup = new SubClass();
		System.out.println(sup.staticMethod());  // This is static binding...
		
		System.out.println(sup.method1());
		
		//sup.method2();  // This is not possible
		
		//SubClass sub = new SuperClass();  // Not possible type casting would be required to achieve this.
		
		SubClass sub1 = new SubClass();
		
		SuperClass sup1 = sup;
		
		sup1 = sub1;
		
	}

}
