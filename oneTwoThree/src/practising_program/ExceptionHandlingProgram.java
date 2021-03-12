package practising_program;

import org.junit.Before;
import org.junit.Test;

public class ExceptionHandlingProgram {

	int a;
	int b;
	
	@Before
	public void insert()
	{
		this.a = 3;
		this.b = 0;
	}
	
	@Test(expected = ArithmeticException.class)
	public void display()
	{
		int c = a/b;
		System.out.println(c);
	}
	
}
