package com.buttons;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonsExample {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "D:\\chrome driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		
		d.get("http://www.leafground.com/pages/Button.html");
		d.manage().window().maximize();
		Thread.sleep(5000);
		//get the position
		
		WebElement getpositionB = d.findElement(By.id("position"));
		Point xypoint = getpositionB.getLocation();
		int xValue = xypoint.getX();
		int yValue = xypoint.getY();
		System.out.println("X value is:"+xValue +"Y value is:"+yValue);
		
		// find the color
		
		WebElement colorB = d.findElement(By.id("color"));
		String color = colorB.getCssValue("background-color");
		System.out.println("Button color is:"+color);
		
		// find the size
		
		WebElement sizeB = d.findElement(By.id("size"));
		int height = sizeB.getSize().getHeight();
		int width = sizeB.getSize().getWidth();
		System.out.println("Height is:"+height + "Width is:"+width);
		
		// go to homepage
		
		d.findElement(By.id("home")).click();
		Thread.sleep(5000);
		

	}

}
