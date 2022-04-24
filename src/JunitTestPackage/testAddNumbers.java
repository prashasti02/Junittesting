package JunitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

import jUnitTestPackage.jUnitFunctions;

public class testAddNumbers {

	@Test
	public void test() {
		JunitFunc junit = new JunitFunc();
		int res = junit.addNumber(100,200);
		assertEquals (300, res);  
 
	}

}
