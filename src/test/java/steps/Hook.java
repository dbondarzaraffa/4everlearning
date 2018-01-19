package steps;

import base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Hook extends BaseUtil {

    private BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void InitializeTest() {
//        System.out.println("Opening the browser : MOCK");
        System.out.println("\n" + "!!START!! Opening the browser : Googole Chrome");
        System.setProperty("webdriver.chrome.driver",
                "C:\\Automatization\\CucumberBasics\\driver\\chromedriver.exe");
        base.Driver = new ChromeDriver();
        base.Driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(base.Driver, 30, 500);

    }

    @After
    public void TearDownTest(Scenario scenario) {
        if (scenario.isFailed()) {
//Take screeshot
            System.out.println(scenario.getName());
        }
        System.out.println("!!!END!!! Closing the browser : MOCK");

        base.Driver.quit();

    }



}
