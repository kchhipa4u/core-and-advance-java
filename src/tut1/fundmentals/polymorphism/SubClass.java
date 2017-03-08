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
}
