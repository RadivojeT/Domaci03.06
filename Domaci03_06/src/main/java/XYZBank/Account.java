package XYZBank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Account extends BasePage{
    private By depositBtn = By.xpath("/html/body/div/div/div[2]/div/div[3]/button[2]");
    private By withdrawlBtn = By.xpath("/html/body/div/div/div[2]/div/div[3]/button[3]");
    private By logoutButton = By.xpath("/html/body/div/div/div[1]/button[2]");
    private By inputDepositWithdrawal = By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/div/input");
    private By addDepositWithdrawalBtn = By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/button");

    public Account(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public void depositButtonClick() {
        getDriver().findElement(depositBtn).click();
    }
    public void addDepositToCustomer(String deposit) {
        getDriver().findElement(inputDepositWithdrawal).sendKeys(deposit);
    }
    public void addDepositeButtonClick() {
        getDriver().findElement(addDepositWithdrawalBtn).click();
    }

    public void addDeposit(String deposit) {
        addDepositToCustomer(deposit);
        addDepositeButtonClick();
    }

    public void withdrawButtonClick(){
        getDriver().findElement(withdrawlBtn).click();
    }
    public void withdrawalFromCustomer(String withdrawal){
        getDriver().findElement(inputDepositWithdrawal).sendKeys(withdrawal);
    }
    public void withdrawlButtonClick() {
        getDriver().findElement(withdrawlBtn).click();
    }
    public void withdraw(String withdraw){
        withdrawalFromCustomer(withdraw);
        withdrawButtonClick();

    }

    public void logoutButtonClick() {
        getDriver().findElement(logoutButton).click();
    }

}
