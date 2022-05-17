package com.buttons;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompleteEx {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\chrome driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();

		d.get("http://www.leafground.com/pages/autoComplete.html");
		d.manage().window().maximize();

		WebElement input = d.findElement(By.id("tags"));
		input.sendKeys("s");
		Thread.sleep(5000);
		List<WebElement> optionlist = d.findElements(By.xpath("//*[@id=\'ui-id-1\']/li"));
		System.out.println(optionlist.size());

		for (WebElement webElement : optionlist) {

			if (webElement.getText().equals("SOAP")) {
				webElement.click();
				System.out.println("Selecting" + webElement.getText());
				break;

			}

		}

	}

}
