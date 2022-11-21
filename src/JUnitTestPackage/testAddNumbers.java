package JUnitTestPackage;

import static org.Junit.Assert.*;

import org.Junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		JUnitFunctions JUnit= new JUnitFunctions();
		 int result = JUnitFunctions.AddNumbers(100,200);
		 assertEquals(300,result);
		
	}

}
