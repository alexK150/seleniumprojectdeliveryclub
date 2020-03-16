package ru.deliveryClub;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

    @Test
    public void firstTest(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        //initialization of diver
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.delivery-club.ru");

        String title = driver.getTitle();
        Assert.assertEquals("Доставка еды из ресторанов Москвы за 15-30 минут! Delivery Club", title);

        driver.quit();
    }
}
