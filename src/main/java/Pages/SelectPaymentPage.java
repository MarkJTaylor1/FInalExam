package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectPaymentPage {

    WebDriver driver;

    public SelectPaymentPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    //Locator for Select Method text
    @FindBy(xpath = "//div[@class='payment-list-title']")
    WebElement selectMethodText;

    //Locator for credit/debit card payment option
    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/a[1]/div[1]/div[1]")
    WebElement creditCardPaymentOption;

    //Locator for bank transfer payment option
    @FindBy(xpath = "//div[contains(text(),'Bank transfer')]")
    WebElement bankTransferPaymentOption;

    //Locator for Go pay option
    @FindBy(xpath = "//div[contains(text(),'GoPay/other e-Wallets')]")
    WebElement goPayOption;

    //Locator for ShopeePay option
    @FindBy(xpath = "//div[contains(text(),'ShopeePay/other e-Wallets')]")
    WebElement shopeePayOption;

    //Locator for KlikBCA option
    @FindBy(xpath = "//div[contains(text(),'KlikBCA')]")
    WebElement KlikBCAOption;

    //Locator for BCA KlikPay option
    @FindBy(xpath = "//div[contains(text(),'BCA KlikPay')]")
    WebElement BCAKlikPayOption;

    //Locator for OCTOClicks option
    @FindBy(xpath = "//div[contains(text(),'OCTO Clicks')]")
    WebElement OCTOClicksOption;

    //Locator for Danomon Online Banking Option
    @FindBy(xpath = "//div[contains(text(),'Danamon Online Banking')]")
    WebElement danamonOnlineBankingOption;

    //Locator for BRImo option
    @FindBy(xpath = "//div[contains(text(),'BRImo')]")
    WebElement bRImoOption;

    //Locator for Indomaret Option
    @FindBy(xpath = "//div[contains(text(),'Indomaret')]")
    WebElement indomaretOption;

    //Locator for Alfa Group option
    @FindBy(xpath = "//div[contains(text(),'Alfa Group')]")
    WebElement alfaGroupOption;

    //Locator for Kredivo Option
    @FindBy(xpath = "//div[contains(text(),'Kredivo')]")
    WebElement kredivoOption;

    //Locator for Akulaku PayLater
    @FindBy(xpath = "//div[contains(text(),'Akulaku PayLater')]")
    WebElement akulakuPayLaterOption;

    //Locator for UOB EZ Pay option
    @FindBy(xpath = "//div[contains(text(),'UOB EZ Pay')]")
    WebElement uOBEZPayOption;

    public boolean verifySelectMethodTextIsDisplayed(){return selectMethodText.isDisplayed();}

    public void clickOnCreditDebitCardPaymentOption(){creditCardPaymentOption.click();}

    public void clickOnBankTransferOption(){bankTransferPaymentOption.click();}


    public void clickOnGoPayOption(){goPayOption.click();}


    public void clickOnShopeePay(){shopeePayOption.click();}


    public void clickOnKlikBCA(){KlikBCAOption.click();}


    public void clickOnBCAKlikPayOption(){BCAKlikPayOption.click();}


    public void clickOnOCTOCLicksOption(){OCTOClicksOption.click();}


    public void clickOnDanamonOnlineBankingOption(){danamonOnlineBankingOption.click();}


    public void clickOnBRImoOption(){bRImoOption.click();}


    public void clickOnIndomaretOption(){indomaretOption.click();}


    public void clickOnAlfaGroup(){alfaGroupOption.click();}


    public void clickOnKredivo(){kredivoOption.click();}


    public void clickOnAkulaku(){akulakuPayLaterOption.click();}


    public void clickOnUOBEZPay(){uOBEZPayOption.click();}

}
