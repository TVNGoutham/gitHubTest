package practising_program;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class AllAnnotations {

	@BeforeClass
	public static void onlyOnceBefore()
	{
		System.out.println("First");
	}
	
	@Before
	public void manyOnesBefore()
	{
		System.out.println("EveryTime Before");
	}
	
	@Test
	public void test1() {
		System.out.println("Not yet implemented1");
	}
	
	@Test
	public void test2() {
		System.out.println("Not yet implemented2");
	}
	
	@Test
	public void test3() {
		System.out.println("Not yet implemented3");
	}
	
	@After
	public void manyOnesAfter()
	{
		System.out.println("EveryTime After");
	}
	
	@AfterClass
	public static void onlyOnceAfter()
	{
		System.out.println("Last");
	}

}
