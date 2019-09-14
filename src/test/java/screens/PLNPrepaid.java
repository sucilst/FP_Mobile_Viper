package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class PLNPrepaid extends AbstractObjectScreen {

    @FindBy(linkText = "Prabayar")
    protected AndroidElement tabPrabayar;

    @AndroidFindBy(id="com.sepulsa.androiddev:id/et_no_pln")
    protected AndroidElement fieldIDPLN;

    @AndroidFindBy(id="com.sepulsa.androiddev:id/et_phone_number")
    protected AndroidElement fieldPhonePLN;

    @FindBy(xpath = "//android.widget.TextView[@text='Informasi Pelanggan']")
    protected AndroidElement boxInformasiPelanggan;

    @FindBy(id="com.sepulsa.androiddev:id/electricity_product_container")
    protected AndroidElement boxPilihanToken;

    @AndroidFindBy(id = "com.sepulsa.androiddev:id/inquiry_result_text")
    protected AndroidElement boxIDSalah;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Rp 100.000\")")
    protected AndroidElement token100k;


    public PLNPrepaid(AndroidDriver driver) {
        super(driver);
    }

    public void pilihPrabayar(){
       tabPrabayar.click();
    }

    public void isiIDPel(String idPel) {
        fieldIDPLN.sendKeys(idPel);
        driver.hideKeyboard();
    }

    public void isiNoHP(String noHP) {
        fieldPhonePLN.clear();
        fieldPhonePLN.sendKeys(noHP);
        driver.hideKeyboard();
    }

    public void statusPelangganTampil(){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOf(boxInformasiPelanggan));
        Assert.assertTrue(boxInformasiPelanggan.isDisplayed());
    }

    public void idPelangganMuncul(){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOf(boxPilihanToken));
        Assert.assertTrue(boxPilihanToken.isDisplayed());
    }

    public void beliToken100k(){
        token100k.click();
    }

    public void statusGagalTampil(){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOf(boxIDSalah));
        Assert.assertTrue(boxIDSalah.isDisplayed());

    }
}
