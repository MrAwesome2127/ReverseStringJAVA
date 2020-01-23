import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {


	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("The Nightmare Before Christmas");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@class='hsuHs']")).click();
//		itakeSnapShot(driver, "C:\\screenshot.png");
//		Boolean l = driver.findElement(By.xpath("//h3[contains(text(),\"Watch Tim Burton's The Nightmare Before Christmas | Prime ...\")]")).isEnabled();
//		int count = 0;
//		while (l != true) {
//			if (count >= 45) {
//				driver.quit();
//			}
//			count++;
//		}
		WebElement element = driver.findElement(By.xpath("//h3[contains(text(),'Watch Tim Burton''s The Nightmare Before Christmas | Prime ...')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(500); 
		
		driver.findElement(By.xpath("//h3[contains(text(),'OFFICIAL The Nightmare Before Christmas Shirts & M')]")).click();
//		itakeSnapShot(driver, "C:\\screenshot.png");
		System.out.println("Searching Text");
		driver.quit();
		
	}

	/**
	 * This function will take screenshot
	 * @param webdriver
	 * @param fileWithPath
	 * @throws Exception
	 */
	private static void itakeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{
		//Convert web driver object to TakeScreenshot
		TakesScreenshot scrShot =((TakesScreenshot)webdriver);
		//Call getScreenshotAs method to create image file
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		//Move image file to new destination
		File DestFile=new File(fileWithPath);
		//Copy file at destination	
		FileUtils.copyFile(SrcFile, DestFile);
	}

}
