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

    @AndroidFindBy(id="android:id/message")
    protected AndroidElement popupMessage;


    public PopUpPage(AndroidDriver driver) {
        super(driver);
    }

    public void disableGPS() {
        try {
            Thread.sleep(10000);
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

    public void popUpTimeout() {
        try {
            Thread.sleep(500);
            if(popupMessage.isDisplayed())
                wait();
        } catch (Exception e) {}
    }
}
