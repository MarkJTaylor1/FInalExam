package Tests;

import DriverSetup.SetupDriver;
import Pages.HomePage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class AllTests extends SetupDriver {
    public static Properties prop = new Properties();
    public Actions actions;

    public AllTests(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public AllTests() {
        try {
            String var10002 = System.getProperty("user.dir");
            FileInputStream file = new FileInputStream(var10002 + File.separator + "resources" + File.separator + "testData" + File.separator + "config.properties");
            prop.load(file);
        } catch (FileNotFoundException var2) {
            var2.printStackTrace();
        } catch (IOException var3) {
            var3.printStackTrace();
        }

    }

    @Test(
            testName = "TC-1",
            priority = 1,
            groups = {"regression"}
    )
    public void verifyPillowAddedToCart() {
        this.homePage = new HomePage(this.driver);
        this.driver.get(prop.getProperty("url"));
        this.homePage.buyNow();
        this.homePage.amountInShoppingCart();
    }

    @Test(
            testName = "TC-2",
            priority = 2,
            groups = {"smoke", "regression"}
    )
    public void verifyCheckoutPopupOpens() throws InterruptedException {
        this.homePage.buyNow();
        this.homePage.Checkout();
    }

    @Test(
            testName = "TC-3",
            priority = 3,
            groups = {"regression"}
    )
    public void verifyInputValuesAreAvailable() {
        this.homePage.buyNow();
        this.driver.findElement(By.xpath("//input[@value='Budi']"));
        this.driver.findElement(By.xpath("//input[@value='budi@utomo.com']"));
        this.driver.findElement(By.xpath("//input[@value='081808466410']"));
        this.driver.findElement(By.xpath("//input[@value='Jakarta']"));
        this.driver.findElement(By.xpath("//textarea[normalize-space()='MidPlaza 2, 4th Floor Jl.Jend.Sudirman Kav.10-11']"));
        this.driver.findElement(By.xpath("//input[@value='10220']"));
    }

    @Test(
            testName = "TC-4",
            priority = 4,
            groups = {"regression"}
    )
    public void verifyFieldsAreEditableInCheckoutWindow() {
        this.homePage.buyNow();
        this.driver.findElement(By.xpath("//input[@value='Budi']")).sendKeys(new CharSequence[]{"Mark"});
        this.driver.findElement(By.xpath("//input[@value='budi@utomo.com']")).sendKeys(new CharSequence[]{"Mark@mail.com"});
        this.driver.findElement(By.xpath("//input[@value='081808466410']")).sendKeys(new CharSequence[]{"123456789"});
        this.driver.findElement(By.xpath("//input[@value='Jakarta']")).sendKeys(new CharSequence[]{"York"});
        this.driver.findElement(By.xpath("//textarea[normalize-space()='MidPlaza 2, 4th Floor Jl.Jend.Sudirman Kav.10-11']")).sendKeys(new CharSequence[]{"123 Main St"});
        this.driver.findElement(By.xpath("//input[@value='10220']")).sendKeys(new CharSequence[]{"12345"});
    }

    @Test(
            testName = "TC-5",
            priority = 5,
            groups = {"smoke", "regression"}
    )
    public void verifyClickingCheckoutRedirectsToOrderSummaryPopup() throws InterruptedException {
        this.homePage.buyNow();
        this.homePage.Checkout();
        this.homePage.orderSummaryPopup();
    }

    @Test(
            testName = "TC-6",
            priority = 6,
            groups = {"regression"}
    )
    public void verifyProductAndPriceOnOrderSummary() throws InterruptedException {
        this.homePage.buyNow();
        this.homePage.Checkout();
        this.homePage.orderSummary();
    }

    @Test(
            testName = "TC-7",
            priority = 7,
            groups = {"smoke", "regression"}
    )
    public void verifySelectPaymentPagefromOrderSummary() throws InterruptedException {
        this.homePage.buyNow();
        this.homePage.Checkout();
        this.homePage.paymentPage();
    }

    @Test(
            testName = "TC-8",
            priority = 8,
            groups = {"regression"}
    )
    public void verifyPaymentOptionsAreVisible() throws InterruptedException {
        this.homePage.buyNow();
        this.homePage.Checkout();
        this.homePage.paymentPage();
        this.homePage.payments();
    }

    @Test(
            testName = "TC-9",
            priority = 9,
            groups = {"smoke", "regression"}
    )
    public void verifyClickingOnDebitOrCreditCardPaymentRedirectsToCardDetailsScreen() throws InterruptedException {
        this.homePage.buyNow();
        this.homePage.Checkout();
        this.homePage.clickOnCreditOrDebitCardSection();
    }

    @Test(
            testName = "TC-10",
            priority = 10,
            groups = {"regression"}
    )
    public void verifyOrderAmountOnCardDetailsScreenAndApplyCouponCodeThenValidateNewAmount() throws InterruptedException {
        this.homePage.buyNow();
        this.homePage.Checkout();
        this.homePage.clickOnCreditOrDebitCardSection();
        this.homePage.beforeCouponApplied();
        this.homePage.editTheFields((WebElement)this.homePage.cardNumberInput.get(0), prop.getProperty("card.number"));
        this.homePage.afterCouponApplied();
    }

    @Test(
            testName = "TC-11",
            priority = 11,
            groups = {"smoke", "regression"}
    )
    public void enterValidCardDetailsAndClickPayNow() throws InterruptedException {
        this.homePage.buyNow();
        this.homePage.Checkout();
        this.homePage.clickOnCreditOrDebitCardSection();
        this.homePage.addCartDetails();
    }

    @Test(
            testName = "TC-12",
            priority = 12,
            groups = {"regression"}
    )
    public void verifyClickingPayNowRedirectsToBankPaymentScreenThenVerifyExitDetails() throws InterruptedException {
        this.homePage.buyNow();
        this.homePage.Checkout();
        this.homePage.clickOnCreditOrDebitCardSection();
        this.homePage.addCartDetails();
        this.homePage.bankPaymentSection();
    }

    @Test(
            testName = "TC-13",
            priority = 13,
            groups = {"smoke", "regression"}
    )
    public void verifyClickingOkWithValidOtpRedirectsToOrderSuccessfulScreen() throws InterruptedException {
        this.homePage.buyNow();
        this.homePage.Checkout();
        this.homePage.clickOnCreditOrDebitCardSection();
        this.homePage.addCartDetails();
        this.homePage.bankPaymentSection();
        this.homePage.enteringValidOTP();
    }

    @Test(
            testName = "TC-14",
            priority = 14,
            groups = {"regression"}
    )
    public void verifyClickingOkButtonWithInvalidOtpRedirectsToOrderFailedScreen() throws InterruptedException {
        this.homePage.buyNow();
        this.homePage.Checkout();
        this.homePage.clickOnCreditOrDebitCardSection();
        this.homePage.addCartDetails();
        this.homePage.bankPaymentSection();
        this.homePage.enteringInvalidOTP();
    }

    @Test(
            testName = "TC-15",
            priority = 15,
            groups = {"regression"}
    )
    public void verifyClickingCancelButtonShouldRedirectUserToOrderFaliedScreen() throws InterruptedException {
        this.homePage.buyNow();
        this.homePage.Checkout();
        this.homePage.clickOnCreditOrDebitCardSection();
        this.homePage.addCartDetails();
        this.homePage.bankPaymentSection();
        this.homePage.cancelTheTransaction();
    }
}

