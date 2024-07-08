package com.ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class SignIn {

    public static void main(String[] args){

        System.setProperty("webdriver.edge.driver", "C:\\Users\\Devraj\\IdeaProjects\\EbayFinal2024\\src\\Driver\\edge\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement searchBox = driver.findElement(By.id("gh-ac"));
        searchBox.sendKeys("Laptop");
        searchBox.submit();

        WebElement results = driver.findElement(By.className("srp-controls__count-heading"));
        if (results.isDisplayed()) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }

        WebElement signIn = driver.findElement(By.id("gh-ug"));
        signIn.click();

        WebElement emailField = driver.findElement(By.id("userid"));
        emailField.sendKeys("sitanita382@gmail.com");

        WebElement continueFiled = driver.findElement(By.id("signin-continue-btn"));
        continueFiled.click();

        WebElement enterPass = wait.until(ExpectedConditions.elementToBeClickable(By.id("pass")));
        enterPass.sendKeys("nepaljapan2050");

        WebElement clickToEnter = driver.findElement(By.id("sgnBt"));
        clickToEnter.click();
    }
}
