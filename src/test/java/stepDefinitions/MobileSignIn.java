package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;
import utils.InputSepulsa;
import utils.ThreadLocalDriver;

public class MobileSignIn extends BaseStep {
    AndroidDriver driver;
    @Before
    public void initiate(){
        driver = ThreadLocalDriver.getTLDriver();
    }

    @Given("^user membuka aplikasi Sepulsa$")
    public void user_membuka_aplikasi_Sepulsa() throws Throwable {
        driver.resetApp();
        popUpPage.disableGPS();
        mainPage.klikMulai();
    }

    @When("^user memilih tab SIGN IN$")
    public void user_memilih_tab_SIGN_IN() throws Throwable {
        mainPage.klikTabSignIn();
    }

    @When("^user memasukkan email yang terdaftar di kolom No\\. Handphone atau Email$")
    public void user_memasukkan_email_yang_terdaftar_di_kolom_No_Handphone_atau_Email() throws Throwable {
        mainPage.isiIdSignIn(InputSepulsa.signinMail);
    }

    @When("^user melakukan tap pada tombol Sign In$")
    public void user_melakukan_tap_pada_tombol_Sign_In() throws Throwable {
        mainPage.submitSignIn();
    }

    @Then("^user masuk ke halaman beranda aplikasi Sepulsa$")
    public void user_masuk_ke_halaman_beranda_aplikasi_Sepulsa() throws Throwable {
        beranda.sudahDiBeranda();
    }

    @When("^user memasukkan email yang tidak terdaftar di kolom No\\. Handphone atau Email$")
    public void user_memasukkan_email_yang_tidak_terdaftar_di_kolom_No_Handphone_atau_Email() throws Throwable {
        mainPage.isiIdSignIn(InputSepulsa.wrongPassword);
    }

    @When("^user memasukkan password di kolom password$")
    public void user_memasukkan_password_di_kolom_password() throws Throwable {
        mainPage.isiPasswordSignIn(InputSepulsa.signinPassword);
    }

    @Then("^akan muncul notifikasi \"([^\"]*)\"$")
    public void akan_muncul_notifikasi(String arg1) throws Throwable {

    }

    @When("^user memasukkan no handphone yang tidak terdaftar di kolom No\\. Handphone atau Email$")
    public void user_memasukkan_no_handphone_yang_tidak_terdaftar_di_kolom_No_Handphone_atau_Email() throws Throwable {
        mainPage.isiIdSignIn(InputSepulsa.wrongPhone);
    }

    @When("^user memasukkan password yang salah di kolom password$")
    public void user_memasukkan_password_yang_salah_di_kolom_password() throws Throwable {
        mainPage.isiPasswordSignIn(InputSepulsa.wrongPassword);
    }

    @When("^user memasukkan no handphone yang terdaftar di kolom No\\. Handphone atau Email$")
    public void user_memasukkan_no_handphone_yang_terdaftar_di_kolom_No_Handphone_atau_Email() throws Throwable {
        mainPage.isiIdSignIn(InputSepulsa.signinPhone);
    }

    @When("^user mengosongkan kolom No\\. Handphone atau Email$")
    public void user_mengosongkan_kolom_No_Handphone_atau_Email() throws Throwable {

    }

    @Then("^akan muncul notifikasi untuk mengisi semua kolom$")
    public void akan_muncul_notifikasi_untuk_mengisi_semua_kolom() throws Throwable {

    }

    @When("^user mengisi kolom No\\. Handphone atau Email$")
    public void user_mengisi_kolom_No_Handphone_atau_Email() throws Throwable {
        mainPage.isiIdSignIn(InputSepulsa.signinPhone);
    }

    @When("^user mengosongkan kolom password$")
    public void user_mengosongkan_kolom_password() throws Throwable {

    }

    @After
    public void closeApp(){
        driver.closeApp();
    }
}
