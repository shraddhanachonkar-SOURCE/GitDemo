package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3
{
	@Parameters({"URL","APIKey/usrname"})
	@Test
	public void WebloginCarLoan(String urlname,String key)
	{
		System.out.println("weblogincar");
		System.out.println(urlname);
		System.out.println(key);
	}
    @BeforeMethod
    public void beforeevery()
    {
    	System.out.println("i will execute before every test method in day3 class");
    }
    @AfterMethod
    public void afterevery()
    {
    	System.out.println("i will execute after every test method in day3 class");
    }
    @AfterClass
    public void afterclass()
    {
    	System.out.println("i will execute after all the methods in class");
    }
	@Test(groups= {"smoke"})
	public void MobilelogincarLoan()
	{
		System.out.println("mobilelogincar");
	}
	@BeforeSuite
	public void Bfsuit()
	{
		System.out.println("I am no 1");
		
	}
	@Test(enabled=false)
	public void MobilesignincarLoan()
	{
		System.out.println("mobilesignincar");
	}
	@Test(dataProvider="getdata")
	public void MobilesignoutcarLoan(String username,String password)
	{
		System.out.println("mobilesignoutcar");
		System.out.println(username);
		System.out.println(password);
	}
	@Test(dependsOnMethods={"WebloginCarLoan","MobilesignoutcarLoan"})
	public void APILogincarLoan()
	{
		System.out.println("apilogincar");
	}
	@DataProvider
	public  Object[][] getdata()
	{
		//1st combination -username password -gud credit history
		//2nd combination -username password-no credit history
		//3rd combination -username password -fradulent credit history
		
		Object[][] data=new Object[3][2];
		//1st set
		data[0][0]="firstsetusername";
		data[0][1]="password1";
		//2nd set
		data[1][0]="secondsetusername";
		data[1][1]="password2";
		//3rd set
		data[2][0]="thirdsetusername";
		data[2][1]="password3";
		return data;
	}
}
