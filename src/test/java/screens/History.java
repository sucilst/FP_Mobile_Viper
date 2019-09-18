package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class History extends AbstractObjectScreen {
    @AndroidFindBy(id = "com.sepulsa.androiddev:id/txt_title")
    protected AndroidElement titleHistory;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Transaksi Sukses\")")
    protected AndroidElement tabSukses;

    public History(AndroidDriver driver) {
        super(driver);
    }

    public void sudahDiHistory(){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(titleHistory));
        Assert.assertEquals(titleHistory.getText(),"History","Salah Halaman");
    }

    public void cekTransaksiSukses(){

        tabSukses.click();
        try{
            Thread.sleep(2000);
        } catch (Exception e){}
    }

}
