package mainPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public abstract class AbstractPage implements LeftUpMenuFrameInterface, LeftMiddleFrameInterface, UpperRightFrameInterface, RightBottomFrameInterface {
    @FindBy(xpath = "//a[@aria-label = 'Search']")
    protected WebElement clickSearchButton;

    @FindBy(xpath = "//a[@aria-label = 'Home']")
    protected WebElement clickHomeButton;

    @FindBy(xpath = "//button[@aria-label = 'Collapse Your Library']")
    protected WebElement clickLibraryButton;

    @FindBy(xpath = "//span[contains(text(), 'Create playlist')]//..")
    protected WebElement clickCreatePlaylistButton;

    @FindBy(xpath = "//span[contains(text(), 'Browse podcasts')]//..")
    protected WebElement clickPodcastButton;

    @FindBy(xpath = "//button[@aria-label = 'Create playlist or folder']")
    protected WebElement clickPlusButton;

    @FindBy(xpath = "//a[@data-ga-action='about']")
    protected WebElement clickAboutText;
    @FindBy(xpath = "//a[@data-ga-action='jobs']")
    protected WebElement clickJobsText;
    @FindBy(xpath = "//a[@data-ga-action='press']")
    protected WebElement clickForTheRecordText;
    @FindBy(xpath = "//a[@data-ga-action='artists']")
    protected WebElement clickForArtistText;
    @FindBy(xpath = "//a[@data-ga-action='developers']")
    protected WebElement clickDevelopersText;
    @FindBy(xpath = "//a[@data-ga-action='advertising']")
    protected WebElement clickAdvertisingText;
    @FindBy(xpath = "//a[@data-ga-action='investors']")
    protected WebElement clickInvestorsText;
    @FindBy(xpath = "//a[@data-ga-action='vendors']")
    protected WebElement clickVendorsText;
    @FindBy(xpath = "//a[@data-ga-action='help']")
    protected WebElement clickSupportText;
    @FindBy(xpath = "//a[@data-ga-action='free']")
    protected WebElement clickMobileAppText;
    @FindBy(xpath = "//a[@aria-label='Instagram']")
    protected WebElement clickInstagramButton;
    @FindBy(xpath = "//a[@aria-label='Twitter']")
    protected WebElement clickTwitterButton;
    @FindBy(xpath = "//a[@aria-label='Facebook']")
    protected WebElement clickFacebookButton;

    @FindBy(xpath = "//span[contains(text(),'Legal')]/..")
    protected WebElement legalLink;
    @FindBy(xpath = "//span[contains(text(),'Safety & Privacy Center')]/..")
    protected WebElement safetyAndPrivacyCenterLink;
    @FindBy(xpath = "//span[contains(text(),'Privacy Policy')]/..")
    protected WebElement privacyPolicyLink;
    @FindBy(xpath = "//a[contains(@href,'cookies-policy')and @data-encore-id='textLink']")
    protected WebElement firstCookiesLink;
    @FindBy(xpath = "//span[contains(text(),'About Ads')]/..")
    protected WebElement aboutAdsLink;
    @FindBy(xpath = "//span[contains(text(),'Accessibility')]/..")
    protected WebElement accessibilityLink;


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
}
