package mainPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NonLoginHomePage extends AbstractNonLoginPage{
    private WebDriver driver;
    private By signUpButton = By.xpath("//button[@data-testid ='signup-button']");
    private By loginButton = By.xpath("//button[@data-testid = 'login-button']//span");
    private By signUpFreeButton = By.xpath("//div[@data-testid = 'signup-bar']/button/span");


    public <T extends AbstractPage> T clickLibraryButton() {
        return null;
    }




}
