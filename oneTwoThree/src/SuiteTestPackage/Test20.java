package SuiteTestPackage;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

public class Test20 {

	String name = "Goutham";
	Message m = new Message(name);
	
//	@Ignore
	@Test
	public void modifications()
	{
		System.out.println("I am in Test 20 class: ");
		assertEquals("Hi! "+name, m.modify());
	}
	
}
