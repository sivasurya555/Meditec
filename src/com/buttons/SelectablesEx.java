package com.buttons;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectablesEx {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "D:\\chrome driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();

		d.get("http://www.leafground.com/pages/selectable.html");
		d.manage().window().maximize();

		List<WebElement> selectale = d.findElements(By.xpath("//*[@id=\'selectable\']/li"));
		int size = selectale.size();
		System.out.println(size);
		
		/*Actions action = new Actions(d);
		action.keyDown(Keys.CONTROL)
		.click(selectale.get(0))
		.click(selectale.get(1))
		.click(selectale.get(2)).build().perform();*/
		
		Actions action = new Actions(d);
		action.clickAndHold(selectale.get(0));
		action.clickAndHold(selectale.get(1));
		action.clickAndHold(selectale.get(2));
		action.build().perform();
		
		

	}

}
