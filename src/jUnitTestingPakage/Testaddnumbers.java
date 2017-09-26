package jUnitTestingPakage;

import junit.framework.TestCase;

public class Testaddnumbers extends TestCase {
	public void test(){
		jUnitFunction jUnit = new jUnitFunction();
			int result = jUnit.addNumbers(100, 200);
			assertEquals(300,result);
		}
		
}


