package model;

/**
 * @author Riley Ahlrichs riahl12 - rpahlrichs
 * CIS175 - Spring 2023
 * Jan 24, 2023
 */

//CatInfo class that holds the main methods I will be testing 
public class CatInfo {
	private String noise;
	
	public CatInfo(String noise) {
		this.noise = noise;
	}
	
	public int returnNameLength(Cat cat) {
		return cat.getName().length();
	}
	
	public String greetings() {
		return noise + "!";
	}
	
	public boolean needsBloodworkCat(Cat cat) {
		if(cat.getAge() >= 6) {
			return true;
		}else {
			return false;
		}
	}
}
