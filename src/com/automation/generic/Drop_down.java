package com.automation.generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Drop_down 
{
public static Select dropdown(WebElement ele)
{
Select sel=new Select(ele);
return sel;
}
public static void selectByindex(WebElement ele,int index)
{
dropdown(ele).selectByIndex(index);	
}
public static void selectByvalu(WebElement ele,String value)
{
dropdown(ele).selectByValue(value);	
}
public static void selectBytext(WebElement ele,String text )
{
dropdown(ele).selectByVisibleText(text);	
}

}