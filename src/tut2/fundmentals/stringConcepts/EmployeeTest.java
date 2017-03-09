package tut2.fundmentals.stringConcepts;

import java.util.HashMap;
import java.util.Map;

public class EmployeeTest {
	
	public static void main(String[] args) {
		
		//emp.setName("Kamlesh");
		Map<Integer, String> cars = new HashMap<>();
		cars.put(1, "Maruti");
		cars.put(2, "Honda City");
		
		Employee emp = new Employee("Kamlesh", cars);
		
		emp.setCars(cars );
		System.out.println("Printing this before modifing any state..");
		System.out.println(emp);
		
		cars.put(3, "audi");
		emp.setName("Kanhaiya");
		
		System.out.println("===============================");
		System.out.println("Printing emp object after modifing the state..");
		System.out.println(emp);
		
		String s = "abc";
		s.concat("def");
		
	}

}
