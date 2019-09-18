package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.InputSepulsa;

import java.util.List;

public class PLNPostpaid extends AbstractObjectScreen {
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Pascabayar\")")
    protected AndroidElement tabPascabayar;

    @AndroidFindBy(id="com.sepulsa.androiddev:id/et_no_pln")
    protected AndroidElement fieldIDPLN;

    @AndroidFindBy(id="com.sepulsa.androiddev:id/et_phone_number")
    protected AndroidElement fieldPhonePLN;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Informasi Tagihan']")
    protected AndroidElement boxInformasiTagihan;

    @FindBy(id="com.sepulsa.androiddev:id/electricity_product_container")
    protected AndroidElement boxTagihanListrik;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Bayar Tagihan Sekarang\").instance(0))")
    protected AndroidElement buttonBayarTagihan;

    @AndroidFindBy(id = "com.sepulsa.androiddev:id/inquiry_result_text")
    protected AndroidElement boxIDSalah;

    @FindBy(id = "com.sepulsa.androiddev:id/tv_title")
    protected AndroidElement totalBayar;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Pilih Metode Pembayaran\")")
    protected AndroidElement titleMetodeBayar;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"BCA Virtual Account\"))")
    protected AndroidElement titleBayarBCA;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Credit Card\"))")
    protected AndroidElement titleCC;

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

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"KEMBALI KE BERANDA\").instance(0))")
    protected AndroidElement hyperlinkBeranda;

    @FindBy(xpath = "//android.widget.TextView[@text='Informasi Tagihan']")
    protected List<AndroidElement> adaInformasiTagihan;

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

    public PLNPostpaid(AndroidDriver driver) {
        super(driver);
    }

    public void pilihPascabayar(){
        tabPascabayar.click();
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
        wait.until(ExpectedConditions.visibilityOf(boxInformasiTagihan));
        Assert.assertTrue(boxInformasiTagihan.isDisplayed());
    }

    public void kolomIDKosong(){
        fieldIDPLN.clear();
    }

    public void kolomHandphoneKosong(){
        fieldPhonePLN.clear();
    }

    public void totalTagihanAwalMuncul() {
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOf(boxTagihanListrik));
        Assert.assertTrue(boxTagihanListrik.isDisplayed());
    }
    public void statusGagalTampil(){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOf(boxIDSalah));
        Assert.assertTrue(boxIDSalah.isDisplayed());
        Assert.assertEquals(boxIDSalah.getText(), InputSepulsa.idPelangganSalah,"IDnya bener");
    }

    public void statusSudahBayarTampil(){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOf(boxIDSalah));
        Assert.assertTrue(boxIDSalah.isDisplayed());
        Assert.assertEquals(boxIDSalah.getText(),InputSepulsa.generalError,"Unknown error");
    }

    public void keHalamanPembayaran(){
        buttonBayarTagihan.click();
    }
    public void diHalamanPembayaran(){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOf(totalBayar));
        Assert.assertTrue(totalBayar.isDisplayed());
    }

    public void pilihanMetodeBayar(){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOf(titleMetodeBayar));
        Assert.assertTrue(titleMetodeBayar.isDisplayed());
    }

    public void pilihBayarBCA(){
        titleBayarBCA.click();
    }

    public void pilihBayarMandiri(){
        titleBayarMandiri.click();
    }

    public void pilihBayarSemuaBank(){
        titleBayarSemuaBank.click();
    }

    public void pilihBayarCC() {
        titleCC.click();
    }

    public void klikBayar(){
        buttonBayar.click();
    }

    public void diHalamanTagihanBCA(){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOf(titleThankYou));
        wait.until(ExpectedConditions.visibilityOf(titleDetailBayar));
        Assert.assertEquals(titleDetailBayar.getText(),"Informasi pembayaran Virtual Account Bank BCA","Salah Metode");
    }

    public void diHalamanTagihanMandiri(){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOf(titleThankYou));
        wait.until(ExpectedConditions.visibilityOf(titleDetailBayar));
        Assert.assertEquals(titleDetailBayar.getText(),"Informasi Pembayaran Mandiri Virtual Account","Salah Metode");
    }

    public void diHalamanTagihanSemuaBank(){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOf(titleThankYou));
        wait.until(ExpectedConditions.visibilityOf(titleDetailBayar));
        Assert.assertEquals(titleDetailBayar.getText(),"Informasi Pembayaran Virtual Account Semua Bank","Salah Metode");
    }

    public void diHalamanTagihanCC() {
        titleCC.isDisplayed();
    }

    public void tungguProsesPembayaran(){
        try{
            Thread.sleep(30000);
        } catch (Exception e) {}
    }

    public void keHalamanBeranda(){
        hyperlinkBeranda.click();
    }

    public void statusTagihanTidakTampil() {
        Assert.assertEquals(0,adaInformasiTagihan.size());
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
