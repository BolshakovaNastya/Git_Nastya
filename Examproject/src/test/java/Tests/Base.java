package Tests;

import browser.Browser;

public class Base {
    public void setup() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    private WebDriver driver;

    @BeforeClass
    public void setupClass(){
        System.out.println("Setting up before class in BaseTest.");
        driver = Browser.createDriver();
    }

    @AfterClass
    public void tearDownClass(){
        System.out.println("Tearing down after class.");
        if (driver != null) driver.quit();
    }
}
