package SuiteTestPackage;

public class Message {

	String name;
	
	public Message(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		System.out.println("Actual message is: ");
		return name;
	}
	
	public String modify()
	{
		name = "Hi! "+name;
		System.out.println("Modified name is: ");
		return name;
	}
	
}
