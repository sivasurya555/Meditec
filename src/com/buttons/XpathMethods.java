package com.buttons;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class XpathMethods {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\chrome driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();

		d.get("https://www.makemytrip.com/flights/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement screen = d.findElement(By.xpath("//div[@class='landingContainer']"));
		screen.click();
		/*WebElement hotels = d.findElement(By.xpath("//*[@class='headerOuter']//child::li[2]"));
		hotels.click();
		Thread.sleep(5000);*/

		/*WebElement hotels = d.findElement(
				By.xpath("//*[@class='chNavIcon appendBottom2 chSprite chHotels active']//ancestor::div[3]"));
		hotels.click();*/

		WebElement from = d.findElement(By.xpath("//*[@class='lbl_input latoBold  appendBottom5']"));
		from.click();
		WebElement chennai = d.findElement(By.xpath("//*[text()='Chennai, India']"));
		chennai.click();
		WebElement to = d.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[2]/label/span"));
		to.click();
		WebElement goa = d.findElement(By.xpath("//*[text()='Goa, India']"));
		goa.click();
	

	
		
	
		

	}

}
