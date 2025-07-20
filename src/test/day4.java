package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4
{
	@Parameters({"URL"})
	@Test
	public void WebloginHomeLoan(String uname)
	{
		System.out.println("webloginhomepersonalloan");
		System.out.println(uname);
	}

	@Test(groups= {"smoke"})
	public void MobileloginHomeLoan()
	{
		System.out.println("mobileloginhome");
	}
	
	@Test
	public void LoginAPIhomeLoan()
	{
		System.out.println("apiloginhome");
		System.out.println("apiloginhome2");
		System.out.println("apiloginhome3");
		
	}
	@Test
	public void LoginAPIhomeLoan2()
	{
		System.out.println("apiloginhome");
		System.out.println("apiloginhome2");
		System.out.println("apiloginhome3");
		System.out.println("apiloginhome4");
	}
}
