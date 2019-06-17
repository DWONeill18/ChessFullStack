package com.qa.seleniumTests;

import static org.junit.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import com.qa.Categories.TestCat1;
import com.qa.Categories.TestCat2;
import com.qa.Categories.TestCat3;
import com.qa.Categories.TestCat4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Tests {

	WebDriver driver;
	Actions action;

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/David/Documents/GitHub/ChessDatabase/ChessDatabaseAPI/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@After
	public void finisher() {
		driver.quit();
	}

	@Test
	@Category(TestCat1.class)
	public void createTest() {
		driver.manage().window().maximize();
		driver.get("http://35.242.174.17:8080/ChessDatabaseAPI-1.0/create.html");
		driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
		CreateLandingPage laPage = PageFactory.initElements(driver, CreateLandingPage.class);
		laPage.typeCreate("w", "b", "1-0", "A01", "1. c4", driver);
		driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
		String confirmation = laPage.createMessageText();
		assertEquals("Success!!", confirmation);
	}

	@Test
	@Category(TestCat2.class)
	public void readTest() {
		driver.manage().window().maximize();
		driver.get("http://35.242.174.17:8080/ChessDatabaseAPI-1.0/read.html");
		driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
		ReadLandingPage laPage = PageFactory.initElements(driver, ReadLandingPage.class);
		laPage.typeRead("50", driver);
		driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
		assertEquals("Kasparov", driver.findElement(By.xpath("//*[@id=\"White\"]")).getAttribute("value"));
		assertEquals("Karpov", driver.findElement(By.xpath("//*[@id=\"Black\"]")).getAttribute("value"));
		assertEquals("1-0", driver.findElement(By.xpath("//*[@id=\"Result\"]")).getAttribute("value"));
		assertEquals("A01", driver.findElement(By.xpath("//*[@id=\"Eco\"]")).getAttribute("value"));
		assertEquals("1. c4", driver.findElement(By.xpath("//*[@id=\"Notation\"]")).getAttribute("value"));
	}

	@Test
	@Category(TestCat3.class)
	public void deleteTest() {
		driver.manage().window().maximize();
		driver.get("http://35.242.174.17:8080/ChessDatabaseAPI-1.0/delete.html");
		driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
		DeleteLandingPage laPage = PageFactory.initElements(driver, DeleteLandingPage.class);
		laPage.typeDelete("74", driver);
		driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
		String confirmation = laPage.deleteMessageText();
		assertEquals("Success!!", confirmation);
		
	}
	
	@Test
	@Category(TestCat4.class)
	public void updateTest() {
		driver.manage().window().maximize();
		driver.get("http://35.242.174.17:8080/ChessDatabaseAPI-1.0/update.html");
		driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
		UpdateLandingPage laPage =  PageFactory.initElements(driver, UpdateLandingPage.class);
		laPage.typeFindGame("63", driver);
		driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
		assertEquals("Kasparov", driver.findElement(By.xpath("//*[@id=\"White\"]")).getAttribute("value"));
		assertEquals("Karpov", driver.findElement(By.xpath("//*[@id=\"Black\"]")).getAttribute("value"));
		assertEquals("1-0", driver.findElement(By.xpath("//*[@id=\"Result\"]")).getAttribute("value"));
		assertEquals("A01", driver.findElement(By.xpath("//*[@id=\"Eco\"]")).getAttribute("value"));
		assertEquals("1. c4", driver.findElement(By.xpath("//*[@id=\"Notation\"]")).getAttribute("value"));
		
		laPage.typeUpdate("Kasparov", "Karpov", "1-0", "A01", "1. c4", driver);
		driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
		String confirmation = laPage.updateMessageText();
		assertEquals("Success!!", confirmation);
		
	}
	
}
