package com.automation.testscript;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.automation.generic.Basicclass;
import com.automation.generic.Drop_down;
import com.automation.pomscript.Dataprovider;
import com.automation.pomscript.Test_scriptpom;

public class Test_script  extends Basicclass
{
@Test(dataProvider = "ajith",dataProviderClass =Dataprovider.class )
public void price(String shirt) throws InterruptedException 
{
	Thread.sleep(4000);
	Test_scriptpom pom1 = new Test_scriptpom(driver);
	
	pom1.search_bar().sendKeys(shirt);
	Thread.sleep(2000);
	pom1.search_button().click();
	Thread.sleep(2000);
	WebElement sh = pom1.short_by();
	Drop_down.selectByindex(sh, 2);
	Thread.sleep(2000);
	WebElement si = pom1.size();
	Drop_down.selectBytext(si,"12");
	Thread.sleep(2000);
	WebElement vi = pom1.view();
	Drop_down.selectBytext(vi,"List");
	Thread.sleep(2000);
}
}
	

