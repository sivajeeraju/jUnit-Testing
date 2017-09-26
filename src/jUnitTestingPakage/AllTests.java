package jUnitTestingPakage;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(AllTests.class.getName());
		//$JUnit-BEGIN$
		suite.addTestSuite(Testaddnumbers.class);
		suite.addTestSuite(testaddstrings.class);
		//$JUnit-END$
		return suite;
	}

}
