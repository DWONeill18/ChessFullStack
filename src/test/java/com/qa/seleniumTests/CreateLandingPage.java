package com.qa.seleniumTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class CreateLandingPage {

	@FindBy(xpath = "//*[@id=\"message\"]")
	private WebElement createMessage;
	
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
	
	@FindBy(xpath = "//*[@id=\"inputs\"]/button")
	private WebElement submitButton;

	public void typeCreate(String White, String Black, String Result, String Eco, String Notation, WebDriver driver) {
		whiteInput.sendKeys(White);
		blackInput.sendKeys(Black);
		resultInput.sendKeys(Result);
		ecoInput.sendKeys(Eco);
		notationInput.sendKeys(Notation);
		Actions action = new Actions(driver);
		action.moveToElement(submitButton)
		.click()
		.perform();
		
		//click submit button
		
	}
	
	
	public String createMessageText() {
		return createMessage.getText();
	}

}
