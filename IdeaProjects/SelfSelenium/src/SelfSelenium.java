
import jdk.management.resource.internal.inst.DatagramDispatcherRMHooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SelfSelenium {

    public static WebDriver driver;
    public static WebDriver fDriver;

    public static String url = "https://www.amazon.com/";
    public static String urlOne = "https://www.nfl.com/";
    public static String urlTwo = "https://www.google.com/";
    public static String urlNYJ = "https://www.newyorkjets.com/";


    public static void main(String[] args) throws InterruptedException {

        driver = new ChromeDriver();
        fDriver = new FirefoxDriver();

        searchProductThree();
        searchProductFour();
        searchProductFive();
        searchProductSix();
        searchProductEight();
        searchProductNine();
        searchProductTen();
        searchProductEleven();
        searchProductTwelve();
        searchProductThirteen();
        searchProductFourteen();
        searchProductNYJ();
        searchProductNYJFifthteen();
        searchProductNYJSixteen();
        driver.close();

        searchProductSeven();

        fsearchProductThree();
        fsearchProductFour();
        fsearchProductFive();
        fsearchProductSix();
        fsearchProductEight();
        fsearchProductNine();
        fsearchProductTen();
        fsearchProductEleven();
        fsearchProductTwelve();
        fsearchProductThirteen();
        fsearchProductFourteen();
        fsearchProductNYJ();
        fsearchProductNYJFifthteen();
        fsearchProductNYJSixteen();
        fDriver.close();

    }

    public static void closeBrowser() {
        WebDriver driver = new ChromeDriver();
        driver.quit();

    }

    public static void closeFBrowser() {
        WebDriver fDriver = new FirefoxDriver();
        fDriver.quit();

    }

    public static void waitFor(int waitSeconds) throws InterruptedException {
        Thread.sleep(waitSeconds);
    }

    public static void setUp(String url) {
        driver.manage().window().maximize();
        driver.navigate().to(url);
    }

    public static void fSetUp(String url) {
        fDriver.manage().window().maximize();
        fDriver.navigate().to(url);
    }

    public static void searchProductNYJFifthteen() throws InterruptedException {
        setUp(url);
        //click privacy notice
        driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[5]/ul/li[2]/a")).click();
        //enter text field
        driver.findElement(By.cssSelector("#helpsearch")).sendKeys("What is privacy really ?");
        //click search icon
        driver.findElement(By.cssSelector("#helpSearchSubmit > span > input")).click();
        //click shipping
        driver.findElement(By.cssSelector("body > div.cs-help-v4 > div.cs-help-container > div.cs-help-sidebar > div.cs-help-sidebar-module.topic-sidebar > div > ul > li:nth-child(1) > a")).click();
        //click text field
        driver.findElement(By.cssSelector("#helpsearch")).sendKeys("Jeff Besoz");
        //click submit
        driver.findElement(By.cssSelector("#helpSearchSubmit > span > input")).click();
        closeBrowser();
    }

    public static void searchProductEleven() throws InterruptedException {
        setUp(url);
        //click on terms of conditions
        driver.findElement(By.cssSelector("#navFooter > div.navFooterLine.navFooterLinkLine.navFooterPadItemLine.navFooterCopyright > ul > li.nav_first > a")).click();
        // type in search wht is terms and conditions
        driver.findElement(By.cssSelector("#helpsearch")).sendKeys("What is terms and conditions alexa ?");
        // click submit button
        driver.findElement(By.cssSelector("#helpSearchSubmit > span > input")).click();
        //click first article
        driver.findElement(By.cssSelector("body > div.cs-help-v4 > div.cs-help-container > div.cs-help-content > div > div.cs-search-result-wrapper > div > div:nth-child(1) > h2 > a")).click();

        closeBrowser();

        System.out.println("Eleven worked ");

    }


    public static void searchProductThree() throws InterruptedException {
        setUp(url);
        // search bar typpe in football
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Football");
        //click the search button
        driver.findElement(By.cssSelector("#nav-search > form > div.nav-right > div > input")).click();
        // wit for 1 second
        waitFor(1000);
        // look for wilson football then click
        driver.findElement(By.xpath("//*[contains(text(),'Wilson NFL Super Grip Football')]")).click();
        // add to crton
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
        //click to pay
        driver.findElement(By.id("hlb-ptc-btn-native")).click();
        //close browser
        closeBrowser();
    }

    public static void searchProductTwelve() throws InterruptedException {
        setUp(url);

        // sign in
        driver.findElement(By.cssSelector("#nav-link-accountList > span.nav-line-2")).click();
        // click sign up
        driver.findElement(By.xpath("//*[@id=\"createAccountSubmit\"]")).click();
        //enter first name
        driver.findElement(By.cssSelector("#ap_customer_name")).sendKeys("Angel");
        // email
        driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("Angel@MYOB.COM");
        //password
        driver.findElement(By.cssSelector("#ap_password")).sendKeys("FuckBezos20");
        //retner passwork
        driver.findElement(By.xpath("//*[@id=\"ap_password_check\"]")).sendKeys("FuckBezos20");
        //submit
        driver.findElement(By.cssSelector("#continue")).click();


        closeBrowser();

    }


    public static void searchProductFourteen() throws InterruptedException {
        setUp(url);
        //click coupons
        driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(12)")).click();
        // click popular coupons
        driver.findElement(By.cssSelector("#a-page > div.a-fixed-left-flipped-grid.s-padding-left-small.s-padding-right-small.s-span-page.a-spacing-top-small > div > div.a-fixed-left-grid-col.a-col-left > div > div.a-section.a-spacing-base > div.left_nav.browseBox > ul:nth-child(5) > li:nth-child(1) > a")).click();
        // Click more coupons
        driver.findElement(By.xpath("//*[@id=\"coupon_grid_a0f7d603-d75e-35d3-9443-af33c2e5417f_4ee302ef-ec95-4ac1-8595-0008d8a56a3b\"]/div[6]")).click();
        // click to back on top
        driver.findElement(By.cssSelector("#navBackToTop > div > span")).click();
        closeBrowser();


    }
    public static void searchProductNYJ() throws InterruptedException {
        setUp(urlNYJ);
        //select news
        driver.findElement(By.xpath("/html/body/div[4]/header/div/nav[1]/ul/li[1]")).click();
        //click draft
        driver.findElement(By.xpath("/html/body/div[4]/header/div/nav[3]/ul/li[2]/a/span")).click();
        //  click free gency
        driver.findElement(By.xpath("/html/body/div[4]/header/div/nav[3]/ul/li[3]/a/span")).click();
        //click featured series
        driver.findElement(By.xpath("/html/body/div[4]/header/div/nav[3]/ul/li[4]/a/span")).click();
        //click transactions
        driver.findElement(By.xpath("/html/body/div[4]/header/div/nav[3]/ul/li[4]/a/span")).click();


        closeBrowser();
    }

    public static void searchProductNine() throws InterruptedException {
        setUp(url);
        // select location addres
        driver.findElement(By.xpath("//*[@id=\"nav-global-location-slot\"]/span/a")).click();
        // add address
        driver.findElement(By.xpath("//*[@id=\"GLUXZipUpdateInput\"]")).sendKeys("NEW YORK CITY");
        // select done
        driver.findElement(By.xpath("//*[@id=\"a-popover-3\"]/div/div[2]/span/span/span/button")).click();

        closeBrowser();

        System.out.println("Nine worked");

    }
    public static void searchProductFour() throws InterruptedException {
        setUp(urlOne);
        driver.findElement(By.cssSelector("body > div.d3-l-wrap > header > div > nav.d3-o-nav--primary > ul > li:nth-child(1) > a > span")).click();
        driver.findElement(By.cssSelector("#d3-o-footer__tab-panel-1 > nav > ul:nth-child(3) > li:nth-child(5) > a > picture > img")).click();
        closeBrowser();
    }

    public static void searchProductFive() throws InterruptedException {
        setUp(urlTwo);
        driver.findElement(By.cssSelector("#tsf > div:nth-child(2) > div.A8SBwf > div.RNNXgb > div > div.a4bIc > input")).sendKeys("Stephen A. rants about the Jets and says Jamal Adams should demand a trade | First Take");
        driver.findElement(By.cssSelector("#tsf > div:nth-child(2) > div.A8SBwf > div.FPdoLc.tfB0Bf > center > input.gNO89b")).click();
        driver.findElement(By.cssSelector("#hdtb-msb-vis > div:nth-child(3) > a")).click();
        closeBrowser();
    }

    public static void searchProductSix() throws InterruptedException {
        setUp(url);
        driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(2)")).click();
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Wazzzzup");
        driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(4)")).click();
        // driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("I said WAZZZZZUP");

        closeBrowser();
    }

    public static void searchProductSeven() throws InterruptedException {
        fSetUp(url);

        closeFBrowser();


    }



    public static void searchProductEight() throws InterruptedException {
        setUp(url);
        //go to amazon
        driver.findElement(By.cssSelector("#navFooter > div.navFooterLine.navFooterLinkLine.navFooterDescLine > table > tbody > tr:nth-child(1) > td:nth-child(13) > a")).click();
        //click alexa bottom left
        driver.findElement(By.cssSelector("#covidheader > section > div > a")).click();
        //check data
        driver.findElement(By.cssSelector("#cdtContainer > div.flex.topsection > div.covidfaq > a")).click();
        closeBrowser();
    }



    public static void searchProductTen() throws InterruptedException {
        setUp(url);
        //check cart
        driver.findElement(By.xpath("//*[@id=\"nav-cart\"]")).click();
        //click amazon lgo on bottom
        driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[3]/span[1]/div/a/div")).click();
        closeBrowser();

        System.out.println("Ten worked");
    }




    public static void searchProductThirteen() throws InterruptedException {
        setUp(url);
        // click on carrers
        driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li[1]/a")).click();
        // enter job field
        driver.findElement(By.xpath("//*[@id=\"search_typeahead\"]")).sendKeys("Software Developer");
        // enter location
        driver.findElement(By.xpath("//*[@id=\"location-typeahead\"]")).sendKeys("New York");

        closeBrowser();

    }




    public static void searchProductNYJSixteen() throws InterruptedException {
        setUp(url);
        driver.findElement(By.cssSelector("#navFooter > div.navFooterLine.navFooterLinkLine.navFooterPadItemLine.navFooterCopyright > ul > li:nth-child(3) > a")).click();

        closeBrowser();
    }


    public static void fsearchProductThree() throws InterruptedException {
        fSetUp(url);
        fDriver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Football");
        fDriver.findElement(By.cssSelector("#nav-search > form > div.nav-right > div > input")).click();
        waitFor(1000);
        fDriver.findElement(By.xpath("//*[contains(text(),'Wilson NFL Super Grip Football')]")).click();
        fDriver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
        fDriver.findElement(By.id("hlb-ptc-btn-native")).click();
        closeBrowser();
    }

    public static void fsearchProductFour() throws InterruptedException {
        setUp(urlOne);
        driver.findElement(By.cssSelector("body > div.d3-l-wrap > header > div > nav.d3-o-nav--primary > ul > li:nth-child(1) > a > span")).click();
        driver.findElement(By.cssSelector("#d3-o-footer__tab-panel-1 > nav > ul:nth-child(3) > li:nth-child(5) > a > picture > img")).click();
        closeBrowser();
    }

    public static void fsearchProductFive() throws InterruptedException {
        setUp(urlTwo);
        driver.findElement(By.cssSelector("#tsf > div:nth-child(2) > div.A8SBwf > div.RNNXgb > div > div.a4bIc > input")).sendKeys("Stephen A. rants about the Jets and says Jamal Adams should demand a trade | First Take");
        driver.findElement(By.cssSelector("#tsf > div:nth-child(2) > div.A8SBwf > div.FPdoLc.tfB0Bf > center > input.gNO89b")).click();
        driver.findElement(By.cssSelector("#hdtb-msb-vis > div:nth-child(3) > a")).click();
        closeBrowser();
    }

    public static void fsearchProductSix() throws InterruptedException {
        setUp(url);
        driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(2)")).click();
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Wazzzzup");
        driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(4)")).click();
        // driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("I said WAZZZZZUP");

        closeBrowser();
    }

    public static void fsearchProductSeven() throws InterruptedException {
        fSetUp(url);

        closeFBrowser();


    }

    public static void fsearchProductEight() throws InterruptedException {
        setUp(url);
        //go to amazon
        driver.findElement(By.cssSelector("#navFooter > div.navFooterLine.navFooterLinkLine.navFooterDescLine > table > tbody > tr:nth-child(1) > td:nth-child(13) > a")).click();
        //click alexa bottom left
        driver.findElement(By.cssSelector("#covidheader > section > div > a")).click();
        //check data
        driver.findElement(By.cssSelector("#cdtContainer > div.flex.topsection > div.covidfaq > a")).click();
        closeBrowser();
    }

    public static void fsearchProductNine() throws InterruptedException {
        setUp(url);
        // select location addres
        driver.findElement(By.xpath("//*[@id=\"nav-global-location-slot\"]/span/a")).click();
        // add address
        driver.findElement(By.xpath("//*[@id=\"GLUXZipUpdateInput\"]")).sendKeys("NEW YORK CITY");
        // select done
        driver.findElement(By.xpath("//*[@id=\"a-popover-3\"]/div/div[2]/span/span/span/button")).click();

        closeBrowser();

        System.out.println("Nine worked");

    }

    public static void fsearchProductTen() throws InterruptedException {
        setUp(url);
        //check cart
        driver.findElement(By.xpath("//*[@id=\"nav-cart\"]")).click();
        //click amazon lgo on bottom
        driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[3]/span[1]/div/a/div")).click();
        closeBrowser();

        System.out.println("Ten worked");
    }


    public static void fsearchProductEleven() throws InterruptedException {
        setUp(url);
        //click on terms of conditions
        driver.findElement(By.cssSelector("#navFooter > div.navFooterLine.navFooterLinkLine.navFooterPadItemLine.navFooterCopyright > ul > li.nav_first > a")).click();
        // type in search wht is terms and conditions
        driver.findElement(By.cssSelector("#helpsearch")).sendKeys("What is terms and conditions alexa ?");
        // click submit button
        driver.findElement(By.cssSelector("#helpSearchSubmit > span > input")).click();
        //click first article
        driver.findElement(By.cssSelector("body > div.cs-help-v4 > div.cs-help-container > div.cs-help-content > div > div.cs-search-result-wrapper > div > div:nth-child(1) > h2 > a")).click();

        closeBrowser();

        System.out.println("Eleven worked ");

    }

    public static void fsearchProductTwelve() throws InterruptedException {
        setUp(url);

        // sign in
        driver.findElement(By.cssSelector("#nav-link-accountList > span.nav-line-2")).click();
        // click sign up
        driver.findElement(By.xpath("//*[@id=\"createAccountSubmit\"]")).click();
        //enter first name
        driver.findElement(By.cssSelector("#ap_customer_name")).sendKeys("Angel");
        // email
        driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("Angel@MYOB.COM");
        //password
        driver.findElement(By.cssSelector("#ap_password")).sendKeys("FuckBezos20");
        //retner passwork
        driver.findElement(By.xpath("//*[@id=\"ap_password_check\"]")).sendKeys("FuckBezos20");
        //submit
        driver.findElement(By.cssSelector("#continue")).click();


        closeBrowser();

    }

    public static void fsearchProductThirteen() throws InterruptedException {
        setUp(url);
        // click on carrers
        driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li[1]/a")).click();
        // enter job field
        driver.findElement(By.xpath("//*[@id=\"search_typeahead\"]")).sendKeys("Software Developer");
        // enter location
        driver.findElement(By.xpath("//*[@id=\"location-typeahead\"]")).sendKeys("New York");

        closeBrowser();

    }

    public static void fsearchProductFourteen() throws InterruptedException {
        setUp(url);
        //click coupons
        driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(12)")).click();
        // click popular coupons
        driver.findElement(By.cssSelector("#a-page > div.a-fixed-left-flipped-grid.s-padding-left-small.s-padding-right-small.s-span-page.a-spacing-top-small > div > div.a-fixed-left-grid-col.a-col-left > div > div.a-section.a-spacing-base > div.left_nav.browseBox > ul:nth-child(5) > li:nth-child(1) > a")).click();
        // Click more coupons
        driver.findElement(By.xpath("//*[@id=\"coupon_grid_a0f7d603-d75e-35d3-9443-af33c2e5417f_4ee302ef-ec95-4ac1-8595-0008d8a56a3b\"]/div[6]")).click();
        // click to back on top
        driver.findElement(By.cssSelector("#navBackToTop > div > span")).click();
        closeBrowser();


    }

    public static void fsearchProductNYJ() throws InterruptedException {
        setUp(urlNYJ);
        //select news
        driver.findElement(By.xpath("/html/body/div[4]/header/div/nav[1]/ul/li[1]")).click();
        //click draft
        driver.findElement(By.xpath("/html/body/div[4]/header/div/nav[3]/ul/li[2]/a/span")).click();
        //  click free gency
        driver.findElement(By.xpath("/html/body/div[4]/header/div/nav[3]/ul/li[3]/a/span")).click();
        //click featured series
        driver.findElement(By.xpath("/html/body/div[4]/header/div/nav[3]/ul/li[4]/a/span")).click();
        //click transactions
        driver.findElement(By.xpath("/html/body/div[4]/header/div/nav[3]/ul/li[4]/a/span")).click();


        closeBrowser();

    }

    public static void fsearchProductNYJFifthteen() throws InterruptedException {
        setUp(url);
        //click privacy notice
        driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[5]/ul/li[2]/a")).click();
        //enter text field
        driver.findElement(By.cssSelector("#helpsearch")).sendKeys("What is privacy really ?");
        //click search icon
        driver.findElement(By.cssSelector("#helpSearchSubmit > span > input")).click();
        //click shipping
        driver.findElement(By.cssSelector("body > div.cs-help-v4 > div.cs-help-container > div.cs-help-sidebar > div.cs-help-sidebar-module.topic-sidebar > div > ul > li:nth-child(1) > a")).click();
        //click text field
        driver.findElement(By.cssSelector("#helpsearch")).sendKeys("Jeff Besoz");
        //click submit
        driver.findElement(By.cssSelector("#helpSearchSubmit > span > input")).click();
        closeBrowser();
    }

    public static void fsearchProductNYJSixteen() throws InterruptedException {
        setUp(url);
        driver.findElement(By.cssSelector("#navFooter > div.navFooterLine.navFooterLinkLine.navFooterPadItemLine.navFooterCopyright > ul > li:nth-child(3) > a")).click();

        closeBrowser();
    }

}