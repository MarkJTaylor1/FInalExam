package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {



    WebDriver driver;

    public ShoppingCartPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Locator for Shopping Cart Logo
    @FindBy(xpath = "//div[@class='cart-inner']//span[1]")
    WebElement shoppingCartLogo;

    //Locator for Shopping Cart Label
    @FindBy(xpath = "//span[@class='label label-primary']")
    WebElement shoppingCartLabel;

    //Locator for Product Logo
    @FindBy(xpath = "//th[normalize-space()='Product']")
    WebElement productLogo;

    //Locator for Quantity Logo
    @FindBy(xpath = "//th[normalize-space()='Qty']")
    WebElement quantityLogo;

    //Locator for Amount Logo
    @FindBy(xpath = "//th[@class='amount']")
    WebElement amountLogo;

    //Locator for Name Logo
    @FindBy(xpath = "//td[normalize-space()='Name']")
    WebElement nameLogo;

    //Locator for Name Input Value Box
    @FindBy(xpath = "//input[@value='Budi']")
    WebElement nameInputValueBox;

    //Locator for Email Logo
    @FindBy(xpath = "//td[normalize-space()='Email']")
    WebElement emailLogo;

    //Locator for Email Input Value Box
    @FindBy(xpath = "//input[@value='budi@utomo.com']")
    WebElement emailInputValueBox;

    //Locator for Phone Number Logo
    @FindBy(xpath = "//td[normalize-space()='Phone no']")
    WebElement phoneNumberLogo;

    //Locator for Phone Number Input Value Box
    @FindBy(xpath = "//input[@value='081808466410']")
    WebElement phoneNumberInputValueBox;

    //Locator for City Logo
    @FindBy(xpath = "//td[normalize-space()='City']")
    WebElement cityLogo;

    //Locator for City Input Value Box
    @FindBy(xpath = "//input[@value='Jakarta']")
    WebElement cityInputValueBox;

    //Locator for Address Logo
    @FindBy(xpath = "//td[normalize-space()='Address']")
    WebElement addressLogo;

    //Locator for Address Input Value Box
    @FindBy(xpath = "//textarea[normalize-space()='MidPlaza 2, 4th Floor Jl.Jend.Sudirman Kav.10-11']")
    WebElement addressInputValueBox;

    //Locator for Postal Code Logo
    @FindBy(xpath = "//td[normalize-space()='Postal Code']")
    WebElement postalCodeLogo;

    //Locator for Postal Code Input Value Box
    @FindBy(xpath = "//input[@value='10220']")
    WebElement postalCodeInputValueBox;

    //Locator for Checkout Box
    @FindBy(xpath = "//div[@class='cart-checkout']")
    public
    WebElement checkoutBox;

    //Locator for Settings Box
    @FindBy(xpath = "//div[@class='cart-checkout-settings']")
    WebElement settingsBox;

    //Locator for Cancel Box
    @FindBy(xpath = "//div[@class='cancel-btn']")
    WebElement cancelBox;



    //Method to verify shopping Cart Logo is displayed
    public boolean verifyOnShoppingCartLogo(){ return shoppingCartLogo.isDisplayed();}

    //Method to verify shoppingCartLabel is displayed
    public boolean verifyOnShoppingCartLabel(){ return shoppingCartLabel.isDisplayed();}

    //Method to verify productLogo is displayed
    public boolean verifyProductLogo(){ return productLogo.isDisplayed();}

    //Method to verify quantityLogo is displayed
    public boolean verifyQuantityLogo(){ return quantityLogo.isDisplayed();}

    //Method to verify amountLogo is displayed
    public boolean verifyAmountLogo(){ return amountLogo.isDisplayed();}

    //Method to verify nameLogo is displayed
    public boolean verifyNameLogo(){ return nameLogo.isDisplayed();}

    //Method to verify phoneNumberLogo is displayed
    public boolean phoneNumberLogo(){ return phoneNumberLogo.isDisplayed();}

    //Method to verify emailLogo is displayed
    public boolean emailLogo(){ return emailLogo.isDisplayed();}

    //Method to verify cityLogo is displayed
    public boolean cityLogo(){ return cityLogo.isDisplayed();}

    //Method to verify addressLogo is displayed
    public boolean addressLogo(){ return addressLogo.isDisplayed();}

    //Method to verify postalCodeLogo is displayed
    public boolean postalCodeLogo(){ return postalCodeLogo.isDisplayed();}

    //Method to verify Checkout Box is displayed
    public boolean checkoutBox () {return checkoutBox.isDisplayed();}



    //Method to click emailInputValueBox
    public void clickOnEmailInputValueBox(){emailInputValueBox.click();}

    //Method to click phoneNumberInputValueBox
    public void clickOnPhoneNumberInputValueBox(){phoneNumberInputValueBox.click();}

    //Method to click nameInputValueBox
    public void clickOnNameInputValueBox(){nameInputValueBox.click();}

    //Method to click cityInputValueBox
    public void clickOnCityInputValueBox(){cityInputValueBox.click();}

    //Method to click addressInputValueBox
    public void clickOnAddressInputValueBox(){addressInputValueBox.click();}

    //Method to click postalCodeInputValueBox
    public void clickOnPostalCodeInputValueBox(){postalCodeInputValueBox.click();}

    //Method to click checkoutBox
    public void clickOnCheckoutBox(){checkoutBox.click();}

    //Method to click settingsBox
    public void clickOnSettingsBox(){settingsBox.click();}

    //Method to click cancelBox
    public void clickOnCancelBox(){cancelBox.click();}

}
