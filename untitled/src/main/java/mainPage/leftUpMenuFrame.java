package mainPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class leftUpMenuFrame {
    private WebDriver driver;
    @FindBy (xpath = "//a[@rel = 'noopener nofollow']/../..")
    private WebElement leftUpMenuFraneXpath;
    @FindBy (xpath = "//a[@rel = 'noopener nofollow']")
    private WebElement logoButton;
    @FindBy (xpath = "//a[@aria-label ='Home']")
    private WebElement homeButton ;
    @FindBy (xpath = "//a[@aria-label ='Search']" )
    private WebElement searchButton;

    public leftUpMenuFrame(WebDriver driver) {
        this.driver = driver;
    }



}
