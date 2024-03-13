package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world! browser open");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless", "false");
        WebDriver driver = new ChromeDriver(options);
        driver.get("http://www.google.com");
        driver.close();
        System.out.println("Hello world! browser close");
    }
}   