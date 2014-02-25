package mo;

import java.io.*;

public class People implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -158205556472003168L;
	protected int age;
	protected String name;
	
	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public People(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public People() {
		this(0, "Unknown");
	}
}
