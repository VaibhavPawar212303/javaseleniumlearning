package utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.baseTest;

public class ElementFetch {

	public WebElement getWebElement(String indenfierType, String identifierValue) {
		switch (indenfierType) {
		case "XPATH":
			return baseTest.driver.findElement(By.xpath(identifierValue));
		case "CSS":
			return baseTest.driver.findElement(By.cssSelector(identifierValue));
		case "ID":
			return baseTest.driver.findElement(By.id(identifierValue));

		default:
			return null;
		}
	}

	public List<WebElement> getWebElements(String indenfierType, String identifierValue) {
		switch (indenfierType) {
		case "XPATH":
			return baseTest.driver.findElements(By.xpath(identifierValue));

		case "CSS":
			return baseTest.driver.findElements(By.cssSelector(identifierValue));
		case "ID":
			return baseTest.driver.findElements(By.id(identifierValue));

		default:
			return null;
		}

	}

}
