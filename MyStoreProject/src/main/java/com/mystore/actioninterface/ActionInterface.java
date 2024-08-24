package com.mystore.actioninterface;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public @interface ActionInterface {

	void scrollByVisibilityOfElement(WebDriver driver, WebElement ele);

	void click(WebDriver driver, WebElement ele);

	boolean selectBySendkeys(String value, WebElement ele);

	/**
	 * select value from DropDown by using selectByIndex
	 * 
	 * @param locator     : Action to be performed on element (Get it from Object
	 *                    repository)
	 * 
	 * @param index       : Index of value wish to select from dropdown list.
	 * 
	 * @param locatorName : Meaningful name to the element (Ex:Year Dropdown, items
	 *                    Listbox etc..)
	 * 
	 */
	boolean selectByIndex(WebElement element, int index);

}
