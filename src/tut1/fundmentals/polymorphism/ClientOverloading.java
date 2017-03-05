package tut1.fundmentals.polymorphism;

public class ClientOverloading {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println(calc.sum(10, 20, 30));
		
		Calculator cal = new ScinitificCalculator();
		
	}
}
