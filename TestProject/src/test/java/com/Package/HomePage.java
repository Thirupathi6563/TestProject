package com.Package;

import java.io.IOException;

import org.testng.annotations.Test;

public class HomePage extends Base {
	
	@Test
	public void basepagenavigation() throws IOException
	{
		driver=initilaizeBrowser();
		driver.get("");
	}

}
