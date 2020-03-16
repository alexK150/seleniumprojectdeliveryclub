package ru.deliveryClub;

import org.junit.Assert;
import org.junit.Test;

public class FirstTest extends WebdriverSettings {

    @Test
    public void firstTest() {
        driver.get("https://www.delivery-club.ru");
        String title = driver.getTitle();
        Assert.assertEquals("Доставка еды из ресторанов Москвы за 15-30 минут! Delivery Club", title);
    }
}
