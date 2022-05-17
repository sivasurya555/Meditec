package com.buttons;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\chrome driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();

		d.navigate().to("http://www.leafground.com/pages/table.html");
		d.manage().window().maximize();
		Thread.sleep(3000);
		
		List<WebElement> columns = d.findElements(By.tagName("th"));
		int columncount = columns.size();
		System.out.println("Number of columns"+columncount);
		
		List<WebElement> rows = d.findElements(By.tagName("tr"));
		int rowcount = rows.size();
		System.out.println("Number of rows"+rowcount);
		
		WebElement getpercent = d.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[7]"));
		String percentage = getpercent.getText();
		System.out.println("Percentage is"+percentage);
		
		List<WebElement> allprogress = d.findElements(By.xpath("//td[2]"));
		
		List<Integer>numberlist = new ArrayList<Integer>();
		
		for (WebElement webElement : allprogress) {
			String individualvalue = webElement.getText().replace("%","");
			numberlist.add(Integer.parseInt(individualvalue));
		}
		System.out.println("Final list"+numberlist);
		
		int smallvalue = Collections.min(numberlist);
		System.out.println("Small value is"+smallvalue);
		
		String smallvaluestring = Integer.toString(smallvalue)+"%";
		String finalxpath ="//td[normalize-space()="+"\""+smallvaluestring+"\""+"]"+"//following::td[1]";
		System.out.println(finalxpath);
		
				//td[normalize-space()='20%']//following::td[1]	
		
		WebElement check = d.findElement(By.xpath(finalxpath));
		check.click();
		

	}

}
