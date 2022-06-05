package XYZBank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Manager extends BasePage{

    private By addCustomerBtn = By.xpath("/html/body/div/div/div[2]/div/div[1]/button[1]");
    private By openAccountBtn = By.xpath("/html/body/div/div/div[2]/div/div[1]/button[2]");
    private By homeButton = By.xpath("/html/body/div/div/div[1]/button[1]");

    public Manager(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public void addCustomerButtonClick() {
        getDriver().findElement(addCustomerBtn).click();
    }

   // public void openAccountButtonClick() {
   //    getDriver().findElement(openAccountBtn).click();
  //  }

    public void homeButtonClick() {
        getDriver().findElement(homeButton).click();
    }
}
