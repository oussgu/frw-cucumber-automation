package com.e2etests.automation.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * This class is used to select value from dropdown list.
 */
public class SelectFromListUtils {

	/**
	 * This method is used to select value from dropdown list by visible text. Here
	 * we need to have two parameters locator type and string text.
	 * 
	 * @param element element to be selected
	 * @param text    The exactly displayed text of a particular option
	 */
	public void selectDropDownListByVisibleText(WebElement element, String text) {
		Select dropDownList = new Select(element);
		dropDownList.selectByVisibleText(text);
	}

	/**
	 * This method is used to select value from dropdown list by index. Here we need
	 * to have two parameters locator type and option index.
	 * 
	 * @param element element to be selected
	 * @param index   the index of the option to be selected
	 */
	public void selectDropDownListByIndex(WebElement element, int index) {
		Select dropDownList = new Select(element);
		dropDownList.selectByIndex(index);
	}

	/**
	 * This method is used to select value from dropdown list by value. Here we need
	 * to have two parameters locator type and string text.
	 * 
	 * @param element element to be selected
	 * @param value   value of the “value” attribute
	 */
	public void selectDropDownListByValue(WebElement element, String value) {
		Select dropDownList = new Select(element);
		dropDownList.selectByValue(value);
	}
	

	

	    // ...

	    /**
	     * This method is used to find an element in a table by email.
	     * It iterates through the table rows and checks if the email is present in any column.
	     * Returns the matching WebElement if found, or null otherwise.
	     *
	     * @param table The table WebElement
	     * @param email The email to search for
	     * @return The matching WebElement if found, or null otherwise
	     */
	    public WebElement findElementByElementInTable(WebElement table, String email) {
	        // Get all table rows
	        java.util.List<WebElement> rows = table.findElements(By.tagName("tr"));

	        // Iterate through the rows
	        for (WebElement row : rows) {
	            // Get all columns in the current row
	            java.util.List<WebElement> columns = row.findElements(By.tagName("td"));

	            // Iterate through the columns
	            for (WebElement column : columns) {
	                // Check if the email is present in the column
	                if (column.getText().equals(email)) {
	                    return row;
	                }
	            }
	        }

	        return null; // Email not found
	    }

	    // ...
	}
	


