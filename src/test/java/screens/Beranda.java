package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.testng.Assert;

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

    public Beranda(AndroidDriver driver) {
        super(driver);
    }

    public void sudahDiBeranda(){
        try {
            Thread.sleep(3000);
            Assert.assertTrue(textBoxMulaiTransaksi.isDisplayed());
            //Assert.assertEquals(textBoxMulaiTransaksi.getText(),"Auto Pay","Salah Tab");
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

}
