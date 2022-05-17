package com.buttons;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chrome driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		
		d.get("http://www.leafground.com/pages/Dropdown.html");
		d.manage().window().maximize();
		
		WebElement dropdown1 = d.findElement(By.id("dropdown1"));
		Select select = new Select(dropdown1);
		select.selectByIndex(4);
		Thread.sleep(5000);
		
		select.selectByValue("2");
		Thread.sleep(3000);
		
		select.selectByVisibleText("UFT/QTP");
		
		List<WebElement>listofoptions = select.getOptions();
		int size = listofoptions.size();
		System.out.println("Number of elements:"+size);
		
		dropdown1.sendKeys("Selenium");
		
		WebElement multiselect = d.findElement(By.xpath("(//select)[6] "));
		Select multiselectbox = new Select(multiselect);
		multiselectbox.selectByIndex(2);
		multiselectbox.selectByIndex(3);
		multiselectbox.selectByIndex(4);
		
		
		
		
		
		

	}

}
