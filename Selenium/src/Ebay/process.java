package Ebay;

import pageObject.driverConect;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
public class process extends driverConect{




	By search = By.xpath("//*[@id='gh-ac']");
	By btnSearch = By.id("gh-btn");
	By checkSize = By.xpath("//*[@id='LeftNavContainer']/div[2]/div/div[2]/div[5]/a/span");

	By countResult = By.xpath("//*[@id='LeftNavContainer']/div[2]/div/div[2]/div[5]/a/span[2]");

	By dropBest = By.xpath("//*[@id='DashSortByContainer']/ul[1]/li/div/a");
	By txtvalue = By.xpath("//*[@id='SortMenu']/li[5]");

	String txtShoes = "puma shoes";
	String cCount;
	String products;
	String costs;
	String allProduct;
	String result;
	int i;

	//document.evaluate("//*[@id='LeftNavContainer']/div[2]/div/div[2]/div[5]/a/span", document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue


	//*[@id="SortMenu"]/li[5]

	public void searchSchoes()
	{		
		driver.findElement(search).click();
		driver.findElement(search).sendKeys(txtShoes);

	}

	public void clickbtnSearch()
	{		
		driver.findElement(btnSearch).click();			
	}

	public void clickChecSize()
	{		
		driver.findElement(checkSize).click();			
	}

	public void resultShoes()
	{		
		cCount = driver.findElement(countResult).getText();
		System.out.print("Encontro Shoes size 10:"+cCount);
	}


	public String  product ()
	{

		for (i=1; i<=3;i++)
		{

			costs=driver.findElement(By.xpath(("//*[@id='GalleryViewInner']/li["+i+"]/div/div[3]/div[2]/span"))).getText();
			products=driver.findElement(By.xpath(("//*[@id='GalleryViewInner']/li["+i+"]/div/div[2]/h3/a"))).getText();

			System.out.print(" Description Product: "+ products+ " Price: "+ costs);

			allProduct += " Description Product: "+ products+ " Price: "+ costs;  //guarda el resultadoo de los productos
		}

		return allProduct;
	}


	public String initialize() throws InterruptedException
	{		
		searchSchoes();	
		clickbtnSearch();
		Thread.sleep(5000);

		resultShoes();
		clickChecSize();
		Thread.sleep(5000);
		selectDropdown();
		result=product ();

		return result;
	}






	public void selectDropdown () 
	{
		driver.findElement(dropBest).click();
		driver.findElement(txtvalue).click();		
	}


}
