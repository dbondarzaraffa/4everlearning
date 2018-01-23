package steps;

import base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;

public class Hook extends BaseUtil {

    private BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void InitializeTest() {

        /*
         * Chrome Driver
         */
        System.out.println("\n" + "!!START!! Opening the browser : Googole Chrome");
        System.setProperty("webdriver.chrome.driver",
                "C:\\Program Files\\driver\\chromedriver.exe");
        System.setProperty("chromeoptions.args", "disable-infobars");
        base.Driver = new ChromeDriver();
        base.Driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(base.Driver, 10, 500);
    }

//    public void InitializeTest() {
//
//        /*
//         * Firefox Driver
//         */
//        System.out.println("\n" + "!!START!! Opening the browser : Firefox");
//        System.setProperty("webdriver.Firefoxdriver",
//                "C:\\Program Files\\driver\\geckodriver.exe");
//
//        System.setProperty("webdriver.firefox.bin",
//                "C:\\Program Files\\Mozilla Firefox 56\\firefox.exe");
//
////        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dmitriy Bondar QA\\workspace\\geckodriver\\geckodriver.exe");
//
//        base.Driver = new FirefoxDriver();
//        base.Driver.manage().window().maximize();
//        WebDriverWait wait = new WebDriverWait(base.Driver, 10, 500);
//    }

//    public void InitializeTest() {
//
//        /*
//         * Internet Explorer Driver
//         */
//        System.out.println("\n" + "!!START!! Opening the browser : Internet Explorer");
//        System.setProperty("webdriver.ie.driver",
//                "C:\\Program Files\\driver\\IEDriverServer.exe");
//
//        DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
//        capabilities.setCapability(InternetExplorerDriver.NATIVE_EVENTS, false);
//
//        base.Driver = new InternetExplorerDriver(capabilities);
//        base.Driver.manage().window().maximize();
//        WebDriverWait wait = new WebDriverWait(base.Driver, 10, 500);
//    }

//    public void InitializeTest() {
////
////        /*
////         * Microsoft Edge Driver
////         */
////        System.out.println("\n" + "!!START!! Opening the browser : Microsoft Edge");
////        System.setProperty("webdriver.edge.driver",
////                "C:\\Program Files\\driver\\MicrosoftWebDriver.exe");
////
////        base.Driver = new EdgeDriver();
////        base.Driver.manage().window().maximize();
////        WebDriverWait wait = new WebDriverWait(base.Driver, 10, 500);
////    }

//    public void InitializeTest() {
//
//        /*
//         * Opera Driver NOT WORKING!!!
//         */
//        System.out.println("\n" + "!!START!! Opening the browser : Opera");
//        System.setProperty("webdriver.opera.driver",
//                "C:\\Program Files\\driver\\operadriver.exe");
//
//
//        base.Driver = new OperaDriver();
//        base.Driver.manage().window().maximize();
//        WebDriverWait wait = new WebDriverWait(base.Driver, 10, 500);
//    }





    @After
    public void TearDownTest(Scenario scenario) throws IOException {
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) base.Driver)
                    .getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png"); //stick it in the report
        }
        base.Driver.quit();

    }

//    public static void GrabScreenShot(WebDriver driver) throws IOException {
//        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(screenshot, new File("C:\\Automatization\\Projects\\4everlearning\\target\\cucumber-report-html\\screenshots\\screenshot.jpg"));
//
//
//
//    }

}
