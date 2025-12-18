package hooks;

import base.DriverFactory;
import utils.ScreenshotUtils;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

    @Before
    public void setUp(Scenario scenario) {
        DriverFactory.initDriver();
        System.out.println("Starting: " + scenario.getName());
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            // This MUST be a byte array for the adapter to embed or link it correctly
            byte[] screenshot = ScreenshotUtils.getByteScreenshot();
            scenario.attach(screenshot, "image/png", "Failed Step Screenshot");
        }
        DriverFactory.quitDriver();
    }
}