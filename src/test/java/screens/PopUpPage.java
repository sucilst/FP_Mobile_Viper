package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class PopUpPage extends AbstractObjectScreen {

    // pop up enable GPS
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Allow Sepulsa to access device location?']")
    protected AndroidElement popupActivateGPS;

    @AndroidFindBy(id="android:id/button2")
    protected AndroidElement buttonCancelGPS;

    @AndroidFindBy(id = "android:id/alertTitle")
    protected AndroidElement popupGPSMessage;

    @AndroidFindBy(xpath="//android.widget.TextView[@text='Kamu suka App Sepulsa?']")
    protected AndroidElement popupRating;

    @AndroidFindBy(id="com.sepulsa.androiddev:id/btn_rate_yes")
    protected AndroidElement buttonRating;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Waah! Kamu mau bantu rating App Sepulsa? Dijamin kurang dari satu menit aja kok.']")
    protected AndroidElement popupGiveRating;

    @AndroidFindBy(id="com.sepulsa.androiddev:id/btn_rate_playstore_no")
    protected AndroidElement buttonRateLater;

    @AndroidFindBy(className = "android.widget.LinearLayout")
    protected AndroidElement popUpThankYou;

    @AndroidFindBy(id="com.sepulsa.androiddev:id/btn_close")
    protected AndroidElement buttonClose;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Buat Auto Pay?']")
    protected AndroidElement popupAutoPay;

    @AndroidFindBy(id="com.sepulsa.androiddev:id/btn_action_no")
    protected AndroidElement buttonAutoPayNo;

    @AndroidFindBy(id = "com.sepulsa.androiddev:id/btn_close")
    protected AndroidElement popupKamuSukaSepulsa;

    @AndroidFindBy(id = "com.sepulsa.androiddev:id/iv_close")
    protected AndroidElement popupAutoPay;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Buat Auto Pay?']")
    protected AndroidElement validatePopUpAutoPay;

    public PopUpPage(AndroidDriver driver) {
        super(driver);
    }

    public void disableGPS() {
        try {
            Thread.sleep(1000);
            if (popupActivateGPS.isDisplayed())
                buttonCancelGPS.click();
        } catch (Exception e){}
    }

    public void disableGPSSettings() {
        try {
            Thread.sleep(500);
            if (popupGPSMessage.isDisplayed())
                buttonCancelGPS.click();
        } catch (Exception e){}
    }

    public void disablePopUp() {
        try {
            Thread.sleep(500);
            if(popupRating.isDisplayed())
                buttonRating.click();
            if(popupGiveRating.isDisplayed())
                buttonRateLater.click();
            if(popUpThankYou.isDisplayed())
                buttonClose.click();
            if(popupAutoPay.isDisplayed())
                buttonAutoPayNo.click();
        } catch (Exception e) {}
    }

    public void munculAutoPay() {
        if(validatePopUpAutoPay.isDisplayed()) {
            popupAutoPay.click();
        }
    }

    public void munculKamuSukaSepulsa() {
        if(popupKamuSukaSepulsa.isDisplayed()) {
            popupKamuSukaSepulsa.click();
        }
    }
}
