package practising_program;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class GettingDataFromTestCases extends TestCase{

	@Before
	public void setUp()
	{
		
	}
	
	@Test
	public void reunited()
	{
		System.out.println("Total test cases are: "+this.countTestCases());
		
		String name = this.getName();
		System.out.println( "Name os test case is: "+name);
		
		this.setName("Goutham");
		String newName = this.getName();
		System.out.println("New name os test case is: "+newName);
	}
	
	@After
	public void wrapUp()
	{
		
	}
}
