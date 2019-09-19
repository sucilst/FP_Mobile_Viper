package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.FindElements;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.InputSepulsa;

import java.util.List;

public class PLNPrepaid extends AbstractObjectScreen {

    @FindBy(linkText = "Prabayar")
    protected AndroidElement tabPrabayar;

    @AndroidFindBy(id = "com.sepulsa.androiddev:id/et_no_pln")
    protected AndroidElement fieldIDPLN;

    @AndroidFindBy(id = "com.sepulsa.androiddev:id/et_phone_number")
    protected AndroidElement fieldPhonePLN;

    @FindBy(xpath = "//android.widget.TextView[@text='Informasi Pelanggan']")
    protected List<AndroidElement> boxInformasiPelanggan;

    @FindBy(id = "com.sepulsa.androiddev:id/electricity_product_container")
    protected AndroidElement boxPilihanToken;

    @AndroidFindBy(id = "com.sepulsa.androiddev:id/inquiry_result_text")
    protected AndroidElement boxIDSalah;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Rp 100.000\")")
    protected AndroidElement token100k;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Rp 50.000\")")
    protected AndroidElement token50k;

    @FindBy(id = "com.sepulsa.androiddev:id/tv_title")
    protected AndroidElement totalBayar;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Pilih Metode Pembayaran\")")
    protected AndroidElement titleMetodeBayar;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"BCA Virtual Account\"))")
    protected AndroidElement titleBayarBCA;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Mandiri Virtual Account\"))")
    protected AndroidElement titleBayarMandiri;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Virtual Account Semua Bank\"))")
    protected AndroidElement titleBayarSemuaBank;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Bayar Sekarang\").instance(0))")
    protected AndroidElement buttonBayar;

    @AndroidFindBy(id = "com.sepulsa.androiddev:id/txtThankYou")
    protected AndroidElement titleThankYou;

    @AndroidFindBy(id = "com.sepulsa.androiddev:id/txtPaymentGreeting")
    protected AndroidElement titleDetailBayar;

    @AndroidFindBy(id = "com.sepulsa.androiddev:id/et_card_number")
    protected AndroidElement fieldNoCC;

    @AndroidFindBy(id = "com.sepulsa.androiddev:id/sp_expired_year")
    protected AndroidElement fieldTahunCC;

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='2020']")
    protected AndroidElement tahun2020;

    @AndroidFindBy(id = "com.sepulsa.androiddev:id/et_cvv")
    protected AndroidElement fieldNoCVV;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")
    protected AndroidElement errorNotifCC;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='DONE']")
    protected AndroidElement doneButton;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")
    protected AndroidElement midtransOkButton;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='112233']")
    protected AndroidElement midtransPass;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Credit Card\"))")
    protected AndroidElement titleCC;

    // buat sepulsa credit
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Rp0\")")
    protected List<AndroidElement> sisaBayarSepulsaCredit;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Sepulsa Kredit\"))")
    protected AndroidElement titleSepulsaCredit;

    @AndroidFindBy(id = "com.sepulsa.androiddev:id/img_sepulsa_kredit")
    protected AndroidElement ikonBayarSepulsaKredit;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Sepulsa Kredit\")")
    protected List<AndroidElement> adaSepulsaCredit;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"KEMBALI KE BERANDA\").instance(0))")
    protected AndroidElement hyperlinkBeranda;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Bayar Sekarang\").instance(0))")
    protected List<AndroidElement> adaButtonBayar;

    public PLNPrepaid(AndroidDriver driver) {
        super(driver);
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

    public void kolomIDKosong(){
        fieldIDPLN.clear();
    }

    public void kolomHandphoneKosong(){
        fieldPhonePLN.clear();
    }

    public void statusPelangganTampil() {
        Assert.assertFalse((boxInformasiPelanggan.size())==0);
    }

    public void statusPelangganTidakTampil() {
        Assert.assertEquals(0,boxInformasiPelanggan.size());
    }
    public void idPelangganMuncul() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(boxPilihanToken));
        Assert.assertTrue(boxPilihanToken.isDisplayed());
    }

    public void beliToken (String nominal) {
        switch (nominal){
            case "50":
                token50k.click();
                break;
            case "100":
                token100k.click();
                break;
        }
    }

    public void totalTagihanAwalMuncul() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(totalBayar));
        Assert.assertTrue(totalBayar.isDisplayed());
    }

    public void statusGagalTampil() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(boxIDSalah));
        Assert.assertTrue(boxIDSalah.isDisplayed());
        Assert.assertEquals(boxIDSalah.getText(), InputSepulsa.idPelangganSalah,"IDnya bener");
    }

    public void pilihanMetodeBayar() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(titleMetodeBayar));
        Assert.assertTrue(titleMetodeBayar.isDisplayed());
    }

    public void pilihBayarBCA() {
        titleBayarBCA.click();
    }

    public void pilihBayarMandiri() {
        titleBayarMandiri.click();
    }

    public void pilihBayarSemuaBank() {
        titleBayarSemuaBank.click();
    }

    public void pilihCC() {
        titleCC.click();
    }

    public void klikBayar() {
        buttonBayar.click();
    }

    public void diHalamanTagihanBCA() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(titleThankYou));
        wait.until(ExpectedConditions.visibilityOf(titleDetailBayar));
        Assert.assertEquals(titleDetailBayar.getText(), "Informasi pembayaran Virtual Account Bank BCA", "Salah Metode");
    }

    public void diHalamanTagihanMandiri() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(titleThankYou));
        wait.until(ExpectedConditions.visibilityOf(titleDetailBayar));
        Assert.assertEquals(titleDetailBayar.getText(), "Informasi Pembayaran Mandiri Virtual Account", "Salah Metode");
    }

    public void diHalamanTagihanSemuaBank() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(titleThankYou));
        wait.until(ExpectedConditions.visibilityOf(titleDetailBayar));
        Assert.assertEquals(titleDetailBayar.getText(), "Informasi Pembayaran Virtual Account Semua Bank", "Salah Metode");
    }

    public void diHalamanTagihanCC() {
        titleCC.isDisplayed();
    }

    // sepulsa credit
    public void saldoSepulsaCreditCukup() {
        Assert.assertFalse((sisaBayarSepulsaCredit.size())==0);
    }

    public void saldoSepulsaCreditKurang() {
        try {
            Thread.sleep(5000);
            Assert.assertEquals(0, sisaBayarSepulsaCredit.size());
        } catch (Exception e) {}
    }

    public void pilihBayarSepulsaCredit() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(titleSepulsaCredit));
    }

    public void diHalamanSepulsaCredit() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(titleThankYou));
        wait.until(ExpectedConditions.visibilityOf(ikonBayarSepulsaKredit));
    }

    public void sepulsaCreditTidakTersedia(){
        try {
            Thread.sleep(5000);
            Assert.assertEquals(0, adaSepulsaCredit.size());
        } catch (Exception e) {}

    }

    public void bayarSepulsaCreditTidakTersedia() {
        try {
            Thread.sleep(5000);
            Assert.assertEquals(0, adaButtonBayar.size());
        } catch (Exception e) {
        }
    }

    public void tungguProsesPembayaran(){
        try{
            Thread.sleep(30000);
        } catch (Exception e) {}
    }

    public void keHalamanBeranda(){
        hyperlinkBeranda.click();
    }

    public void isiCreditCard() {
        fieldNoCC.sendKeys("4811111111111114");
        driver.hideKeyboard();
        fieldTahunCC.click();
        tahun2020.click();
        fieldNoCVV.sendKeys("123");
    }

    public void isiMidtrans() {
        try {
            Thread.sleep(3000);
            midtransPass.click();
            midtransPass.sendKeys("112233");
            midtransOkButton.click();
            Thread.sleep(6000);
        } catch (Exception e) {}
    }

    public void isiCreditCardInvalid(String detail) {
        switch (detail) {
            case "1":
                //No CVV kosong
                fieldNoCC.sendKeys("4811111111111114");
                fieldTahunCC.click();
                tahun2020.click();
                buttonBayar.click();
                titleCC.isDisplayed();
                break;
            case "2":
                //No CC kosong
                fieldNoCC.sendKeys("123");
                fieldTahunCC.click();
                tahun2020.click();
                buttonBayar.click();
                titleCC.isDisplayed();
                break;
            case "3":
                //No CC invalid
                fieldNoCC.sendKeys("4811");
                fieldTahunCC.click();
                tahun2020.click();
                fieldNoCVV.sendKeys("123");
                buttonBayar.click();
                try {
                    Thread.sleep(2000);
                    errorNotifCC.click();
                } catch (Exception e) {}
                break;
            case "4":
                //No CVV invalid
                fieldNoCC.sendKeys("4811111111111114");
                fieldTahunCC.click();
                tahun2020.click();
                fieldNoCVV.sendKeys("567");
                buttonBayar.click();
                try {
                    Thread.sleep(2000);
                    errorNotifCC.click();
                } catch (Exception e) {}
                break;
            case "5":
                //Tahun Expired Invalid
                fieldNoCC.sendKeys("4811111111111114");
                fieldNoCVV.sendKeys("123");
                buttonBayar.click();
                try {
                    Thread.sleep(2000);
                    errorNotifCC.click();
                } catch (Exception e) {}
                break;
        }
    }

    public void klikDoneButton() {
        doneButton.click();
    }
}
