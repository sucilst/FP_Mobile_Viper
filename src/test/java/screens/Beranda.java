package screens;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

public class Beranda extends AbstractObjectScreen {
    // verifikasi halaman
    @AndroidFindBy(className = "android.widget.TextView")
    protected AndroidElement textBoxMulaiTransaksi;

    // button menu
    @AndroidFindBy(id="com.sepulsa.androiddev:id/fab_isi_pulsa")
    protected AndroidElement buttonPulsa;

    @AndroidFindBy(id="com.sepulsa.androiddev:id/fab_pln")
    protected AndroidElement buttonListrik;

    @AndroidFindBy(id="com.sepulsa.androiddev:id/fab_bpjs")
    protected AndroidElement buttonBPJS;

    @AndroidFindBy(id = "com.sepulsa.androiddev:id/img_sepulsa_kredit")
    protected AndroidElement buttonSepulsaKredit;

    @FindBy(className = "android.support.v7.app.ActionBar$Tab")
    protected List<AndroidElement> bottomMenu;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='MENU']")
    protected AndroidElement tabMenu;

    @AndroidFindBy(id = "com.sepulsa.androiddev:id/menu_signout")
    protected AndroidElement menuSignOut;

    public Beranda(AndroidDriver driver) {
        super(driver);
    }

    public void sudahDiBeranda(){

        try {
            Thread.sleep(3000);
            Assert.assertTrue(textBoxMulaiTransaksi.isDisplayed());
            Assert.assertEquals(textBoxMulaiTransaksi.getText(),"Auto Pay","Salah Tab");
        } catch (Exception e) {}

    }

    public void menuPulsa(){
        buttonPulsa.click();
    }

    public void menuPLN(){
        buttonListrik.click();
    }

    public void menuBPJS(){
        buttonBPJS.click();
    }

   public void klikMenuAdmin() {
       AndroidElement userMenu = bottomMenu.get(4);
       userMenu.click();
   }

   public void klikMenuHistory() {
        AndroidElement historyMenu = bottomMenu.get(2);
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOf(historyMenu));
        historyMenu.click();
   }
    public void pilihUserMenu() {
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOf(tabMenu));
        Assert.assertTrue(tabMenu.isDisplayed());
    }

    public void pilihSignOut() {
        menuSignOut.click();
    }

    public void menuSepulsaCredit() {
        buttonSepulsaKredit.click();
    }
}
