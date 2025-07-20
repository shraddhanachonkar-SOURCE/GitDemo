package test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class day1 {

	@Test
	public void demo() 
	{

System.out.println("hello");
Assert.assertTrue(false);

	}
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("i will execute first before executing any method in class");
	}
	@AfterSuite
	public void Afsuite()
	{
		System.out.println("i am the  no 1 from last");
	}
	@Test
	public void demo2()
	{
		System.out.println("bye");
		System.out.println("again bye");
		//gitstuff changes
		System.out.println("again bye bye");
		System.out.println("again bye bye bye");
		
	}

	@AfterTest
	public void afterexecution()
	{
		System.out.println("i will execute last");
		
	}
}
