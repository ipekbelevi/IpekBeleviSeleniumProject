package com.testinium.page;

import com.testinium.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

public class ProductPage {


    Methods methods;
    Logger logger = LogManager.getLogger(ProductPage.class);

    public ProductPage(){methods = new Methods();}

    public void searching(){
        methods.sendKeys(By.xpath("//input[@id='search-input']"),"oyuncak");
        methods.click(By.cssSelector(".common-sprite.button-search"));
        methods.waitBySeconds(3);
        methods.click(By.cssSelector("//*[@class=\"product-cr\"][7]"));
        methods.waitBySeconds(3);
    }
    public void scrollDown(){
        methods.scrollWithAction(By.xpath("(//*[@class='product-cr'])[7]"));
        methods.waitBySeconds(4);
    }
     public void goBackMainPage(){
         methods.scrollWithAction(By.xpath("(//*[@class='product-cr'])[7]"));
         methods.waitBySeconds(4);
     }

    public void goCatalogPage(){
        methods.click(By.cssSelector(".lvl1catalog"));
        methods.waitBySeconds(2);
    }
    public void turkishClassics(){
        methods.click(By.xpath("//img[@title='Türk Klasikleri'])"));
        methods.waitBySeconds(2);
    }
    public void turkishClassicsFiltering(){
        methods.selectByText(By.cssSelector(".sort>select"),"Yüksek Oylama");
        methods.waitBySeconds(5);
    }


    public void loginCheck() {
        Assert.assertTrue(methods.isElementVisible(By.cssSelector(".menu.top.login")));
        methods.waitBySecond(2);
        logger.info("Login bilgisi konrol edildi");
    }

    public void searchForItem() {
        methods.sendKeys(By.xpath("//input[@id = 'search-input']"),"Oyuncak");
        methods.click(By.cssSelector(".common-sprite.button-search"));
        methods.waitBySecond(3);
        logger.info("Oyuncak kelimesi ile ürün araması yapıldı.");
    }

    public void getDown() {
        methods.scrollWithAction(By.xpath("(//*[@class='product-cr'])[7]"));
        methods.waitBySecond(4);
        logger.info("Sayfa yedinci ürüne kaydırıldı.");
    }

    public void addFavs() {
        methods.scrollWithAction(By.xpath("(//*[@class='fa fa-heart'])[6]"));
        methods.click(By.xpath("(//a/i[@class='fa fa-heart'])[6]"));
        methods.waitBySecond(1);
        methods.scrollWithAction(By.xpath("(//a/i[@class='fa fa-heart'])[7]"));
        methods.click(By.xpath("(//a/i[@class='fa fa-heart'])[7]"));
        methods.waitBySecond(1);
        methods.scrollWithAction(By.xpath("(//a/i[@class='fa fa-heart'])[8]"));
        methods.click(By.xpath("(//a/i[@class='fa fa-heart'])[8]"));
        methods.waitBySecond(2);
        methods.scrollWithAction(By.xpath("(//a/i[@class='fa fa-heart'])[9]"));
        methods.click(By.xpath("(//a/i[@class='fa fa-heart'])[9]"));
        methods.waitBySecond(2);
        logger.info("Dört ürün favorilere eklendi.");
    }

    public void backToMainPage() {
        methods.click(By.cssSelector(".logo-icon"));
        methods.waitBySecond(2);
        logger.info("Ana sayfaya dönüldü.");
    }

    public void lvlCatalog() {
        methods.click(By.cssSelector(".lvl1catalog"));
        methods.waitBySecond(2);
        logger.info("Puan Katalogu sayfasına gidildi.");
    }


    public void filteringTurkishClassics() {
        methods.selectByText(By.cssSelector(".sort>select"),"Yüksek Oylama");
        methods.waitBySecond(5);
        logger.info("Yüksek oylama yapıldı.");
    }

    public void selectingTurkishClassics(){
        methods.scrollWithAction(By.xpath("//img[@title='Puan Kataloğundaki Türk Klasikleri']"));
        methods.click(By.xpath("//img[@title='Puan Kataloğundaki Türk Klasikleri']"));
        methods.waitBySecond(2);
        logger.info("Türk Klasikleri sayfalarına girildi.");

    }

    public void allBooksAndHover() {
        methods.mouseHover(By.xpath("(//*[contains(text(),'Tüm Kitaplar')])[3]"));
        methods.waitBySecond(3);
        methods.click(By.xpath("//a[contains(text(), 'Hobi')]"));
        methods.waitBySecond(3);
        logger.info("Hobi sayfasına girildi.");
    }

