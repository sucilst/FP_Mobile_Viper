package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.junit.Assert;

public class IsiPulsa extends AbstractObjectScreen {

    @AndroidFindBy(id = "com.sepulsa.androiddev:id/et_phone_number")
    protected AndroidElement fieldNoHP;

    @AndroidFindBy(id = "com.sepulsa.androiddev:id/iv_phone_book")
    protected AndroidElement phoneBookButton;

    @AndroidFindBy(xpath = "//android.widget.Toast[1]")
    protected AndroidElement toastMessage;

    @AndroidFindBy(uiAutomator = "UiScrollable(new UiSelector()).scrollIntoView(text(\"Adb Sepulsa Success\"))")
    protected AndroidElement contactNumber;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Rp50.000']")
    protected AndroidElement pulsa50rb;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Rp100.000']")
    protected AndroidElement pulsa100rb;

    @AndroidFindBy(uiAutomator = "UiScrollable(new UiSelector()).scrollIntoView(text(\"Rp200.000\"))")
    protected AndroidElement pulsa200rb;

    @AndroidFindBy(uiAutomator = "UiScrollable(new UiSelector()).scrollIntoView(text(\"Rp300.000\"))")
    protected AndroidElement pulsa300rb;

    @AndroidFindBy(uiAutomator = "UiScrollable(new UiSelector()).scrollIntoView(text(\"Rp500.000\"))")
    protected AndroidElement pulsa500rb;

    @AndroidFindBy(uiAutomator = "UiScrollable(new UiSelector()).scrollIntoView(text(\"Rp1.000.000\"))")
    protected AndroidElement pulsa1jt;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Rp50.000']")
    protected AndroidElement validate50rb;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Rp100.000']")
    protected AndroidElement validate100rb;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Rp200.000']")
    protected AndroidElement validate200rb;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Rp300.000']")
    protected AndroidElement validate300rb;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Rp500.000']")
    protected AndroidElement validate500rb;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Rp1.000.000']")
    protected AndroidElement validate1jt;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='BCA Virtual Account']")
    protected AndroidElement pembayaranBCA;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Mandiri Virtual Account']")
    protected AndroidElement pembayaranMandiri;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Virtual Account Semua Bank']")
    protected AndroidElement pembayaranPermata;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Credit Card']")
    protected AndroidElement pembayaranCC;

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

    //@AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")
    //protected AndroidElement midtransOkButton;

    //@AndroidFindBy(id = "PaRes")
    //protected AndroidElement midtransPass;

    @AndroidFindBy(uiAutomator = "UiScrollable(new UiSelector()).scrollIntoView(text(\"Bayar Sekarang\"))")
    protected AndroidElement tombolBayar;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Bank Central Asia']")
    protected AndroidElement sesuaiBCA;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Bank Mandiri']")
    protected AndroidElement sesuaiMandiri;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Bank Permata']")
    protected AndroidElement sesuaiPermata;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Credit Card']")
    protected AndroidElement sesuaiCC;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Sepulsa Kredit']")
    protected AndroidElement sesuaiSepulsaKredit;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='DONE']")
    protected AndroidElement doneButton;

    public IsiPulsa(AndroidDriver driver) {
        super(driver);
    }

    public void isiFieldNoHP(String no_hp) {
        fieldNoHP.sendKeys(no_hp);
    }

    public void clickPhoneBook() {
        phoneBookButton.click();
    }

    public void pilihContact() {
        contactNumber.click();
    }

    public void validateToast() {
        Assert.assertTrue(toastMessage.getText().equals("Nomor handphone kurang dari 8 digit"));
    }

    public void pilihNominal(int pulsa) {
        switch (pulsa) {
            case (50):
                pulsa50rb.click();
                break;
            case (100):
                pulsa100rb.click();
                break;
            case (200):
                pulsa200rb.click();
                break;
            case (300):
                pulsa300rb.click();
                break;
            case (500):
                pulsa500rb.click();
                break;
            case (1000):
                pulsa1jt.click();
                break;
        }
    }

    public void validateNominal(int pulsa) {
        switch (pulsa) {
            case (50):
                validate50rb.isDisplayed();
                break;
            case (100):
                validate100rb.isDisplayed();
                break;
            case (200):
                validate200rb.isDisplayed();
                break;
            case (300):
                validate300rb.isDisplayed();
                break;
            case (500):
                validate500rb.isDisplayed();
                break;
            case (1000):
                validate1jt.isDisplayed();
                break;
        }
    }

    public void pilihPembayaranBCA() {
        pembayaranBCA.click();
    }

    public void pilihPembayaranMandiri() {
        pembayaranMandiri.click();
    }

    public void pilihPembayaranPermata() {
        pembayaranPermata.click();
    }

    public void pilihPembayaranCC() {
        pembayaranCC.click();
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
            //midtransPass.click();
            //midtransPass.sendKeys("112233");
            //midtransOkButton.click();
            Thread.sleep(6000);
        } catch (Exception e) {}
    }

    public void isiCreditCardInvalid(String field) {
        switch (field) {
            case "1":
                //No CVV kosong
                fieldNoCC.sendKeys("4811111111111114");
                fieldTahunCC.click();
                tahun2020.click();
                tombolBayar.click();
                pembayaranCC.isDisplayed();
                break;
            case "2":
                //No CC kosong
                fieldNoCC.sendKeys("123");
                fieldTahunCC.click();
                tahun2020.click();
                tombolBayar.click();
                pembayaranCC.isDisplayed();
                break;
            case "3":
                //No CC invalid
                fieldNoCC.sendKeys("4811");
                fieldTahunCC.click();
                tahun2020.click();
                fieldNoCVV.sendKeys("123");
                tombolBayar.click();
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
                tombolBayar.click();
                try {
                    Thread.sleep(2000);
                    errorNotifCC.click();
                } catch (Exception e) {}
                break;
            case "5":
                //Tahun Expired Invalid
                fieldNoCC.sendKeys("4811111111111114");
                fieldNoCVV.sendKeys("123");
                tombolBayar.click();
                try {
                    Thread.sleep(2000);
                    errorNotifCC.click();
                } catch (Exception e) {}
                break;
        }
    }

    public void pilihPembayaranSisa(String pembayaran) {
        switch (pembayaran) {
            case "bca":
                pembayaranBCA.click();
                break;
            case "mandiri":
                pembayaranMandiri.click();
                break;
            case "permata":
                pembayaranPermata.click();
                break;
        }
    }

    public void klikTombolBayar() {
        tombolBayar.click();
    }

    public void halamanBCA() {
        sesuaiBCA.isDisplayed();
    }

    public void halamanMandiri() {
        sesuaiMandiri.isDisplayed();
    }

    public void halamanPermata() {
        sesuaiPermata.isDisplayed();
    }

    public void halamanSisa(String pembayaran) {
        switch (pembayaran) {
            case "bca":
                sesuaiBCA.isDisplayed();
                break;
            case "mandiri":
                sesuaiMandiri.isDisplayed();
                break;
            case "permata":
                sesuaiPermata.isDisplayed();
                break;
        }
    }

    public void halamanSepulsaKredit() {
        sesuaiSepulsaKredit.isDisplayed();
    }

    public void halamanCC() {
        try {
            Thread.sleep(3000);
            sesuaiCC.isDisplayed();
        } catch (Exception e) {}
    }

    public void validateTidakAdaSK() {
        pembayaranMandiri.isDisplayed();
    }

    public void clickDoneButton() {
        doneButton.click();
    }
}
