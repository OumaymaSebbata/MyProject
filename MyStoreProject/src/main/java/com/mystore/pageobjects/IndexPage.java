package com.mystore.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class IndexPage extends BaseClass {
	
	WebElement SearchBox = (WebElement) driver.findElements(By.id("search_query_top"));
	WebElement SearchButton = driver.findElement(By.name("submit_search"));
	WebElement SignInBtn = driver.findElement(By.cssSelector("img.login"));
	WebElement ContactUs = driver.findElement(By.cssSelector("img.logo"));
	//Constructor to initialize pages
	
	public IndexPage() 
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickOnSignIn ()  
	{
		Action.click(driver,SignInBtn)
	}
	
}
