package org.Utlities;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryClass extends BaseClass {
	
	public  PageFactoryClass() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name ="q")
	private WebElement google;
	
	
	@FindBy(xpath= "(//div[@role='heading'])[2]")
	private WebElement amazon;
	
	@FindBy(id = "nav-link-accountList")
	private WebElement amazonlgn;
	
	@FindBy(xpath = "//input[@type='email']")
	private WebElement signin;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement Continue;
	
	@FindBy(xpath ="//*[@id='ap_password']")
	private WebElement pass;
	
	@FindBy(xpath = "//*[@id='signInSubmit']")
	private WebElement signpass;

	@FindBy(xpath = "//*[@id='nav-search-dropdown-card']")
	private WebElement all;
	
	@FindBy(xpath = "//*[@id='searchDropdownBox']/option[17]")
	private WebElement electronics;
	
	@FindBy(xpath = "//*[@id='twotabsearchtextbox']")
	private WebElement searchbar;
	
	@FindBy(xpath = "//*[@id='low-price']")
	private WebElement minvalue;
	
	@FindBy(xpath ="//*[@id='high-price']")
	private WebElement maxvalue;
	
	@FindBy(xpath = "//*[@id='a-autoid-1']/span")
	private WebElement go;
	
	@FindBy(xpath = "(//a[@class='s-pagination-item s-pagination-button'])[1]")
	private WebElement nxtpage;
	
	@FindBy(xpath = "//span[text()='Create a Wish List']")
	private WebElement wishlist;
	
	@FindBy(xpath = "(//input[@class='a-button-input a-declarative'])[3]")
	private WebElement createlist;
	
	@FindBy(xpath = "(//span[@class='a-size-medium a-color-base a-text-normal'])[8]")
	WebElement secprod;
	
	@FindBy(xpath = "/html/body/div[2]/div[2]/div[5]/div[4]/div[1]/div[3]/div/div/div/form/div/div/div/div/div[6]/div[3]/div[1]/span[1]/span/input")
	private WebElement wish1;
	
	@FindBy(xpath = "//span[@id='atwl-list-name-3OKX6N1JHX028']")
	private WebElement shopList1;
	
	@FindBy(xpath = "(//button[@class=\" a-button-close a-declarative'])[2]")
	private WebElement close1;
	 
	
	
	public WebElement getGoogle() {
		return google;
	}

	public void setGoogle(WebElement google) {
		this.google = google;
	}

	public WebElement getAmazon() {
		return amazon;
	}

	public void setAmazon(WebElement amazon) {
		this.amazon = amazon;
	}

	public WebElement getAmazonlgn() {
		return amazonlgn;
	}

	public void setAmazonlgn(WebElement amazonlgn) {
		this.amazonlgn = amazonlgn;
	}

	public WebElement getSignin() {
		return signin;
	}

	public void setSignin(WebElement signin) {
		this.signin = signin;
	}

	public WebElement getContinue() {
		return Continue;
	}

	public void setContinue(WebElement continue1) {
		Continue = continue1;
	}

	public WebElement getPass() {
		return pass;
	}

	public void setPass(WebElement pass) {
		this.pass = pass;
	}

	public WebElement getSignpass() {
		return signpass;
	}

	public void setSignpass(WebElement signpass) {
		this.signpass = signpass;
	}

	public WebElement getAll() {
		return all;
	}

	public void setAll(WebElement all) {
		this.all = all;
	}

	public WebElement getElectronics() {
		return electronics;
	}

	public void setElectronics(WebElement electronics) {
		this.electronics = electronics;
	}

	public WebElement getSearchbar() {
		return searchbar;
	}

	public void setSearchbar(WebElement searchbar) {
		this.searchbar = searchbar;
	}

	public WebElement getMinvalue() {
		return minvalue;
	}

	public void setMinvalue(WebElement minvalue) {
		this.minvalue = minvalue;
	}

	public WebElement getMaxvalue() {
		return maxvalue;
	}

	public void setMaxvalue(WebElement maxvalue) {
		this.maxvalue = maxvalue;
	}

	public WebElement getGo() {
		return go;
	}

	public void setGo(WebElement go) {
		this.go = go;
	}

	public WebElement getNxtpage() {
		return nxtpage;
	}

	public void setNxtpage(WebElement nxtpage) {
		this.nxtpage = nxtpage;
	}

	public WebElement getWishlist() {
		return wishlist;
	}

	public void setWishlist(WebElement wishlist) {
		this.wishlist = wishlist;
	}

	public WebElement getCreatelist() {
		return createlist;
	}

	public void setCreatelist(WebElement createlist) {
		this.createlist = createlist;
	}

	public WebElement getSecprod() {
		return secprod;
	}

	public void setSecprod(WebElement secprod) {
		this.secprod = secprod;
	}

	public WebElement getWish1() {
		return wish1;
	}

	public void setWish1(WebElement wish1) {
		this.wish1 = wish1;
	}

	public WebElement getShopList1() {
		return shopList1;
	}

	public void setShopList1(WebElement shopList1) {
		this.shopList1 = shopList1;
	}

	public WebElement getClose1() {
		return close1;
	}

	public void setClose1(WebElement close1) {
		this.close1 = close1;
	}
	

}
