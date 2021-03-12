package HashSetTestingPackage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestClass {

	@Test
	public void testVowels()
	{
		String str1 = "hello";
		String str2 = "xyz";
		String str3 = "";
//		String str4 = null;
		
		HashSetClass hsc = new HashSetClass();
		assertEquals(2, hsc.vowelsCount(str1));
		assertEquals(0, hsc.vowelsCount(str2));
		assertEquals(0, hsc.vowelsCount(str3));
//		assertEquals(0, hsc.vowelsCount(str4));
	}
	
	
}
