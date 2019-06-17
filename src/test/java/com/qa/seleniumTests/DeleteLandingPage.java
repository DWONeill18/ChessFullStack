package com.qa.seleniumTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class DeleteLandingPage {
	
	@FindBy(xpath = "//*[@id=\"deleteMessage\"]")
	private WebElement deleteMessage;

	@FindBy(xpath = "//*[@id=\"Game_id\"]")
	private WebElement game_idInput;
	
	@FindBy(xpath = "//*[@id=\"inputs\"]/button")
	private WebElement submitButton;

	public void typeDelete(String Game_Id, WebDriver driver) {
		game_idInput.sendKeys(Game_Id);	
		Actions action = new Actions(driver);
		action.moveToElement(submitButton)
		.click()
		.perform();
	}
	
	public String deleteMessageText() {
		return deleteMessage.getText();
	}
}
	
