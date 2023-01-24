package tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * @author Riley Ahlrichs riahl12 - rpahlrichs
 * CIS175 - Spring 2023
 * Jan 24, 2023
 */
//Test Suite to run both test cases together
@RunWith(Suite.class)
@SuiteClasses({ TestCatInfo.class, TestDogInfo.class })
public class AllTests {

}
