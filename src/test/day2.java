package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 
{
	@Test(groups= {"smoke"})
	public void ploan()
	{
		System.out.println("good");
	}
    
	@BeforeTest
	public void prerequiste()
	{
		System.out.println("i will execute first");
	}
}
