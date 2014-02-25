package mo;

import java.io.*;

public class Parent extends People implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3106925611402207609L;
	
	private Gender gender;

	public Gender getGender() {
		return gender;
	}
	
	public Parent(int age, String name, Gender gender) {
		super(age,name);
		this.gender = gender;
	}
	
	public Parent() {
		super();
		gender = Gender.UNKNOWN;
	}

}
