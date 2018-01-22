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
import org.openqa.selenium.firefox.FirefoxDriver;
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
                "C:\\Automatization\\CucumberBasics\\driver\\chromedriver.exe");
        System.setProperty("chromeoptions.args", "disable-infobars");
        base.Driver = new ChromeDriver();
        base.Driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(base.Driver, 15, 500);
    }

//    public void InitializeTest() {
//
//        /*
//         * Firefox Driver
//         */
//        System.out.println("\n" + "!!START!! Opening the browser : Firefox");
//        System.setProperty("webdriver.Firefoxdriver",
//                "C:\\Users\\Dmitriy Bondar QA\\workspace\\geckodriver\\geckodriver.exe");
//
//        System.setProperty("webdriver.firefox.bin",
//                "C:\\Program Files\\Mozilla Firefox 56\\firefox.exe");
//
//        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dmitriy Bondar QA\\workspace\\geckodriver\\geckodriver.exe");
//
//        base.Driver = new FirefoxDriver();
//        base.Driver.manage().window().maximize();
//        WebDriverWait wait = new WebDriverWait(base.Driver, 15, 500);
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
