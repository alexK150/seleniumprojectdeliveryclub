package ru.deliveryClub;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FirstTest extends WebdriverSettings {

    @Test
    public void firstTest() {
        driver.get("https://www.delivery-club.ru");
        String title = driver.getTitle();
        Assert.assertEquals("Доставка еды из ресторанов Москвы за 15-30 минут! Delivery Club", title);
    }

    @Test
    public void loginTest(){
        driver.get("https://www.delivery-club.ru");
        //login click
        WebElement loginBtn = driver.findElement(By.cssSelector(".header-login-button"));
        loginBtn.click();

        WebElement popUpWindow = driver.findElement(By.cssSelector(".popup--def__content"));
        String expectedPopUpText = "Телефон для связи";
        String actualPopUpText = popUpWindow.getText();
        Assert.assertTrue(actualPopUpText.contains(expectedPopUpText));
    }
}
