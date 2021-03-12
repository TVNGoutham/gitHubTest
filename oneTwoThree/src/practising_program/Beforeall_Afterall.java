package practising_program;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class Beforeall_Afterall {

	@AfterAll
	public void ending()
	{
		System.out.println("after all");
	}
	
	@BeforeAll
	public void starting()
	{
		System.out.println("before all");
	}
	
	@Test
	public void one()
	{
		System.out.println("Test-1");
	}
	
	@Test
	public void two()
	{
		System.out.println("Test-2");
	}
	
}
