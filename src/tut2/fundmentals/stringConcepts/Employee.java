package tut2.fundmentals.stringConcepts;

import java.util.HashMap;
import java.util.Map;

public class Employee {
	
	String name = "Kamlesh";
	
	private Map<Integer,String> cars;

	public Employee(String name, Map<Integer, String> cars) {
		this.name = name;
		this.cars = cars;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<Integer, String> getCars() {
		return cars;
	}

	public void setCars(Map<Integer, String> cars) {
		this.cars = cars;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", cars=" + cars + "]";
	}
	
}
