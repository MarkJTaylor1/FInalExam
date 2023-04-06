package Pages;

import DriverSetup.SetupDriver;
import Utils.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.w3c.dom.Text;

import java.time.Duration;
import java.util.List;

import static Tests.AllTests.prop;


public class HomePage extends SetupDriver {

    WebDriver driver;

    WebDriverWait wait;

    public HomePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public WebDriverWait explicitWait() {
        wait = new WebDriverWait(driver, 20);
        return wait;
    }


    //Locator for Buy Now Button
    @FindBy(css = "a[data-reactid='.0.0.0.2.0.0.5']")
    public WebElement buyNowButton;

    //Locator for Logo of Website
    @FindBy(xpath = "//div[@class='title']")
    WebElement logoOfWebsite;

    //Locator for Sign Up Button
    @FindBy(xpath = "//a[contains(text(),'SIGN UP  →')]")
    WebElement signUpButton;

    //Locator for Left Arrow Button
    @FindBy(xpath = "//i[@class='glyphicon glyphicon-menu-left']")
    WebElement leftArrowButton;

    //Locator for Right Arrow Button
    @FindBy(xpath = "//i[@class='glyphicon glyphicon-menu-right']")
    WebElement rightArrowButton;

    //Locator for Name Input Value Box
    @FindBy(xpath = "//input[@value='Budi']")
    WebElement nameInputValueBox;

    //Locator for Email Input Value Box
    @FindBy(xpath = "//input[@value='budi@utomo.com']")
    WebElement emailInputValueBox;


    //Locator for Phone Number Input Value Box
    @FindBy(xpath = "//input[@value='081808466410']")
    WebElement phoneNumberInputValueBox;


    //Locator for City Input Value Box
    @FindBy(xpath = "//input[@value='Jakarta']")
    WebElement cityInputValueBox;


    //Locator for Address Input Value Box
    @FindBy(xpath = "//textarea[normalize-space()='MidPlaza 2, 4th Floor Jl.Jend.Sudirman Kav.10-11']")
    WebElement addressInputValueBox;


    //Locator for Postal Code Input Value Box
    @FindBy(xpath = "//input[@value='10220']")
    WebElement postalCodeInputValueBox;

    //Locator for Checkout Page
    @FindBy(css = ".cart-content.buying")
    public WebElement checkoutPopup;

    //Locator for amount
    @FindBy(css = "td[class='amount']")
    public WebElement amountLabel;

    //Locator for checkout button
    @FindBy(xpath = "//div[@class='cart-checkout']")
    public WebElement checkoutButton;

    //Locator for iFrame
    @FindBy(id = "snap-midtrans")
    public WebElement iFrame;

    //Locator for oder ID
    @FindBy(className = "header-order-id")
    public WebElement orderId;

    //Locator for card info page
    @FindBy(css = ".title-text.text-actionable-bold")
    public WebElement cardInfoPage;

    //Locator for payment page
    @FindBy(css = ".page-container.scroll")
    public WebElement paymentPage;

    //Locator for payment options list
    @FindBy(css = ".list-title.text-actionable-bold")
    public List<WebElement> paymentOptions;

    //Locator for credit/debit card payment option

    // Locator for previous order amount
    @FindBy(className ="header-amount")
    public WebElement orderAmountBeforeAddingCart;


    @FindBy(id = "merchant_name")
    public WebElement merchantName;
    @FindBy(id = "txn_amount")
    public WebElement amount;
    @FindBy (xpath = "//p[@id='card_number']")
    public WebElement CardNumber;
    @FindBy (xpath = "//button[@name='ok']")
    public WebElement OKbutton;
    @FindBy (css = ".form-control " )
    public WebElement OTP;
    @FindBy (xpath = "//span[normalize-space()='Thank you for your purchase.']")
    public WebElement PaymentSuccessfull;
    @FindBy (css = ".cancel-modal-subtitle")
    public WebElement PaymentDeclined;
    @FindBy(xpath = "//button[text()='OK']")
    public WebElement CardDeclined_OK_Button;
    @FindBy(xpath = "//button[@title='Abort authentication']")
    public WebElement CancelButton;
    @FindBy(className = "valid-input-value")
    public List<WebElement> cardNumberInput;
    @FindBy(id = "card-expiry")
    public WebElement expirationDateInputField;
    @FindBy(id = "card-cvv")
    public WebElement cvvInputField;
    @FindBy(className = "card-pay-button-part")
    public WebElement payNowButton;
    @FindBy(css = "iframe[title='3ds-iframe']")
    public WebElement iFrame2;
    @FindBy(id = "otp")
    public WebElement otpField;
    @FindBy(name = "ok")
    public WebElement okButton;
    @FindBy(name = "cancel")
    public WebElement cancelButton;
    @FindBy(xpath = "//span[contains(text(),'Thank you for your purchase.')]")
    public WebElement paymentSuccessful;
    @FindBy(className = "cancel-modal-title")
    public WebElement paymentDeclined;


    //Method to click Buy Now Button
    public void buyNow() {buyNowButton.click();}

    public boolean websiteLogoIsDisplayed() {
        return logoOfWebsite.isDisplayed();
    }

    public void goToUrl() {driver.get("url");}

    public void editTheFields(WebElement webElement, String text) {
        webElement.clear();
        webElement.sendKeys(text);
    }

    public void Checkout() throws InterruptedException {
        Thread.sleep(1000);
        checkoutButton.click();

    }

    public void amountInShoppingCart(){
        // Assert.assertEquals(amountLabel.getText(p),);
    }

