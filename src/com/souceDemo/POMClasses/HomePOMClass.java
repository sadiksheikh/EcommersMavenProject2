package com.souceDemo.POMClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class HomePOMClass {
	
	public WebDriver driver;
	Select s;
	
	
	
	@FindBy(xpath="//div[text()='Sauce Labs Backpack']")
	private WebElement backpack;
	
	public void clickBackPack()
	{
		backpack.click();
	}
	
	@FindBy(xpath="//div[text()='Sauce Labs Bike Light']")
	private WebElement bikelight;
	
	public void clickBikeLight()
	{
		bikelight.click();
	}
	
	
	@FindBy(xpath="//div[text()='Sauce Labs Bolt T-Shirt']")
	private WebElement boltTshirt;
	
	public void clickBoltTShirt()
	{
		boltTshirt.click();
	}
	
	@FindBy(xpath="//div[text()='Sauce Labs Fleece Jacket']")
	private WebElement fleecejacket;
	
	public void clickFleeceJacket()
	{
		fleecejacket.click();
	}
	
	
	@FindBy(xpath="//div[text()='Sauce Labs Onesie']")
	private WebElement onesie;
	
	public void clickOnesie()
	{
		onesie.click();
	}
	
	
	@FindBy(xpath="//div[text()='Test.allTheThings() T-Shirt (Red)']")
	private WebElement tshirtRed;
	
	public void clickTshirtRed()
	{
		tshirtRed.click();
	}
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	private WebElement clickCartButton;
	
	public void clickCartButton()
	{
		clickCartButton.click();
	}
	
	public String removetoCartValidation()
	{
		String remove = clickCartButton.getText();
		return remove;
	}
	
	
	@FindBy(xpath="//span[@class='shopping_cart_badge']")
	private WebElement addtocartvalidation;
	
	public String addToCartValidation()
	{
		String addcartvatidation = addtocartvalidation.getText();
		return addcartvatidation;
	}
	

	
//		-------- Drop Down/List Box --------
	
	
	@FindBy(xpath="//select[@class='product_sort_container']")
	private WebElement dropdown;
	
	public void clickDropDown()
	{
		dropdown.click();
	}
	
	
	public void totalNumberOfDropDownElements()
	{
//		List <WebElement> alloptions = s.getOptions();
//		alloptions.size();
		
//					--OR--
		System.out.println("Number of Dropdown Elements -->"+s.getOptions().size());
	}
	
	
	public void totalDropDownElementName()
	{
		List <WebElement> alloptions = s.getOptions();
//		alloptions.size();
		for(WebElement total : alloptions )
		{
			String text = total.getText();
			System.out.println(text);
		}
	}
	
	
	public void selectNameAtoZ()
	{
		
		s.selectByIndex(0);
	}
	
	@FindBy(xpath="//option[text()='Name (A to Z)']")
	private WebElement atoztext;
	
	public String aToZTextValidation()
	{
		String result =atoztext.getText();
		return result;
	}
	
	
	public void selectZtoA()
	{
//		s.selectByValue("za");
		s.selectByIndex(1);
	}
	
	@FindBy(xpath= "//option[@value='za']")
	private WebElement ztoaText;
	
	public String zToAValidation()
	{
		String result= ztoaText.getText();
		return result;
	}
	
	
	
	public void selectLowToHigh()
	{
//		s.selectByVisibleText("Price (low to high)");
		s.selectByIndex(2);
	}
	
	@FindBy(xpath="//option[text()='Price (low to high)']")
	private WebElement lowtohightext;
	
	public String lowToHighValidation()
	{
		String result =lowtohightext.getText();
		return result;
	}
	
	
	public void selectHighToLow()
	{
		s.selectByIndex(3);
	}
	
	@FindBy(xpath= "//option[text()='Price (high to low)']")
	private WebElement hightolowtext;
	
	public String highToLowValidation()
	{
		String result = hightolowtext.getText();
		return result;
	}
	
	
	
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	private WebElement menubutton;
	
	public void ClickMenuButton()
	{
		menubutton.click();
	}
	
	
	
	@FindBy(xpath= "//a[@id='about_sidebar_link']")
	private WebElement about;
	
	public void clickAbout()
	{
		about.click();
	}
	
	
	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	private WebElement logout;
	
	public void clickLogout()
	{
		logout.click();
	}
	
	
	@FindBy(xpath= "//a[@id='reset_sidebar_link']")
	private WebElement resetappstate;
	
	public void clickResetAppState()
	{
		resetappstate.click();
	}
	
	
	
	@FindBy(xpath="//a[text()='LinkedIn']")
	private WebElement linkedinlink;
	
	public void clickLinkedLink()
	{
		linkedinlink.click();
	}
	
	
	@FindBy(xpath= "//a[text()='Facebook']")
	private WebElement facebooklink;
	
	public void clickFacebookLink()
	{
		facebooklink.click();
	}
	
	@FindBy(xpath="//a[text()='Twitter']")
	private WebElement twitterlink;
	
	public void clickTwitterLink()
	{
		twitterlink.click();
	}
	
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	private WebElement addtocartbackpack;
	
	public void clickAddToCartButtonBackPack()
	{
		addtocartbackpack.click();
	}
	
	
	@FindBy(xpath ="//button[@id='add-to-cart-sauce-labs-bike-light']")
	private WebElement addtocartbikelight;
	
	public void clickAddToCartButtonBikeLIght()
	{
		addtocartbikelight.click();
	}
	
	
	@FindBy(xpath ="//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")
	private WebElement addtocartbolttshirt;
	
	public void clickAddToCartButtonBoltTshirt()
	{
		addtocartbolttshirt.click();
	}
	
	
	@FindBy(xpath= "//button[@id='add-to-cart-sauce-labs-fleece-jacket']")
	private WebElement addtocartfleecejacket;
	
	public void clickAddToCartButtonFleeceJacket()
	{
		addtocartfleecejacket.click();
	}
	
	
	@FindBy(xpath= "//button[@id='add-to-cart-sauce-labs-onesie']")
	private WebElement addtocartonesie;
	
	public void clickAddToCartButtonOnesie()
	{
		addtocartonesie.click();
	}
	
	
	@FindBy(xpath="//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")
	private WebElement addtocarttshirtred;
	
	public void clickAddToCartButtonTshirtRed()
	{
		addtocarttshirtred.click();
	}
	
	
	@FindBy(xpath="//button[@class='btn btn_primary btn_small btn_inventory']")
	private List <WebElement> allitems;
	
	public void clickAddToCartAllItems()
	{
		for(WebElement addall : allitems)
		{
			addall.click();
		}
	}
	
	
	
	@FindBy(xpath="//button[@id='back-to-products']")
	private WebElement backtoproduct;
	
	public void clickBackToProducts()
	{
		backtoproduct.click();
	}
	
	
	@FindBy(xpath="//button[@class='btn btn_secondary btn_small btn_inventory']")
	private List<WebElement> removeitem;
	
	public void clickRemoveButtonHomePage()
	{
		for(WebElement remove : removeitem)
		{
			remove.click();
		}
	}
	
	
	
	
	public HomePOMClass(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		s= new Select(dropdown);
	}
	
	
	
	

}
