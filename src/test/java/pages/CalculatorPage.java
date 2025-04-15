package pages;

import io.appium.java_client.android.AndroidDriver;

import java.net.URL;

import org.openqa.selenium.By;
import org.testng.Assert;

public class CalculatorPage {
    AndroidDriver driver;

    public CalculatorPage(AndroidDriver driver) {
        this.driver = driver;
    }

    // Locators may vary by device
    By btn9 = By.id("com.oneplus.calculator:id/digit_9");
    By btn6 = By.id("com.oneplus.calculator:id/digit_6");
    By btnPlus = By.id("com.oneplus.calculator:id/img_op_add");
    By btnEqual = By.id("com.oneplus.calculator:id/img_eq");
    By resultField = By.id("com.oneplus.calculator:id/result");
	

    public void addNumbers() {
        driver.findElement(btn9).click();
        driver.findElement(btnPlus).click();
        driver.findElement(btn6).click();
        driver.findElement(btnEqual).click();
    }

    public String getResult() {
        return driver.findElement(resultField).getText();
    }
}
