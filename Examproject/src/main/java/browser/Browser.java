package browser;

import java.time.Duration;

import static browser.Config.BROWSER_TYPE;

public class Browser {

    public static WebDriver createDriver(){

        WebDriver driver;

        switch (BROWSER_TYPE){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--headless");
                chromeOptions.setCapability(CapabilityType.PAGE_LOAD_STRATEGY, "eager");
                driver = new ChromeDriver(chromeOptions);
                break;
            default:
                throw new IllegalArgumentException("Некорректное имя браузера: " + BROWSER_TYPE);
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        return driver;
    }
}
