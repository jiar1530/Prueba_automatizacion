package Ebay;

import java.util.concurrent.TimeUnit;

import pageObject.driverConect;

public class entry extends driverConect  {

	
	String pageEbay = "https://www.ebay.com";

	/*
	 * @Date: 10-04-2018
	 * @Author: Jairo Patacon
	 * @Descrition : method for entering ebay
	 */
	public void Ebay()
	{

		// Maxim pages

		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		driver.manage().window().maximize();

			
		driver.navigate().to(pageEbay); // Access to Ebay - URL

	}
	
	

}
