package firstProgramTesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Testing_Test_1Class {

	@Test
	public void test1() {
		Test_1 t = new Test_1();
		int result = t.add(2, 2);
		assertEquals(4, result);
	}
	
	@Test
	public void test2() {
		Test_1 t = new Test_1();
		int result = t.multiply(2, 2);
		assertEquals(4, result);
	}

}
