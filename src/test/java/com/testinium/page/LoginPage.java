package com.testinium.page;

import com.testinium.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginPage {
    Methods methods;
    Logger logger = LogManager.getLogger(LoginPage.class);

     public LoginPage() {
            methods = new Methods();
        }
     public void login(){
         methods.click(By.xpath("//div[@class='menu-top-button login']"));
         methods.waitBySeconds(5);
         methods.sendKeys(By.id("login-email"),"ipekbelevi@hotmail.com");
         methods.waitBySeconds(3);
         methods.sendKeys(By.xpath("//input[@id='login-password']"),"...Ipk0719");
         methods.waitBySeconds(3);
         methods.click(By.cssSelector(".popupCloseIcon"));
         methods.waitBySeconds(2);
         methods.click(By.cssSelector(".ky-btn.ky-btn-orange.w-100.ky-login-btn"));
         methods.waitBySeconds(3);
         Assert.assertTrue(methods.isElementVisible(By.cssSelector(".menu.top.login")));
         methods.waitBySeconds(3);
         methods.isElementVisible((By.cssSelector(".menu.top.login")));

     }
    public void hoverLogout(){
        methods.waitBySecond(3);
        methods.mouseHover(By.cssSelector(".menu.top.login"));
        methods.click(By.xpath("//*[contains(text(),'Çıkış')]"));
        logger.info("Başarıyla çıkış yapıldı.");
        methods.waitBySecond(5);
    }


    }



