package com.buttons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadAFile {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chrome driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();

		d.get("http://www.leafground.com/pages/download.html");
		d.manage().window().maximize();
		
		

	}

}
