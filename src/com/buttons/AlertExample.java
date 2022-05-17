package com.buttons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chrome driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		
		d.get("http://www.leafground.com/pages/Alert.html");
		d.manage().window().maximize();
		
		WebElement AlertBox = d.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));
		AlertBox.click();
		Thread.sleep(3000);
		d.switchTo().alert().accept();
		
		WebElement ConfirmBox = d.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		ConfirmBox.click();
		d.switchTo().alert().dismiss();
		
		WebElement PromptBox = d.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/button"));
		PromptBox.click();
		Thread.sleep(2000);
		PromptBox.sendKeys("Infomat");
		Thread.sleep(3000);
		d.switchTo().alert().accept();
		
		WebElement linebreak = d.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/button"));
		linebreak.click();
		Thread.sleep(3000);
		d.switchTo().alert().accept();
		
	
		
		
		
	}

}
