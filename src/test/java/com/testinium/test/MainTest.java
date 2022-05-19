package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.page.ProductPage;
import org.junit.Before;
import org.junit.Test;

public class MainTest extends BaseTest {

    ProductPage productPage;
    LoginTest loginTest;



        @Before
        public void forStart(){
            productPage = new ProductPage();
            loginTest = new LoginTest();

        }



        @Test
        public void fullTest(){

            loginTest.loginTest();
            productPage.loginCheck();
            productPage.searchForItem();
            productPage.getDown();
            productPage.addFavs();
            productPage.backToMainPage();
            productPage.lvlCatalog();
            productPage.turkishClassics();
            productPage.filteringTurkishClassics();
            productPage.allBooksAndHover();
            productPage.pickingRandomItems();
            productPage.favs();
            productPage.removeFavs();
            productPage.goToCartPage();
            productPage.increseQuantity();
            productPage.refreshQuantity();
            productPage.buyItems();
            productPage.goToAddressAndAdd();
            productPage.addCardAndControlBuying();
            loginTest.logoutTest();

        }
    }

