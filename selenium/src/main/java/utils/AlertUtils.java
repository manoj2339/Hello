package utils;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

public class AlertUtils {

    private WebDriver driver;

    public AlertUtils(WebDriver driver) {
        this.driver = driver;
    }
 
    // Get alert message text
    public String getAlertText() {
        try {
            Alert alert = driver.switchTo().alert();
            return alert.getText();
        } catch (NoAlertPresentException e) {
            return null;
        }
    }

    // Accept the alert
    public void acceptAlert() {
        try {
            driver.switchTo().alert().accept();
        } catch (NoAlertPresentException e) {
            System.out.println("No alert to accept.");
        }
    }

    // Dismiss the alert
    public void dismissAlert() {
        try {
            driver.switchTo().alert().dismiss();
        } catch (NoAlertPresentException e) {
            System.out.println("No alert to dismiss.");
        }
    }

    // Send text to alert (for prompt alerts)
    public void sendTextToAlert(String text) {
        try {
            driver.switchTo().alert().sendKeys(text);
        } catch (NoAlertPresentException e) {
            System.out.println("No alert to send text to.");
        }
    }

    // Check if alert is present
    public boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}