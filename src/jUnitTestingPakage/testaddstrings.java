package jUnitTestingPakage;

import junit.framework.TestCase;

public class testaddstrings extends TestCase {
	public void test(){
		jUnitFunction jUnitstring = new jUnitFunction();
		String result = jUnitstring.addstrings("capstone","project");
		assertEquals("capstoneproject",result);
		
	}
		

}
