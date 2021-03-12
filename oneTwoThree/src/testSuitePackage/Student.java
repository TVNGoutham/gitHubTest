package testSuitePackage;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.Before;
import org.junit.Test;

public class Student {

	int id;
	String name;
	String email;
	
	@Before
	public void setUp()
	{
		id = 10;
		name = "Goutham";
		email = null;
	}
	
	@Test
	public void executedMethod()
	{
		assertEquals(name, "Goutham");
		assertFalse(11 == id);
		assertNotNull(name);
		assertNull(email);
		assertTrue(id > 5);
	}
	
}
