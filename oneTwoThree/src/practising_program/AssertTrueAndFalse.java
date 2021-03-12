package practising_program;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AssertTrueAndFalse {

	@Test
	public void module_1()
	{
		assertTrue(true);
		assertTrue(1 == 1);
		assertTrue(100 == 100);
		assertTrue("gauti".length() == 5);
		
	}
	
	@Test
	public void module_2()
	{
		assertFalse(false);
		assertFalse(1 == 0);
		assertFalse("gauti".length() == 2);
		
	}
	
}
