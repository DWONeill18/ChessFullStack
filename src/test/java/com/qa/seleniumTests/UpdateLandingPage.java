package com.qa.seleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class UpdateLandingPage {

	@FindBy(xpath = "//*[@id=\"Game_id\"]")
	private WebElement game_idInput;
	
	@FindBy(xpath = "//*[@id=\"inputs\"]/button[1]")
	private WebElement FindGameButton;
	
	@FindBy(xpath = "//*[@id=\"inputs\"]/button[2]")
	private WebElement UpdateButton;
	
	public void typeFindGame(String Game_Id, WebDriver driver) {
		game_idInput.sendKeys(Game_Id);	
		Actions action = new Actions(driver);
		action.moveToElement(FindGameButton)
		.click()		
		.perform();
	}
	
	@FindBy(xpath = "//*[@id=\"White\"]")
	private WebElement whiteInput;
	
	@FindBy(xpath = "//*[@id=\"Black\"]")
	private WebElement blackInput;
	
	@FindBy(xpath = "//*[@id=\"Result\"]")
	private WebElement resultInput;
	
	@FindBy(xpath = "//*[@id=\"Eco\"]")
	private WebElement ecoInput;
	
	@FindBy(xpath = "//*[@id=\"Notation\"]")
	private WebElement notationInput;
	
	@FindBy(xpath = "//*[@id=\"updateMessage\"]")
	private WebElement updateMessage;
	
	public void typeUpdate(String White, String Black, String Result, String Eco, String Notation, WebDriver driver) {
		driver.findElement(By.xpath("//*[@id=\"White\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"Black\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"Result\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"Eco\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"Notation\"]")).clear();
		whiteInput.sendKeys(White);
		blackInput.sendKeys(Black);
		resultInput.sendKeys(Result);
		ecoInput.sendKeys(Eco);
		notationInput.sendKeys(Notation);
		Actions action = new Actions(driver);
		action.moveToElement(UpdateButton)
		.click()
		.perform();
	}
	
	public String updateMessageText() {
		return updateMessage.getText();
	}
}
