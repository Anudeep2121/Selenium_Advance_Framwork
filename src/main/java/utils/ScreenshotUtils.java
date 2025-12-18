package utils;

import base.DriverFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenshotUtils {

    /**
     * Captures screenshot in Base64 format. 
     * Useful for direct embedding into HTML reports or custom logs.
     */
    public static String getBase64Screenshot() {
        return ((TakesScreenshot) DriverFactory.driver)
                .getScreenshotAs(OutputType.BASE64);
    }

    /**
     * Captures screenshot as a Byte Array.
     * This is what Cucumber's scenario.attach() method requires.
     */
    public static byte[] getByteScreenshot() {
        return ((TakesScreenshot) DriverFactory.driver)
                .getScreenshotAs(OutputType.BYTES);
    }
}