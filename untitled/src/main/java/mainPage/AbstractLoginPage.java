package mainPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public abstract class AbstractLoginPage extends AbstractPage {
    @FindBy(xpath = "//header[@data-testid='topbar']")
    protected WebElement LeftUpMenuXpath;
    @FindBy(xpath = "//button[@title='Upgrade to Premium']")
    protected WebElement explorePremiumButton;
    @FindBy(xpath = "//span[contains(text(),'Install App')]/../..")
    protected WebElement installAppButton;
    @FindBy(xpath = "//button[@aria-label=\"What's New\"]")
    protected WebElement bellButton;
    @FindBy(xpath = "//button[@data-testid='user-widget-link']")
    protected WebElement userProfileButton;
    @FindBy(xpath = "//div[@aria-label='Home Filters']/../../..")
    protected WebElement  homeFiltersFrameXpath;
    @FindBy(xpath = "//button[@aria-label='All']")
    protected WebElement allHomeFilterButton;
    @FindBy(xpath = "//button[@aria-label='Music']")
    protected WebElement musicHomeFilterButton;
    @FindBy(xpath = "//button[@aria-label='Podcasts']")
    protected WebElement podcastsHomeFilterButton;

    public LoginLibraryPage clickLibraryButton() {
        clickLibraryButton.click();
        return new LoginLibraryPage();
    }

    public LoginCreatePlayListPage clickCreatePlaylistButton() {
        clickCreatePlaylistButton.click();
        return new LoginCreatePlayListPage();
    }

    public LoginPodcastPage clickPodcastButton() {
        clickPodcastButton.click();
        return new LoginPodcastPage();
    }

    public LoginCreatePlayListPage clickPlusButton() {
        clickPlusButton.click();
        return new LoginCreatePlayListPage();
    }

    public LoginSearchPage clickSearchButton() {
        clickSearchButton.click();
        return new LoginSearchPage();
    }

    public LoginHomePage clickHomeButton() {
        clickHomeButton.click();
        return new LoginHomePage();
    }

    public AboutUsLinkPage clickAboutText() {
        clickAboutText.click();
        return new AboutUsLinkPage();
    }

    public JobsLinkPage clickJobsText() {
        clickJobsText.click();
        return new JobsLinkPage();
    }

    public ForTheRecordLinkPage clickForTheRecordText() {
        clickForTheRecordText.click();
        return new ForTheRecordLinkPage();
    }

    public ForArtistLinkPage clickForArtistText() {
        clickForArtistText.click();
        return new ForArtistLinkPage();
    }

    public DevelopersLinkPage clickDevelopersText() {
        clickDevelopersText.click();
        return new DevelopersLinkPage();
    }

    public AdvertisingLinkPage clickAdvertisingText() {
        clickAdvertisingText.click();
        return new AdvertisingLinkPage();
    }

    public InvestorsLinkPage clickInvestorsText() {
        clickInvestorsText.click();
        return new InvestorsLinkPage();
    }

    public VendorsLinkPage clickVendorsText() {
        clickVendorsText.click();
        return new VendorsLinkPage();
    }

    public SupportLinkPage clickSupportText() {
        clickSupportText.click();
        return new SupportLinkPage();
    }

    public MobileAppLinkPage clickMobileAppText() {
        clickMobileAppText.click();
        return new MobileAppLinkPage();
    }

    public InstagramLinkPage clickInstagramButton() {
        clickInstagramButton.click();
        return new InstagramLinkPage();
    }

    public TwitterLinkPage clickTwitterButton() {
        clickTwitterButton.click();
        return new TwitterLinkPage();
    }

    public FacebookLinkPage clickFacebookButton() {
        clickFacebookButton.click();
        return new FacebookLinkPage();
    }

    public AbstractPage clickGoBackButton() { //доделать как дойдет дело
        return null;
    }

    public AbstractPage clickGoForwardButton() {
        return null;
    }
}
