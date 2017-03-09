package tut2.fundmentals.stringConcepts;

import java.util.HashMap;
import java.util.Map;

public class FinalDemo {
	
	public static void main(String[] args) {
		final int x = 10;
		//x=11;
		System.out.println(x);
		
		final Map<Integer, String> myMap = new HashMap<>();
		myMap.put(1, "Kamlesh");
		myMap.put(2, "Kanhaiya");
		
		System.out.println(myMap);
		
		Map<Integer, String> newMap = new HashMap<>();
		
		//myMap = newMap;
		
		System.out.println(myMap);
	}

}
