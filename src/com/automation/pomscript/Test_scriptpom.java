package com.automation.pomscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public  class Test_scriptpom
{
@FindBy(id = "small-searchterms")
private WebElement search_bar;
@FindBy(xpath = "//input[@type='submit']")
private WebElement search_button;
@FindBy(id="products-orderby")
private WebElement short_by;
@FindBy(id="products-pagesize")
private WebElement size;
@FindBy(id="products-viewmode")
private WebElement view;

public Test_scriptpom(WebDriver driver)
{
PageFactory .initElements(driver,this);	
}


public WebElement search_bar()
{
return search_bar;	
}
public WebElement search_button()
{
return search_button;	
}
public WebElement short_by()
{
return short_by;
}
public WebElement size()
{
return size;	
}
public WebElement view()
{
return view;	
}

}
