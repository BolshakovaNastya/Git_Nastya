package браузер;

import java.util.List;

public class Brauser {
    public static WebDriver
            WebDriver
switch (Browser_Type)
case "chrome"

    WebDriverManager:
    public void setup() {
    } chromeOptions = new ChromeOptions;
    chromeOptions.addArguments("--headlees")
          ChromeOptions.setCapability (CapabilityType.PAGE_LOAD_STRATEGY, value "eager");
    chromedriver().setup();
    driver = new ChromeDriver();
case "firefox"

    WebDriverManager:
    public void setup() {
    } FireFoxOptions = new ChromeOptions;
    FireFoxOptions.addArguments("--headlees")
            FireFoxOptions.setCapability (CapabilityType.PAGE_LOAD_STRATEGY, value "eager");
    fireFoxdriver().setup();
    driver = new FireFoxDriver();
    defoult:
    System.out.println("Неккоректный браузер: - " + Browser_Type)


public List <WebBrowser>findElements (String locator)
return driver.FindElements(By.xpath(locator))

    public String toString() {


    }
}







