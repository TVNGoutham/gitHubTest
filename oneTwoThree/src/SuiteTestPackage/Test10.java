package SuiteTestPackage;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Test10 {

	String name = "Goutham";
	Message m = new Message(name);
	
	@Test
	public void actual()
	{
		System.out.println("I am in test 10 class");
		assertEquals(m.getName(), name);
	}
	
	// I am checking whether it is working ot not
	
}
