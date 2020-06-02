package home;


import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;


import static home.HomePageWebElements.*;

public class HomePage extends WebAPI {

//    @FindBy(how = How.CLASS_NAME, using = "classname")
//    private List<WebElement> singlecriterion;

    // Page object Design Pattern
    @FindBy(how = How.CSS, using = webElementSearchBox)
    public WebElement searchBox;

    @FindBy(how = How.CSS, using = webElementSearchButton)
    public WebElement searchButton;

    @FindBy(how = How.XPATH, using = webElementSearchText)
    public WebElement SearchText;


//@FindBy(css="searchField") WebElement searchWebField1;


//    // Return type method
//    public WebElement getsearchBox() {
//        return searchBox;
//    }
//
//    public WebElement getsearchButton() {
//        return searchButton;
//    }


// Action Method
//driver.finElement(By.id(searchField)).SendKeys("Hand Sanitizer");

    public void doSearch(String keyword) {
//        getsearchBox().sendKeys(keyword);
//        getsearchButton().click();

        searchBox.sendKeys(keyword);
        searchButton.click();

    }


// Validate Method
    //Assertion
    //Assert.asserteq.....

    public void validateSearch() {
        String actualText=SearchText.getText();
        Assert.assertEquals(actualText,"\"Hand Sanitizer\"","Search Result not Match");
    }


}
