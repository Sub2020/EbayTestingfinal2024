package com.ebay;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.io.IOException;

public class SearchForItem {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Devraj\\IdeaProjects\\EbayFinal2024\\src\\Driver\\edge\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com");

        WebElement searchBox = driver.findElement(By.id("gh-ac"));
        searchBox.sendKeys("Laptop");
        searchBox.submit();

        WebElement results = driver.findElement(By.className("srp-controls__count-heading"));
        if (results.isDisplayed()) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }

        try {
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshot, new File("screenshot.png"));
            System.out.println("Screenshot taken and saved as screenshot.png");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}

