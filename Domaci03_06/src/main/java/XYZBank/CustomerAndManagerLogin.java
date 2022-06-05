package XYZBank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomerAndManagerLogin extends BasePage{
    private By managerLoginBtn = By.xpath("//*[contains(text(),'Bank Manager Login')]");
    private By cutomerLoginBtn = By.xpath("//*[contains(text(),'Customer Login')]");

    public CustomerAndManagerLogin(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public void managerLogin() {
        getDriver().findElement(managerLoginBtn).click();
    }

    public void customerLogin() {
        getDriver().findElement(cutomerLoginBtn).click();
    }
}
