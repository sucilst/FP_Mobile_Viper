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
    public void initiate() {
        driver = ThreadLocalDriver.getTLDriver();
    }

    @Given("^user membuka aplikasi Sepulsa untuk sign in$")
    public void user_membuka_aplikasi_Sepulsa_untuk_sign_in() throws Throwable {
        driver.resetApp();
        popUpPage.disableGPS();
        mainPage.klikMulai();
        createScreenshots.captureScreenShots();
    }

    @When("^user memilih tab SIGN IN \\(mobile sign in\\)$")
    public void user_memilih_tab_SIGN_IN_mobile_sign_in() throws Throwable {
        mainPage.klikTabSignIn();
        createScreenshots.captureScreenShots();
    }

    @When("^user memasukkan email yang terdaftar di kolom No\\. Handphone atau Email \\(mobile sign in\\)$")
    public void user_memasukkan_email_yang_terdaftar_di_kolom_No_Handphone_atau_Email_mobile_sign_in() throws Throwable {
        mainPage.isiIdSignIn(InputSepulsa.registerMail);
        createScreenshots.captureScreenShots();
    }

    @When("^user memasukkan password di kolom password \\(mobile sign in\\)$")
    public void user_memasukkan_password_di_kolom_password_mobile_sign_in() throws Throwable {
        mainPage.isiPasswordSignIn(InputSepulsa.registerPassword);
        createScreenshots.captureScreenShots();
    }

    @When("^user melakukan tap pada tombol Sign In \\(mobile sign in\\)$")
    public void user_melakukan_tap_pada_tombol_Sign_In_mobile_sign_in() throws Throwable {
        mainPage.submitSignIn();
        createScreenshots.captureScreenShots();
    }

    @Then("^user masuk ke halaman beranda aplikasi Sepulsa \\(mobile sign in\\)$")
    public void user_masuk_ke_halaman_beranda_aplikasi_Sepulsa_mobile_sign_in() throws Throwable {
        beranda.sudahDiBeranda();
        createScreenshots.captureScreenShots();
    }

    @When("^user memasukkan no handphone yang terdaftar di kolom No\\. Handphone atau Email \\(mobile sign in\\)$")
    public void user_memasukkan_no_handphone_yang_terdaftar_di_kolom_No_Handphone_atau_Email_mobile_sign_in() throws Throwable {
        mainPage.isiIdSignIn(InputSepulsa.registerPhone);
        createScreenshots.captureScreenShots();
    }

    @When("^user memasukkan \"([^\"]*)\" yang merupakan format input tidak valid di kolom No\\. Handphone atau Email \\(mobile sign in\\)$")
    public void user_memasukkan_yang_merupakan_format_input_tidak_valid_di_kolom_No_Handphone_atau_Email_mobile_sign_in(String username) throws Throwable {
        mainPage.isiIdSignIn(username);
        createScreenshots.captureScreenShots();
    }

    @Then("^akan muncul notifikasi bahwa input email atau password salah \\(Mobile\\)$")
    public void akan_muncul_notifikasi_bahwa_input_email_atau_password_salah_Mobile() throws Throwable {
        popUpPage.inputSalah();
        createScreenshots.captureScreenShots();
    }

    @When("^user memasukkan email yang tidak terdaftar di kolom No\\. Handphone atau Email \\(mobile sign in\\)$")
    public void user_memasukkan_email_yang_tidak_terdaftar_di_kolom_No_Handphone_atau_Email_mobile_sign_in() throws Throwable {
        mainPage.isiIdSignIn(InputSepulsa.emptyEmail);
        createScreenshots.captureScreenShots();
    }

    @Then("^user akan dialihkan ke halaman Masukkan Kode OTP \\(mobile sign in\\)$")
    public void user_akan_dialihkan_ke_halaman_Masukkan_Kode_OTP_mobile_sign_in() throws Throwable {
        mainPage.diHalamanOTP();
        createScreenshots.captureScreenShots();
    }

    @When("^user memasukkan no handphone yang tidak terdaftar di kolom No\\. Handphone atau Email \\(mobile sign in\\)$")
    public void user_memasukkan_no_handphone_yang_tidak_terdaftar_di_kolom_No_Handphone_atau_Email_mobile_sign_in() throws Throwable {
        mainPage.isiIdSignIn(InputSepulsa.emptyNumber);
        createScreenshots.captureScreenShots();
    }

    @When("^user memasukkan password yang salah di kolom password \\(mobile sign in\\)$")
    public void user_memasukkan_password_yang_salah_di_kolom_password_mobile_sign_in() throws Throwable {
        mainPage.isiPasswordSignIn(InputSepulsa.passRaka);
        createScreenshots.captureScreenShots();
    }

    @When("^user mengosongkan kolom No\\. Handphone atau Email$")
    public void user_mengosongkan_kolom_No_Handphone_atau_Email() throws Throwable {
        mainPage.kolomEmailSignInKosong();
        createScreenshots.captureScreenShots();
    }

    @When("^user memasukkan password di kolom password$")
    public void user_memasukkan_password_di_kolom_password() throws Throwable {
        mainPage.isiPasswordSignIn(InputSepulsa.registerPassword);
        createScreenshots.captureScreenShots();
    }

    @When("^user melakukan tap pada tombol Sign In$")
    public void user_melakukan_tap_pada_tombol_Sign_In() throws Throwable {
        mainPage.submitSignIn();
        createScreenshots.captureScreenShots();
    }

    @Then("^akan muncul notifikasi untuk mengisi semua kolom \\(Sign In Mobile\\)$")
    public void akan_muncul_notifikasi_untuk_mengisi_semua_kolom_Sign_In_Mobile() throws Throwable {
        mainPage.signinHarusLengkap();
        createScreenshots.captureScreenShots();
    }


    @When("^user mengosongkan kolom password$")
    public void user_mengosongkan_kolom_password() throws Throwable {
        mainPage.kolomPasswordSignInKosong();
        createScreenshots.captureScreenShots();
    }

    @Then("^akan muncul notifikasi bahwa akun diblok$")
    public void akan_muncul_notifikasi_bahwa_akun_diblok() throws Throwable {
        popUpPage.akunError();
        createScreenshots.captureScreenShots();
    }

    @When("^user mengisi kolom No\\. Handphone atau Email$")
    public void user_mengisi_kolom_No_Handphone_atau_Email() throws Throwable {
        mainPage.isiIdSignIn(InputSepulsa.registerPhone);
        createScreenshots.captureScreenShots();
    }


    @After
    public void closeApp() {
        driver.closeApp();
    }
}
