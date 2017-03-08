package tut2.fundmentals.stringConcepts;

public class StringIsImmutable {

	public static void main(String[] args) {
		String str = "ab";
		str.concat("cd");
		System.out.println(str);
	}
}
