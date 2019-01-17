import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class MacCalcAppWithAppium {
    private AppiumDriver driver;

    @BeforeTest
    public void setUp() throws IOException {
        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("platformName", "Mac");
        caps.setCapability("deviceName", "Mac");

        caps.setCapability("app", "Calculator");
        driver = new AppiumDriver(new URL("http://localhost:4723/wd/hub"), caps);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void testActivityMonitor() {
        String windowPath = "/AXApplication[@AXTitle='Calculator']/AXWindow[0]/AXGroup[1]";
        driver.findElementByXPath(windowPath + "/AXButton[@AXDescription='clear']").click();
        driver.findElementByXPath(windowPath + "/AXButton[@AXDescription='two']").click();
        driver.findElementByXPath(windowPath + "/AXButton[@AXDescription='add']").click();
        driver.findElementByXPath(windowPath + "/AXButton[@AXDescription='one']").click();
        driver.findElementByXPath(windowPath + "/AXButton[@AXDescription='three']").click();
        driver.findElementByXPath(windowPath + "/AXButton[@AXDescription='equals']").click();
    }

    @AfterTest
    public void tearDown() {
        try {
            driver.quit();
        } catch (Exception ign) {
        }
    }


}
