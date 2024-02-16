package mainPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }
    private By signUpButton = By.xpath("//button[@data-testid ='signup-button']");
    private By loginButton = By.xpath("//button[@data-testid = 'login-button']//span");
    private By signUpFreeButton = By.xpath("//div[@data-testid = 'signup-bar']/button/span");

    private By yourLibraryButton = By.xpath("//button[@aria-label = 'Collapse Your Library']");
    private By plusButton  = By.xpath("//button[@aria-label = 'Create playlist or folder']");
    private By titleTextCreatePlaylist = By.xpath("//span[contains(text(),'Create your first playlist')]");
    private By subtitleTextCreatePlaylist = By.xpath("//span[contains(text(),\"It's easy, we'll help you\")]");
    private By createPlaylistButton = By.xpath("//span[contains(text(),'Create playlist')]");
    private By scrollbarHidden = By.xpath("//div[@class= 'os-scrollbar os-scrollbar-vertical os-scrollbar-auto-hidden']");
    private By titleTextFindPodcasts = By.xpath("//span[contains(text(),\"Let's find some podcasts to follow\")]");
    private By subtitleTextFindPodcasts = By.xpath("//span[contains(text(),\"We'll keep you updated on new episodes\")]");
    private By browsePodcastButton = By.xpath("//a[@data-encore-id = 'buttonPrimary']");
    private By contextMenuCreatePlaylistButton = By.xpath("//div[@data-testid = 'context-menu']/ul/li[1]/button");
    private By contextMenuCreateFolder = By.xpath("//div[@data-testid = 'context-menu']/ul/li[2]/button");
    private By legalLinc  = By.xpath("//span[contains(text(),'Legal')]/..");
    private By privacyCenterLinc  = By.xpath("//span[contains(text(),'Privacy Center')]/..");
    private By privacyPolicyLinc  = By.xpath("//span[contains(text(),'Privacy Policy')]/..");
    private By cookiesListLinc = By.xpath("//span[contains(text(),'Cookies')]/..");
    private By aboutAdsLinc  = By.xpath("//span[contains(text(),'Legal')]/..");
    private By accessibilityLinc = By.xpath("//span[contains(text(),'Legal')]/..");
    private By secondCookiesLinc  = By.xpath("//span[contains(text(),'Legal')]/..");

}
