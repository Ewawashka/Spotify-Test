package mainPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public abstract class AbstractNonLoginPage extends AbstractPage {
    @FindBy(xpath = "//a[@rel = 'noopener nofollow']")
    protected WebElement logoLinkAndText;
    @FindBy(xpath = "//a[contains(@href,'cookies-policy')and @draggable='false']")
    protected WebElement secondCookiesLink;
    @FindBy(xpath = "//button[@data-testid='language-selection-button']")
    protected WebElement changeLanguageButton; //не уверена что она в фрейме лежит надо будет проверить
    @FindBy(xpath = "//div[@tabindex='-1']/..")
    protected WebElement  LeftMiddleFrameInterfaceXpath ;
    @FindBy(xpath = "//a[@rel = 'noopener nofollow']/../..")
    protected WebElement  LeftUpMenuFrameInterface ;
    @FindBy(xpath = "//div[@class='main-view-container__mh-footer-container']")
    protected WebElement RightBottomFrameInterface;
    @FindBy(xpath = "//header[@aria-label='Top bar and user menu']")
    protected WebElement RightUpperFrameInterface;
    @FindBy (xpath = "//button[@data-testid='signup-button']")
    protected WebElement searchButton;
    @FindBy(xpath = "//button[@data-testid='login-button']")
    protected WebElement loginButton;
    @FindBy(xpath = "//footer[@data-testid='now-playing-bar']")
    protected WebElement signupForFreeFrameXpath;
    @FindBy(xpath = "//span[contains(text(),'Sign up free')]/..")
    protected WebElement signupForFreeButton;



    public NonLoginPodcastPage clickPodcastButton() {
        clickPodcastButton.click();
        return new NonLoginPodcastPage();
    }

    public NonLoginSearchPage clickSearchButton() {
        clickSearchButton.click();
        return new NonLoginSearchPage();
    }

    public NonLoginHomePage clickHomeButton() {
        clickHomeButton.click();
        return new NonLoginHomePage();
    }

    public LoginPage clickPlusButton() {
        clickPlusButton.click();
        return new LoginPage();
    }
   public LoginPage clickCreatePlaylistButton() {
       clickCreatePlaylistButton.click();
        return new LoginPage();
    }



    public AbstractPage clickGoBackButton() { //доделать как дойдет дело
        return null;
    }

    public AbstractPage clickGoForwardButton() {
        return null;
    }
}
