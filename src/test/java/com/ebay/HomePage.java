package com.ebay;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import static org.junit.Assert.assertTrue;


public class HomePage {

    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Devraj\\IdeaProjects\\EbayFinal2024\\src\\Driver\\edge\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com");

        String title = driver.getTitle();
        if (title.equals("Electronics, Cars, Fashion, Collectibles & More | eBay")) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test failed");

        }
        driver.quit();
    }
}
