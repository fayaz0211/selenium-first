package com.pom;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class mainclass {
	WebDriver driver;
	@Test
	public void mytest() throws Exception{
		
	tohelpmainclass.Choose_Browser("http://www.youtube.com");
	Thread.sleep(2000);
	tohelpmainclass.Enter_Text("//*[@id='masthead-search-term']", "vijay");
	
	
	}

}
