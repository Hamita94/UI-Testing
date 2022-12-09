package org.Utlities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Amazon  extends BaseClass{
	
	@Test
	public void Amazon() throws AWTException, InterruptedException {
		launchChrome();
		driver.get("https://www.google.com/");
		PageFactoryClass pc = new PageFactoryClass();
		btnclick(pc.getGoogle());
		fill(pc.getGoogle(), "amazon");
	Thread.sleep(5000);	
	List<WebElement> e =	driver.findElements(By.xpath("//ul[@role='listbox']//following::li"));
//	for (int i =0; i< e.size(); i++) {
//		String s = e.get(i).getText();
//		System.out.println("text :" + s);
//		
//	}
	for (WebElement web: e) {
		System.out.println(web.getText());
	}
		//driver.close();
		//launchChrome();
//		Robot r = new Robot();
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//		Thread.sleep(5000);	
		
		
	driver.get("https://www.amazon.in/your-account");
	Thread.sleep(3000);	
	btnclick(pc.getAmazonlgn());
     fill(pc.getSignin(),"9003982213");
     btnclick(pc.getContinue());
     fill(pc.getPass(), "123456789");
     btnclick(pc.getSignpass());
     btnclick(pc.getAll());
     btnclick(pc.getElectronics());
     fill(pc.getSearchbar(), "Dell computers");
 	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	fill(pc.getMinvalue(), "30,000");
	fill(pc.getMaxvalue(), "50,000");
	btnclick(pc.getGo());
	WebElement ele = driver.findElement(By.xpath("(//div[@class='sg-row'])[5]"));
	System.out.println(ele.getText());
	Thread.sleep(5000);
	scroll(pc.getNxtpage());
	Thread.sleep(3000);	
	btnclick(pc.getNxtpage());
	Thread.sleep(5000);
	WebElement ele1 = driver.findElement(By.xpath("(//div[@class='sg-row'])[15]"));
	System.out.println(ele1.getText());
	
	Actions a = new Actions(driver);
	a.moveToElement(pc.getAmazonlgn()).perform();
	btnclick(pc.getWishlist());
	Thread.sleep(3000);
	btnclick(pc.getCreatelist());
	Thread.sleep(5000);
	back();
	back();
	Thread.sleep(3000);
	btnclick(pc.getSecprod());
	Thread.sleep(8000);
	//JavaExecutorclick(pc.getWish1());
	scroll(pc.getWish1());
	//btnclick(pc.getWish1());
	//btnclick(pc.getShopList1());
	//btnclick(pc.getClose1());
	
	
	//btnclick(pc.getAmazonlgn());
//	int assert1 = 30000;
//	int assert2 = 50000;
//	Assert.assert(assert2 ,"price");
     
	//driver.get("https://www.amazon.in/your-account");
	}

}
