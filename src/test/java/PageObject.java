import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageObject {
    // All Test Pages are inheriting from this class

        protected WebDriver driver;

        public PageObject(WebDriver driver){
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }
    }

