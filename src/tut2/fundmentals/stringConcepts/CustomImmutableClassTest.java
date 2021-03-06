package tut2.fundmentals.stringConcepts;

import java.util.HashMap;
import java.util.Map;

/**
 * @author kanhaiya.chhipa
 *
 */
public class CustomImmutableClassTest {
	
	public static void main(String[] args) {
	      
	       Integer localId= new Integer(1); //local
	      
	       String localName= new String("Kanhaiya"); //local
	      
	        HashMap<Integer, String> localMap = new HashMap<Integer,String>(); //local
	        localMap.put(11, "audi");
	      
	        CustomImmutableClass immutableClass = new CustomImmutableClass(localId, localName, localMap);
	       
	 
	        System.out.println("----Display ImmutableClass members before changing----");
	        System.out.println(immutableClass.getName());  // "Kanhaiya"
	        System.out.println(immutableClass.getId());        // 1
	        System.out.println(immutableClass.getMap());   //{11=audi}
	 
	        //Comparing ImmutableClass members with local before changing
	        System.out.println(localName==immutableClass.getName());  //true
	        System.out.println(localId==immutableClass.getId());      //true
	        System.out.println(localMap == immutableClass.getMap());  //false
	 
	       
	        //change local
	        localId = new Integer(2);
	        localName = new String("Chhipa");
	        localMap.put(12, "ferarri");
	 
	       
	        System.out.println("\n----Display ImmutableClass members after changing----");
	        System.out.println(immutableClass.getName());  // "Kanhaiya"
	        System.out.println(immutableClass.getId());        // 1
	        System.out.println(immutableClass.getMap());   //{11=audi}
	 
	        //Comparing ImmutableClass members with local after changing
	        System.out.println(localName==immutableClass.getName());  //false
	        System.out.println(localId==immutableClass.getId());      //false
	        System.out.println(localMap == immutableClass.getMap());  //false
	 
	    }

}
