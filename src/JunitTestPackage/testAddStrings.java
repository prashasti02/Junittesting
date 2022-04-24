package JunitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

import jUnitTestPackage.jUnitFunctions;

public class testAddStrings {

	@Test
	public void test() {
		JunitFunc junitstring = new JunitFunc();
		String result = junitstring.addStrings("capstone" , "project");
		assertEquals("capstoneproject", result); 
	}

}
