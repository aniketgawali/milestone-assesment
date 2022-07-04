package com.mindtree.seleniumclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selenium010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//navigate to moneycontrol site and maximize the page
		driver.get("https://www.moneycontrol.com");
		driver.manage().window().maximize();
		//1. mouse hover on personal finance and click on income tax calculator
		driver.findElement(By.linkText("Personal Finance")).click();
		//2.choose withouth exemption and click on buttomm 
		driver.findElement(By.xpath("//a[@title='Income Tax Calculator']")).click();
		//3.enter your age in the basic info tab
		driver.findElement(By.id("age")).sendKeys("25");
		//4.in residential statusdrop down choose stay in non metrocity
		Select s=new Select(driver.findElement(By.className("custselect")));
		s.deselectByVisibleText("Stay in Non Metro city");
		//5.click on next button .income to be display
		driver.findElement(By.xpath("//a[@class='btn_common nextfrm MR10 calculateTax']")).click();
		//6.enter anual sallary with the ammount 150000....click on nextdiduction should be display
		driver.findElement(By.id("//input[@id='annual_salary']")).sendKeys("15000");
		driver.findElement(By.id("//a[@id='income_tab_next']")).click();
		
		
		
	}
	

}
