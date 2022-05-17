package com.buttons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipEx {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chrome driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		
		d.get("http://www.leafground.com/pages/tooltip.html");
		d.manage().window().maximize();
		
		WebElement name = d.findElement(By.id("age"));
		String Tooltipname = name.getAttribute("title");
		System.out.println(Tooltipname);
		
		

	}

}






