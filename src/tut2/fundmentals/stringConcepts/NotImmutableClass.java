package tut2.fundmentals.stringConcepts;

import java.util.HashMap;
import java.util.Map;

public class NotImmutableClass {
	
	private final Integer id; //Immutable member variable
	private final String name; //Immutable member variable
	private final Map<Integer,String> map; //mutable member variable
	
	public NotImmutableClass(Integer id, String name, Map<Integer, String> map) {
		this.id = id;
		this.name = name;
		this.map = map;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Map<Integer, String> getMap() {
		return map;
	}
	
}
