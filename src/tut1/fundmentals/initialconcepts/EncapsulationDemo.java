package tut1.fundmentals.initialconcepts;

public class EncapsulationDemo {
	
	private int age;
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	public void displaAge(){
		System.out.println("Provided age is : " + age);
	}
}
