package tut2.fundmentals.stringConcepts;

import java.util.HashMap;
import java.util.Map;

/**
 * @author kanhaiya.chhipa
 *
 */
public class TestNonImmutableClass {
	
	public static void main(String[] args) {
		
		Integer localId= new Integer(1); //local
	      
	       String localName= new String("Kanhaiya"); //local
	      
	        Map<Integer, String> localMap = new HashMap<Integer,String>(); //local
	        localMap.put(11, "audi");
	        
	        NotImmutableClass noImmutable = new NotImmutableClass(localId, localName, localMap);
	        
	        System.out.println("----Display NotImmutableClass members before changing----");
	        System.out.println(noImmutable.getName());  // "Kanhaiya"
	        System.out.println(noImmutable.getId());        // 1
	        System.out.println(noImmutable.getMap());   //{11=audi}
	        
	        //change local
	        localId = new Integer(2);
	        localName = new String("Chhipa");
	        localMap.put(12, "ferarri");
	        
	        System.out.println("\n----Display NotImmutableClass members after changing----");
	        System.out.println(noImmutable.getName());  // "Kanhaiya"
	        System.out.println(noImmutable.getId());        // 1
	        System.out.println(noImmutable.getMap());   //{11=audi, 12=ferarri}
	}

}
