package tut1.fundmentals.initialconcepts;

public class ClientEncapsulation {
	
	public static void main(String[] args) {
		
		EncapsulationDemo demo = new EncapsulationDemo();
		//demo.age = 50;
		//demo.age = -40;
		demo.setAge(70);
		demo.displaAge();
	}

}