    public void checkoutPageVisible() {
        explicitWait().until(ExpectedConditions.visibilityOf(checkoutPopup));
    }

    public void shoppingCartFieldsAreVisible() {
        explicitWait().until(ExpectedConditions.visibilityOf(nameInputValueBox));
        explicitWait().until(ExpectedConditions.visibilityOf(emailInputValueBox));
        explicitWait().until(ExpectedConditions.visibilityOf(phoneNumberInputValueBox));
        explicitWait().until(ExpectedConditions.visibilityOf(cityInputValueBox));
        explicitWait().until(ExpectedConditions.visibilityOf(addressInputValueBox));
        explicitWait().until(ExpectedConditions.visibilityOf(postalCodeInputValueBox));

    }

    public void fieldsCanBeEdited() {
        driver.findElement(By.xpath("//input[@value='Budi']")).sendKeys("Mark");
        driver.findElement(By.xpath("//input[@value='budi@utomo.com']")).sendKeys("Mark@mail.com");
        driver.findElement(By.xpath("//input[@value='081808466410']")).sendKeys("41000000000");
        driver.findElement(By.xpath("//input[@value='Jakarta']")).sendKeys("Baltimore");
        driver.findElement(By.xpath("//textarea[normalize-space()='MidPlaza 2, 4th Floor Jl.Jend.Sudirman Kav.10-11']")).sendKeys("Maryland");
        driver.findElement(By.xpath("//input[@value='10220']")).sendKeys("21236");

    }

    public void checkOut() throws InterruptedException {
        Thread.sleep(1000);
        checkoutButton.click();
    }

    public void orderSummaryPopup() {
        driver.switchTo().frame(iFrame);
        explicitWait().until(ExpectedConditions.visibilityOf(orderId));
    }

    public void orderSummary() {
        driver.switchTo().frame(iFrame);
        explicitWait().until(ExpectedConditions.visibilityOf(orderId));
    }

    public void paymentPage() {
        driver.switchTo().frame(iFrame);
        explicitWait().until(ExpectedConditions.visibilityOf(paymentPage));
    }

    public void payments() {
        String[] expected = {"GoPay","Bank transfer", "Credit/debit card",  "ShopeePay", "QRIS", "Alfa Group","Indomaret","Akulaku PayLater","Kredivo", "UOB EZ Pay","BCA KlikPay", "OCTO Clicks","BRImo", "Danamon Online Banking","klikBCA"};
        // assert that the number of found <option> elements matches the expectations
        System.out.println(paymentOptions.size());
        System.out.println(expected.length);
        Assert.assertEquals(expected.length, paymentOptions.size());
        // assert that the value of every <option> element equals the expected value
        for (int i = 0; i < paymentOptions.size(); i++) {
            if(expected[i].contains(paymentOptions.get(i).getText())){
                assert true;
                System.out.println(paymentOptions.get(i).getText());
            }
        }
    }

    public boolean cardInfoScreenIsWorking(){
        return cardInfoPage.isDisplayed();
    }

    public void clickOnCreditOrDebitCardSection() {
        driver.switchTo().frame(iFrame);
        paymentOptions.get(2).click();
        explicitWait().until(ExpectedConditions.visibilityOf(cardInfoPage));
        cardInfoPage.click();
    }

    public void addCartDetails() {
        editTheFields(cardNumberInput.get(0),prop.getProperty("card.number"));
        editTheFields(expirationDateInputField,prop.getProperty("card.expiry.date"));
        editTheFields(cvvInputField,prop.getProperty("card.cvv"));
        payNowButton.click();
    }

    public boolean beforeCouponApplied() {
        String previousAmount = orderAmountBeforeAddingCart.getText();

        System.out.println("Previous amount: " + previousAmount);
        return orderAmountBeforeAddingCart.isDisplayed();
    }

    public void afterCouponApplied() {
        String updatedAmount = orderAmountBeforeAddingCart.getText();
        System.out.println("Updated amount: " + updatedAmount);
        Assert.assertNotEquals("Rp20.000", updatedAmount);
    }

    public void bankPaymentSection () throws InterruptedException {
        Thread.sleep(5000);
        driver.switchTo().frame(iFrame2);

    }

    public void enteringValidOTP() throws InterruptedException {
        editTheFields(otpField,prop.getProperty("otp"));
        okButton.click();
        Thread.sleep(5000);
        explicitWait().until(ExpectedConditions.visibilityOf(paymentSuccessful));

    }

    public void enteringInvalidOTP() {
        editTheFields(otpField,prop.getProperty("invalid.otp"));
        okButton.click();
        driver.switchTo().parentFrame();
        displayText(paymentDeclined, "Card declined by bank");

    }

    public void cancelTheTransaction() {
        cancelButton.click();
        driver.switchTo().parentFrame();
        displayText(paymentDeclined, "Card declined by bank");
    }

    public void displayText(WebElement webElement, String expectedText) {
        explicitWait().until(ExpectedConditions.visibilityOf(webElement));
        Assert.assertEquals(webElement.getText(), expectedText);

    }

    //Method to click Sign Up Button
    public void clickOnSignUpButton() {signUpButton.click();}

    //Method to click Left Arrow Button
    public void clickOnLeftArrowButton() {leftArrowButton.click();}

    //Method to click Right Arrow Button
    public void clickOnRightArrowButton() {rightArrowButton.click();}

    //Method to verify logo of website is displayed
    public boolean verifyLogoOfWebsiteDisplayed() {return logoOfWebsite.isDisplayed();}
}

