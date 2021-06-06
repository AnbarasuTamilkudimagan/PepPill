package resources;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class MobileMenuPageObjects 
{
	private static final String Boolean = null;
	private WebDriver driver;

	public MobileMenuPageObjects (WebDriver driver)// Constructor and point to the local variable
	{
		this.driver= driver;
	}
	
	//@FindBy (xpath="//li[@class='level0 nav-1 first']") WebElement MobileMenu;
	@FindBy (css="li[class=\"level0 nav-1 first\"]") WebElement MobileMenu;
	@FindBy (xpath="//span[@id='product-price-1']") WebElement ProductPriceOne;
	@FindBy (xpath="//li[@class='item last']/div/h2/a") WebElement ProductName;
	@FindBy (xpath="//span[@id='product-price-1']") WebElement ProductDetailPrice;
	
	@FindBy (xpath="(//button[@class='button btn-cart'])[1]") WebElement AddtocartButton;
	
	public String MobileMenu() throws InterruptedException
	{
		Thread.sleep(1000);
		
		MobileMenu.click();
		String MobileMenuTitle = driver.getTitle();
		return MobileMenuTitle;
	}
	
	public boolean AddtoCartforProduct()
	{
		AddtocartButton.click();
		System.out.println("Entered in AddtocartPRoduct method--Mobiel menu page objects");
		return true;
	}
	
	public String MobilePriceMethod()
	{
		String ProductPriceOneValue=ProductPriceOne.getText();
		System.out.println(ProductPriceOneValue);
		return ProductPriceOneValue;
		
	}
	
	public String ProductDetailMethod()
	{
		List<WebElement> hrefList =driver.findElements(By.xpath("//li[@class='item last']/div/h2/a"));

		hrefList.get(0).click();
		String ProductDetailPriceValue = ProductDetailPrice.getText();
		return ProductDetailPriceValue;
	}
	
}
