package com.buttons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropEx {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "D:\\chrome driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		
		d.get("http://www.leafground.com/pages/drop.html");
		d.manage().window().maximize();
		
		WebElement from = d.findElement(By.id("draggable"));
		WebElement to = d.findElement(By.id("droppable"));
		
		Actions actions = new Actions(d);
		
		actions.dragAndDrop(from, to).build().perform();
		
		
		
		

	}

}
