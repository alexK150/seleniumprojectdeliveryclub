package ru.deliveryClub;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

    public ChromeDriver driver;

    @Before
    public void init() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        //initialization of diver
        driver = new ChromeDriver();
        System.out.println("Test started");
    }

    @Test
    public void firstTest() {
        driver.get("https://www.delivery-club.ru");
        String title = driver.getTitle();
        Assert.assertEquals("Доставка еды из ресторанов Москвы за 15-30 минут! Delivery Club", title);
    }

    @After
    public void end() {
        System.out.println("Test closed");
        driver.quit();
    }
}
