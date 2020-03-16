package ru.deliveryClub;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverSettings {
    public ChromeDriver driver;

    @Before
    public void init() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        //initialization of diver
        driver = new ChromeDriver();
        System.out.println("Test started");
    }

    @After
    public void end() {
        System.out.println("Test closed");
        driver.quit();
    }
}
