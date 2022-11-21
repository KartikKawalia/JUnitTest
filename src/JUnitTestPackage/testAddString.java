package JUnitTestPackage;

import static org.Junit.Assert.*;

import org.Junit.Test;

public class testAddString {

	

	@Test
	public void test() {
		JUnitFunctions JUnit= new JUnitFunctions();
		 String result = JUnitFunctions.AddString("Software","Engineering");
		 assertEquals("SoftwareEngineering",result);
	}

}
