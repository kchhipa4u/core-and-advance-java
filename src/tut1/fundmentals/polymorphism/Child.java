package tut1.fundmentals.polymorphism;

import tut1.fundmentals.initialconcepts.Parent;

public class Child extends Parent {
   
	public static void main(String[] args) {
		Child pp = new Child();
		System.out.println(pp.name);
		System.out.println(pp.getAge());
		
		/*Parent ppp = new Parent();
		System.out.println(ppp.name);
		
		Parent pppp = new Child();
		System.out.println(pppp.name);*/
}
}