    public void pickingRandomItems() {
        methods.randomPicker(By.cssSelector(".pr-img-link"));
        methods.waitBySecond(3);
        methods.click(By.cssSelector(".add-to-cart.btn-orange.btn-ripple"));
        methods.waitBySecond(3);
        logger.info("Rastgele bir ürün sepete eklendi");
    }

    public void favs() {
        methods.mouseHover(By.cssSelector(".menu.top.my-list"));
        methods.waitBySecond(3);
        methods.click(By.xpath("//a[contains(text(),'Favorilerim')]"));
        methods.waitBySecond(3);
        logger.info("Favoriler sayfasına gidildi.");
    }

    public void removeFavs() {

        methods.click(By.cssSelector(".display-item.sprite.sprite-icon-list-selected"));
        methods.waitBySecond(3);
        methods.click(By.xpath("(//*[@class='fa fa-heart-o'])[3]"));
        methods.waitBySecond(3);
        logger.info("Favorilerden 3. favori silindi.");
    }
    public void goToCartPage(){
        methods.click(By.cssSelector(".common-sprite.fl"));
        methods.waitBySecond(3);
        methods.click(By.cssSelector("#js-cart"));
        methods.waitBySecond(3);
        logger.info("Sepet Sayfasına Girildi.");
    }

    public void increseQuantity(){

        methods.sendKeys(By.xpath("//input[@name='quantity']"),"5");
        methods.waitBySecond(3);
        logger.info("Sepetteki ürün miktarı arttırıldı.");
    }

    public void refreshQuantity(){
        methods.click(By.xpath("(//i[@class='fa fa-refresh green-icon'])[1]"));
        methods.waitBySecond(3);
        logger.info("Sepetteki ürün miktarı güncellendi.");
    }

    public void buyItems(){
        methods.click(By.cssSelector(".right>.button.red"));
        methods.waitBySecond(3);
        logger.info("Satın Al butonu tıklandı.");
    }

    public void goToAddressAndAdd(){
        methods.click(By.xpath("//a[contains(text(),'Yeni bir adres kullanmak istiyorum.')]"));
        methods.waitBySecond(3);
        logger.info("Yeni Adres eklenmesi için taba tıklandı.");
        methods.sendKeys(By.xpath("//input[@name = 'firstname_companyname']"),"Ipek");
        methods.sendKeys(By.xpath("//input[@name = 'lastname_title']"),"Belevi");
        methods.selectByText(By.xpath("//select[@name = 'zone_id']"),"İzmir");
        methods.waitBySecond(2);
        methods.selectByText(By.xpath("//select[@name = 'county_id']"),"BORNOVA");
        methods.sendKeys(By.xpath("//textarea[@name = 'address']"),"İzmir");
        methods.sendKeys(By.xpath("//input[@name = 'mobile_telephone']"),"5555555555");
        methods.click(By.xpath("//button[@id = 'button-checkout-continue']"));
        logger.info("Yeni Adres Eklendi");
        methods.waitBySecond(3);
        methods.click(By.xpath("//button[@id = 'button-checkout-continue']"));
    }

    public void addCardAndControlBuying(){
        methods.waitBySecond(3);
        methods.sendKeys(By.xpath("//input[@id = 'credit-card-owner']"),"Ipek");
        methods.sendKeys(By.xpath("//input[@id = 'credit_card_number_1']"),"1234");
        methods.sendKeys(By.xpath("//input[@id = 'credit_card_number_2']"),"1234");
        methods.sendKeys(By.xpath("//input[@id = 'credit_card_number_3']"),"1234");
        methods.sendKeys(By.xpath("//input[@id = 'credit_card_number_4']"),"1234");
        methods.selectByText(By.xpath("//select[@name= 'credit_card_expire_date_month']"),"35");
        methods.selectByText(By.xpath("//select[@name= 'credit_card_expire_date_year']"),"2023");
        methods.sendKeys(By.xpath("//input[@name= 'credit_card_security_code']"),"123");
        methods.waitBySecond(3);
        methods.click(By.xpath("//button[@id='button-checkout-continue']"));
        methods.waitBySecond(3);
        logger.info("Kredi Kartı bilgileri yazıldı ve hata alındı.");
        String expected = "Kart numarası geçersiz. Kontrol et!";
        Assert.assertEquals("testUnvalidCart > Test Failed!  ", expected, methods.getText(By.xpath("//span[@class='error']")));
        methods.waitBySecond(3);
        logger.info("Kredi Kartı eklemede hata alındığı doğrulandı.");
        methods.click(By.cssSelector(".checkout-logo"));
        logger.info("Anasayfaya dönüldü.");
        methods.waitBySecond(3);
    }

}













