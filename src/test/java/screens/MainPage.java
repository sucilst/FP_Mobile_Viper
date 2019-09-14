package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MainPage extends AbstractObjectScreen {

    // define the input
    // String signinID, signinPassword, registerEmail, registerNumber, registerName, registerPassword;

    // welcome screen
    @AndroidFindBy(id="com.sepulsa.androiddev:id/btn_skip")
    protected AndroidElement buttonMulai;

    // tabs
    @AndroidFindBy(id = "com.sepulsa.androiddev:id/aa_txt_signin")
    protected AndroidElement tabSignIn;

    @AndroidFindBy(id = "com.sepulsa.androiddev:id/aa_txt_register")
    protected AndroidElement tabRegister;

    // sign in menu
    @AndroidFindBy(id = "com.sepulsa.androiddev:id/fl_edt_emailphone")
    protected AndroidElement fieldUserSignIn;

    @AndroidFindBy(id = "com.sepulsa.androiddev:id/fl_edt_password")
    protected AndroidElement fieldPasswordSignIn;

    @AndroidFindBy(id = "com.sepulsa.androiddev:id/fl_btn_signin")
    protected AndroidElement buttonSignIn;

    // register menu
    @AndroidFindBy(id = "com.sepulsa.androiddev:id/fr_edt_name")
    protected AndroidElement fieldNameRegister;

    @AndroidFindBy(id = "com.sepulsa.androiddev:id/fr_edt_handphone")
    protected AndroidElement fieldHandphoneRegister;

    @AndroidFindBy(id = "com.sepulsa.androiddev:id/fr_edt_email")
    protected AndroidElement fieldEmailRegister;

    @AndroidFindBy(id = "com.sepulsa.androiddev:id/fr_edt_password")
    protected AndroidElement fieldPasswordRegister;

    @AndroidFindBy(id = "com.sepulsa.androiddev:id/cb_tnc_pnp")
    protected AndroidElement checkboxRegister;

    @AndroidFindBy(id = "com.sepulsa.androiddev:id/fr_btn_register")
    protected AndroidElement buttonRegister;

    // pop up toast box

    public MainPage(AndroidDriver driver) {
        super(driver);
    }

    // commands
    public void klikMulai(){
        buttonMulai.click();
    }

    public void klikTabRegister(){
        tabRegister.click();
    }

    public void klikTabSignIn(){
        tabSignIn.click();
    }

    public void isiIdSignIn(String signinID){
        fieldUserSignIn.sendKeys(signinID);
    }

    public void isiPasswordSignIn(String signinPassword) {
        fieldPasswordSignIn.sendKeys(signinPassword);
    }

    public void submitSignIn(){
        buttonSignIn.click();
    }

    public void isiNamaRegister(String registerName) {
        fieldNameRegister.sendKeys(registerName);
    }

    public void isiEmailRegister(String registerEmail) {
        fieldEmailRegister.sendKeys(registerEmail);
    }

    public void isiHandphoneRegister(String registerNumber) {
        fieldHandphoneRegister.sendKeys(registerNumber);
    }

    public void isiPasswordRegister(String registerPassword) {
        fieldPasswordRegister.sendKeys(registerPassword);
    }

    public void setujuSyarat() {
        checkboxRegister.click();
    }

    public void submitRegister(){
        buttonRegister.click();
    }

    public void testToast() {

    }
}
