package com.week3;

import java.util.Base64;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Loops extends Base {
	
	@Test
    public void interaction_Test() {
        driver.get("https://jqueryui.com/");
//(1): Locating Draggable Element
        WebElement draggableElement = driver.findElement(By.partialLinkText("Draggable"));
        draggableElement.click();
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
        WebElement dragMeBoxElem = myLibrary.waitUntilElementPresence(By.id("draggable"));
        new Actions(driver).dragAndDropBy(dragMeBoxElem, 150, 0).build().perform();
        driver.switchTo().defaultContent();
        myLibrary.customWait(1);
//(2) Locating the Droppable Element
        WebElement droppableElement = driver.findElement(By.partialLinkText("Droppable"));
        droppableElement.click();
        
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));
        new Actions(driver).dragAndDrop(source, target).build().perform();
//    [delete]    Actions a = new Actions(driver);
//    [delete]    a.dragAndDrop(source, target).build().perform();
//(3) Locating Resizable Element
        driver.switchTo().defaultContent();
        myLibrary.customWait(1);
        WebElement resizingElem = driver.findElement(By.partialLinkText("Resizable"));
        resizingElem.click();
        
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
        WebElement resizedBoxElem = driver.findElement(By.id("resizable"));
        //resizedBoxElem.click();
        WebElement resizingArrow = driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
        new Actions(driver).dragAndDrop(source, target).build().perform();
       // a.clickAndHold(resizingArrow).moveByOffset(80, 120).release(resizingArrow).build().perform();
        myLibrary.customWait(2);
//(4) Locating Selectable Element
       driver.switchTo().defaultContent();
        myLibrary.customWait(1.5);
        WebElement selectElem = driver.findElement(By.partialLinkText("Selectable"));
        selectElem.click();
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
        List<WebElement> itemList = driver.findElements(By.cssSelector(".ui-widget-content.ui-selectee"));
        WebElement topItem = itemList.get(0);
        WebElement lastItem = itemList.get(6);
        myLibrary.customWait(0.5);
        a.click(topItem).clickAndHold().moveToElement(lastItem).moveByOffset(320, 0).release().build().perform();
        myLibrary.customWait(1.5);
//     (5)Locating Sortable Element
        driver.switchTo().defaultContent();
        myLibrary.customWait(1.5);
        WebElement SortableElem = driver.findElement(By.partialLinkText("Sortable"));
        myLibrary.customWait(1);
        SortableElem.click();
        myLibrary.customWait(.5);
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
        List<WebElement> sortedList = driver.findElements(By.tagName("li"));
        WebElement targ = sortedList.get(0);
        WebElement dest = sortedList.get(3);
        a.click(targ).clickAndHold().moveToElement(dest).moveByOffset(0, 10).release().build().perform();
        myLibrary.customWait(3);
	



	

			}
		


		
		
	
	


		
	
		

	


