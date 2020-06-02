package testhome;

import common.WebAPI;
import home.*;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestHomePage extends WebAPI {
    static HomePage homepage;
    static AboutPage aboutpage;


    //PageFactory Get Init Elements method help us to get Driver
    public static void getInItElements() {
        homepage = PageFactory.initElements(driver, HomePage.class);
        aboutpage = PageFactory.initElements(driver, AboutPage.class);

    }


    @Test
    public static void testSearchBox() {
        getInItElements();
        homepage.doSearch("Hand Sanitizer");
        homepage.validateSearch();

    }


}
