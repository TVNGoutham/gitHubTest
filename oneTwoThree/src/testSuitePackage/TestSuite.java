package testSuitePackage;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({Test1.class, Test2.class})
public class TestSuite {

	public void test()
	{
		System.out.println("Not yet implemented");
	}

}
