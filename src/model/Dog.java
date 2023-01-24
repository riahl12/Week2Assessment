package model;

/**
 * @author Riley Ahlrichs riahl12 - rpahlrichs
 * CIS175 - Spring 2023
 * Jan 24, 2023
 */

public class Dog {
	private String name;
	private int age;
	
	/**
	 * @param name
	 * @param age
	 */
	public Dog() {
		
	}
	
	public Dog (String name) {
		this.name = name;
	}
	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name void set name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age void set age
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * Method that returns the name
	 */
	public String printName() {
		return name;
	}
}
