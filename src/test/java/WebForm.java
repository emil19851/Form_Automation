
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebForm extends PageObject{

    // Set the email address and password that you want to enter in the form elements.
    private final String EMAIL = "emllar-5@student.ltu.se";
    private final String PASSWORD ="Password123";

    // Identify the accept cookies box
    @FindBy(className = "fc-cta-consent")
    private WebElement cookies;

    // Identify the email textbox
    @FindBy(id = "email")
    private WebElement email;

    // Identify the password textbox
    @FindBy(id = "passwd")
    private WebElement passwd;

    // Identify the submit button
    @FindBy(id="SubmitLogin")
    private WebElement submit_login;

    public WebForm(WebDriver driver) {
        super(driver);
    }


    // These methods interact with the elements of the webpage

    public void enterEmailAddress(){
        this.email.sendKeys(EMAIL);
    }

    public void enterPassword(){
        this.passwd.sendKeys(PASSWORD);
    }

    public void pressSubmitButton(){
        this.submit_login.click();
    }

    public void acceptCookies(){
        cookies.click();
    }
}