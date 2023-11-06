package com.automation.pomscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.generic.Basicclass;

public class Demowebshop_gener extends Basicclass
{
	@FindBy(xpath = "//a[contains(text( ), ' in')]")
	private WebElement login;
	@FindBy (id = "Email")
	private WebElement email;
	@FindBy(id = "Password")
	private WebElement pass;
	@FindBy(xpath = "//input[contains(@value,' in')]" )
	private WebElement loginbutton;
	@FindBy(xpath = "//a[contains(text(),' out')]")
	private WebElement logout;
	 
	
	public Demowebshop_gener(WebDriver driver)
	{
		 PageFactory.initElements(driver,this);	
	}
	
	
	public WebElement log_in()
	{
	return login;		
	}
public WebElement Email()
{
return email;	
}
public 	 WebElement password()
{
return pass;	
}
public WebElement loginbutton()
{
return loginbutton;	
}
public WebElement logoutbu()
{
return logout;	
}

}
