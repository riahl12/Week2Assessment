package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Cat;
import model.CatInfo;


/**
 * @author Riley Ahlrichs riahl12 - rpahlrichs
 * CIS175 - Spring 2023
 * Jan 24, 2023
 */
//Test Case #2
public class TestCatInfo {
	String name = "Whiskers";
	String noise = "Meow";
	Cat cat = new Cat(name);
	CatInfo catInfo = new CatInfo(noise);

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testNameLength() {
		int nameLength = name.length();
		assertTrue(nameLength == catInfo.returnNameLength(cat));
	}
	
	@Test
	public void testGreetings() {
		String noise = "Meow!";
		assertEquals(noise, catInfo.greetings());
	}
	
	@Test
	public void testNeedsBloodworkCat() {
		cat.setAge(7);
		assertTrue(catInfo.needsBloodworkCat(cat));
	}
	
	@Test
	public void testDoesntNeedBloodworkCat() {
		cat.setAge(5);
		assertFalse(catInfo.needsBloodworkCat(cat));
	}

}
