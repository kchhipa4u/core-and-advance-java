package tut2.fundmentals.stringConcepts;

public class StringPoolDemo {
	
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = new String("abc");
		String s3 = "abc";
		String s4 = new String("abc");
		String s5 = new String("abc").intern();
		
		System.out.println("---Comparing S1---");
		System.out.println(s1==s2);   // F
		System.out.println(s1==s3);   // T
		System.out.println(s1==s4);   // F
		System.out.println(s1==s5);   // T
		
		System.out.println("---Comparing S2---");
		System.out.println(s2==s3);  // F
		System.out.println(s2==s4);  // F
		System.out.println(s2==s5);  // F
		
		System.out.println("---Comparing S3---");
		System.out.println(s3==s4);  // F
		System.out.println(s3==s5);  // T
		
		System.out.println("---Comparing S4---");
		System.out.println(s4==s5);  // F
	}

}
