package model;

/**
 * @author Riley Ahlrichs riahl12 - rpahlrichs
 * CIS175 - Spring 2023
 * Jan 24, 2023
 */

//DogInfo class that holds the main methods I will be testing
public class DogInfo {
	
	public int returnNameLength(Dog dog) {
		return dog.getName().length();
	}
	
	public boolean needsBloodworkDog(Dog dog) {
		if(dog.getAge() >= 7) {
			return true;
		}else {
			return false;
		}
	}
}
