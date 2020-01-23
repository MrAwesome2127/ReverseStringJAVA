package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
	
	public static void main(String[] args) {
		
		String cgrom
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com/");
		driver.findElement(By.xpath("//*[@id=\"fakebox-cursor\"]")).sendKeys("test");
	    driver.findElement(By.xpath("//*[@id=\"fakebox\"]/div[1]")).click();
	    System.out.println("Searching Text");
		driver.quit();
		
		try {
			
		}catch(Exception ex){
			
		}
	}
	
}
