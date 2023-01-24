package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Dog;
import model.DogInfo;

/**
 * @author Riley Ahlrichs riahl12 - rpahlrichs
 * CIS175 - Spring 2023
 * Jan 24, 2023
 */
//Test Case #1
public class TestDogInfo {
	String name = "Spot";
	Dog dog = new Dog(name);
	DogInfo dogInfo = new DogInfo();
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testNameLength() {
		int nameLength = name.length();
		assertTrue(nameLength == dogInfo.returnNameLength(dog));
	}

	@Test
	public void testDogNeedsBloodwork() {
		dog.setAge(9);
		assertTrue(dogInfo.needsBloodworkDog(dog));
	}
	
	@Test
	public void testDogDoesntNeedBloodwork() {
		dog.setAge(3);
		assertFalse(dogInfo.needsBloodworkDog(dog));
	}
	
	@Test
	public void testNameNotNull() {
		assertNotNull(dog.printName());
	}
}
