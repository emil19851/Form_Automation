import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebForm extends PageObject{

    private final String EMAIL = "emllar-5@student.ltu.se";
    private final String PASSWORD ="Password123";

    @FindBy(id = "email")
    private WebElement email;

    @FindBy(id = "passwd")
    private WebElement passwd;

    @FindBy(xpath = "//a[contains(text(),'Consent')]")
    private WebElement submit_button2;

    @FindBy(id="SubmitLogin")
    private WebElement submit_login;

    public WebForm(WebDriver driver) {
        super(driver);
    }

    public void enterEmailAddress(){
        this.email.sendKeys(EMAIL);
    }

    public void enterPassword(){
        this.passwd.sendKeys(PASSWORD);
    }

    public void pressSubmitButton(){
        this.submit_login.click();
    }

    public void pressConsentButton(){
        this.submit_button2.click();
    }
}