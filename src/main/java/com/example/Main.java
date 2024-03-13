package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world! Working with selenium and java");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
    }
}