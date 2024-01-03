package org.example;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    static AppiumDriver driver;

    public static void main(String[] args) throws MalformedURLException {

        DesiredCapabilities cap = new DesiredCapabilities();

        openCalculator();

    }

    public static void openCalculator() throws MalformedURLException {

        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability("deviceName", "Mi 11 Lite");
        cap.setCapability("udid", "9c5b17dd");
        cap.setCapability("platformDevice", "Android");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "12 SKQ1.210908.001");

        cap.setCapability("appPackage", "com.miui.calculator");
        cap.setCapability("appActivity", "com.miui.calculator.cal.CalculatorActivity");

        URL url = new URL("http://192.168.1.104:4723/wd/hub");

        driver = new AppiumDriver(url, cap);
        System.out.println("Aplication started...");

    }
}