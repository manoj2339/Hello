package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class screenshot {

	public static String takeScreenshot(WebDriver driver, String procurezen) {
		String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
		String folderPath = "D:\\4Screenshot\\";
		String destPath = folderPath + procurezen + "_" + timestamp + ".png";

		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destFile = new File(destPath);

		try {
			FileUtils.copyFile(srcFile, destFile);
			System.out.println("Screenshot saved to: " + destPath);
		} catch (IOException e) {
			System.out.println("Error while saving screenshot: " + e.getMessage());
		}

		return destPath; // ✅ Return the path to the screenshot
	}
}
