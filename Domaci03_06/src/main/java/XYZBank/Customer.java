package XYZBank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Customer extends BasePage{
    private By listOfCustomers = By.id("userSelect");
    private By customerLoginBtn = By.xpath("/html/body/div/div/div[2]/div/form/button");

    public Customer(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public void customerSelectFromList(String customer) {
        Select customerFromList = new Select(getDriver().findElement(listOfCustomers));
        customerFromList.selectByVisibleText(customer);
    }

    public void customerLoginButtonClick() {
        getDriver().findElement(customerLoginBtn).click();
    }

    public void loginCustomer(String customer) {
        customerSelectFromList(customer);
        customerLoginButtonClick();
    }
}
