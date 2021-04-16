package com.Ecommerce.Skillrary.genericlib;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
/**
 * 
 * @author QSP
 *
 */
public class WebDriverUtilies {
	/**
	 * Select the values from the dropdown based on visbiletext
	 * @param element
	 * @param text
	 */
	public void select(WebElement element,String text) {
		Select s=new Select(element);
		s.selectByVisibleText(text);
	}
	
	public void uploadPopup() throws IOException {
		Runtime.getRuntime().exec("C:\\Users\\QSP\\Desktop\\AutoITdemo\\sr.exe");
	}
/**
 * used to take the mouse cursor on the excepted element on the browser
 * @param driver
 * @param element
 */
	
	public void mouseToExpectedElement(WebDriver driver,WebElement element) {
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
	}
	/**
	 * used to double click on the excepted element on the browser
	 * @param driver
	 * @param element
	 */
	public void doubleClickOnExpectedElement(WebDriver driver,WebElement element) {
		Actions act=new Actions(driver);
		act.doubleClick(element).perform();
	}
	/**
	 * used to switch to another browser window based on browser title
	 * @param driver
	 * @param browserTitle
	 */
	public void switchToBrowser(WebDriver driver,String browserTitle) {
		Set<String> set = driver.getWindowHandles();
		for(String b:set) {
			driver.switchTo().window(b);
			String actPageTitle=driver.getTitle();
			if(actPageTitle.contains(browserTitle)) {
				break;
			}
		}}
	/**
	 * used to switch to alert popup and click on Ok button
	 * @param driver
	 */
		
		public void alertOk(WebDriver driver) {
			driver.switchTo().alert().accept();
		}
		/**
		 * used to switch to alert popup and click on Cancel button
		 * @param driver
		 */
		
		public void alertCancel(WebDriver driver) {
			driver.switchTo().alert().dismiss();
		}	
			/**
			 * used to switch the control from web page to frame
			 * @param driver
			 */
			public void switchToFrame(WebDriver driver) {
				driver.switchTo().frame(0);
			}
			/**
			 * used to switch the control from frame to web page
			 * @param driver
			 */
			public void switchBackFromFrame(WebDriver driver) {
				driver.switchTo().defaultContent();
			}
			/**
			 * used to scroll to excepted element in the webpage
			 * @param driver
			 */
			public void scrollToparticularElement(WebDriver driver,WebElement ele) {
				JavascriptExecutor js=(JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView(true)",ele);
			}	
			/**
			 * used to perform click action on the excepeted element on te browser
			 * @param driver
			 * @param element
			 */
				public void clickOnElement(WebDriver driver,WebElement element) {
					JavascriptExecutor js=(JavascriptExecutor) driver;
				js.executeScript("arguments[0].click()",element);
				}
				/**
				 * used to wait for excepeted element in GUI
				 * @param ele
				 * @throws InterruptedException
				 */
				
				public void waitForelement(WebElement ele) throws InterruptedException {
					int count=0;
					while(count<30) {
						try {
						ele.isDisplayed();
						break;
						}
						catch(Throwable e) {
							Thread.sleep(5000);
							count++;
						}
					}
				}
				/**
				 * used to wait for excpeted element to be visbile in GUI
				 * @param driver
				 * @param element
				 */
				public void waitforElemenVisbility(WebDriver driver,WebElement element) {
					WebDriverWait wait=new WebDriverWait(driver,10);
					wait.until(ExpectedConditions.visibilityOf(element));
				}
				/**
				 * used to perform drag and drop
				 * @param driver
				 * @param source
				 * @param target
				 */
				public void dragDrop(WebDriver driver,WebElement source,WebElement target) {
					Actions a=new Actions(driver);
					a.dragAndDrop(source, target).perform();
				}
				
				/**
				 * Navigating back
				 * @param driver
				 */
				public void nagvigateBack(WebDriver driver) {
					driver.navigate().back();
				}
				/**
				 * Verification 
				 * @param actual
				 * @param expected
				 * @param Page
				 */
				
				public void verify(String actual,String expected,String Page){
					Assert.assertEquals(actual, expected);
					Reporter.log(Page+" is dispalyed ",true);
				}
				/**
				 * Verify the success msg
				 * @param actual
				 * @param expected
				 */
				public void verifyScuccessMsg(String actual,String expected) {
					Assert.assertEquals(actual, expected);
					
				}
				/**
				 * To take the screenshot
				 * @param driver
				 * @throws IOException
				 */
				
				
				public void takeScreenShot(WebDriver driver,String name) throws IOException {
					Date d=new Date();
					String date = d.toString().replaceAll("-",":");
					
					TakesScreenshot t=(TakesScreenshot) driver;
					File src = t.getScreenshotAs(OutputType.FILE);
					File dest=new File(AutoConstant.photoPath+date+".png");
					FileUtils.copyFile(src, dest);
				}
		
		
	}


