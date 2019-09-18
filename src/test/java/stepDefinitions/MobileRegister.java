package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;
import utils.InputSepulsa;
import utils.ThreadLocalDriver;

public class MobileRegister extends BaseStep {

    AndroidDriver driver;
    @Before
    public void initiate(){
        driver = ThreadLocalDriver.getTLDriver();
    }
    @Given("^user mengaktifkan aplikasi mobile Sepulsa$")
    public void user_mengaktifkan_aplikasi_mobile_Sepulsa() throws Throwable {
        driver.resetApp();
        popUpPage.disableGPS();
        mainPage.klikMulai();
        createScreenshots.captureScreenShots();
    }

    @When("^user tap tombol Register untuk memiliki akun Sepulsa \\(Mobile\\)$")
    public void user_tap_tombol_Register_untuk_memiliki_akun_Sepulsa_Mobile() throws Throwable {
        mainPage.klikTabRegister();
        popUpPage.disableGPSSettings();
        createScreenshots.captureScreenShots();
    }

    @When("^user mengosongkan kolom nama \\(Register\\) di aplikasi mobile Sepulsa$")
    public void user_mengosongkan_kolom_nama_Register_di_aplikasi_mobile_Sepulsa() throws Throwable {
        mainPage.kosongNamaRegister();
        createScreenshots.captureScreenShots();
    }

    @When("^user mengosongkan kolom No Handphone \\(Register\\) pada kolom no handphone di aplikasi mobile Sepulsa$")
    public void user_mengosongkan_kolom_No_Handphone_Register_pada_kolom_no_handphone_di_aplikasi_mobile_Sepulsa() throws Throwable {
        mainPage.kosongHandphoneRegister();
        createScreenshots.captureScreenShots();
    }

    @When("^user mengosongkan kolom Email \\(Register\\) pada kolom email di aplikasi mobile Sepulsa$")
    public void user_mengosongkan_kolom_Email_Register_pada_kolom_email_di_aplikasi_mobile_Sepulsa() throws Throwable {
        mainPage.kosongEmailRegister();
        createScreenshots.captureScreenShots();
    }

    @When("^user mengosongkan kolom Password \\(Register\\) pada kolom password di aplikasi mobile Sepulsa$")
    public void user_mengosongkan_kolom_Password_Register_pada_kolom_password_di_aplikasi_mobile_Sepulsa() throws Throwable {
        mainPage.kosongPasswordRegister();
        createScreenshots.captureScreenShots();
    }

    @When("^user tidak klik checkbox Syarat dan Ketentuan \\(Mobile\\)$")
    public void user_tidak_klik_checkbox_Syarat_dan_Ketentuan_Mobile() throws Throwable {
        mainPage.checkboxSyaratTidakDiklik();
        createScreenshots.captureScreenShots();
    }

    @Then("^tombol Register akan tetap disable \\(Mobile\\)$")
    public void tombol_Register_akan_tetap_disable_Mobile() throws Throwable {
        mainPage.tombolRegisterDisabled();
        createScreenshots.captureScreenShots();
    }

    @When("^user memasukkan No Handphone pada kolom no handphone di aplikasi mobile Sepulsa$")
    public void user_memasukkan_No_Handphone_pada_kolom_no_handphone_di_aplikasi_mobile_Sepulsa() throws Throwable {
        mainPage.isiHandphoneRegister(InputSepulsa.registerPhone);
        createScreenshots.captureScreenShots();
    }

    @When("^user memasukkan Email pada kolom email di aplikasi mobile Sepulsa$")
    public void user_memasukkan_Email_pada_kolom_email_di_aplikasi_mobile_Sepulsa() throws Throwable {
        mainPage.isiEmailRegister(InputSepulsa.registerMail);
        createScreenshots.captureScreenShots();
    }

    @When("^user memasukkan Password pada kolom password di aplikasi mobile Sepulsa$")
    public void user_memasukkan_Password_pada_kolom_password_di_aplikasi_mobile_Sepulsa() throws Throwable {
        mainPage.isiPasswordRegister(InputSepulsa.registerPassword);
        createScreenshots.captureScreenShots();
    }

    @When("^user klik checkbox Syarat dan Ketentuan di Sepulsa Mobile$")
    public void user_klik_checkbox_Syarat_dan_Ketentuan_di_Sepulsa_Mobile() throws Throwable {
        mainPage.setujuSyarat();
        createScreenshots.captureScreenShots();
    }

    @When("^user tap tombol Register pada Sepulsa Mobile$")
    public void user_tap_tombol_Register_pada_Sepulsa_Mobile() throws Throwable {
        mainPage.submitRegister();
        createScreenshots.captureScreenShots();
    }

    @Then("^akan muncul notifikasi untuk mengisi semua kolom register \\(Mobile\\)$")
    public void akan_muncul_notifikasi_untuk_mengisi_semua_kolom_register_Mobile() throws Throwable {
        mainPage.dataHarusDiisi();
        createScreenshots.captureScreenShots();
    }

    @When("^user memasukkan Nama pada kolom nama di aplikasi mobile Sepulsa$")
    public void user_memasukkan_Nama_pada_kolom_nama_di_aplikasi_mobile_Sepulsa() throws Throwable {
        mainPage.isiNamaRegister(InputSepulsa.registerName);
        createScreenshots.captureScreenShots();
    }

    @When("^user memasukkan \"([^\"]*)\" yang invalid pada kolom no handphone di aplikasi mobile Sepulsa$")
    public void user_memasukkan_yang_invalid_pada_kolom_no_handphone_di_aplikasi_mobile_Sepulsa(String handphone) throws Throwable {
        mainPage.isiHandphoneRegister(handphone);
        createScreenshots.captureScreenShots();
    }

    @Then("^akan muncul notifikasi bahwa format no handphone untuk register invalid \\(Mobile\\)$")
    public void akan_muncul_notifikasi_bahwa_format_no_handphone_untuk_register_invalid_Mobile() throws Throwable {
        popUpPage.noHandphoneInvalid();
        createScreenshots.captureScreenShots();
    }

    @When("^user memasukkan \"([^\"]*)\" yang invalid pada kolom email di aplikasi mobile Sepulsa$")
    public void user_memasukkan_yang_invalid_pada_kolom_email_di_aplikasi_mobile_Sepulsa(String email) throws Throwable {
        mainPage.isiEmailRegister(email);
        createScreenshots.captureScreenShots();
    }

    @Then("^akan muncul notifikasi bahwa format email untuk register invalid \\(Mobile\\)$")
    public void akan_muncul_notifikasi_bahwa_format_email_untuk_register_invalid_Mobile() throws Throwable {
        popUpPage.emailInvalid();
        createScreenshots.captureScreenShots();
    }

    @When("^user memasukkan kode OTP di Sepulsa Mobile$")
    public void user_memasukkan_kode_OTP_di_Sepulsa_Mobile() throws Throwable {
        mainPage.masukkanKodeOTP();
        createScreenshots.captureScreenShots();
    }

    @When("^user tap tombol Verifikasi OTP di Sepulsa Mobile$")
    public void user_tap_tombol_Verifikasi_OTP_di_Sepulsa_Mobile() throws Throwable {
        mainPage.submitOTP();
        createScreenshots.captureScreenShots();
    }

    @Then("^user diarahkan ke halaman beranda Sepulsa Mobile$")
    public void user_diarahkan_ke_halaman_beranda_Sepulsa_Mobile() throws Throwable {
        beranda.sudahDiBeranda();
        createScreenshots.captureScreenShots();
    }

    @When("^user memasukkan Nama pada kolom nama di aplikasi mobile Sepulsa \\(sudah register\\)$")
    public void user_memasukkan_Nama_pada_kolom_nama_di_aplikasi_mobile_Sepulsa_sudah_register() throws Throwable {
        mainPage.isiNamaRegister(InputSepulsa.registerName);
        createScreenshots.captureScreenShots();
    }

    @When("^user memasukkan No Handphone pada kolom no handphone di aplikasi mobile Sepulsa \\(sudah register\\)$")
    public void user_memasukkan_No_Handphone_pada_kolom_no_handphone_di_aplikasi_mobile_Sepulsa_sudah_register() throws Throwable {
        mainPage.isiHandphoneRegister(InputSepulsa.registerPhone);
        createScreenshots.captureScreenShots();
    }

    @When("^user memasukkan Email pada kolom email di aplikasi mobile Sepulsa \\(sudah register\\)$")
    public void user_memasukkan_Email_pada_kolom_email_di_aplikasi_mobile_Sepulsa_sudah_register() throws Throwable {
        mainPage.isiEmailRegister(InputSepulsa.registerMail);
        createScreenshots.captureScreenShots();
    }

    @When("^user memasukkan Password pada kolom password di aplikasi mobile Sepulsa \\(sudah register\\)$")
    public void user_memasukkan_Password_pada_kolom_password_di_aplikasi_mobile_Sepulsa_sudah_register() throws Throwable {
        mainPage.isiPasswordRegister(InputSepulsa.registerPassword);
        createScreenshots.captureScreenShots();
    }

    @Then("^akan muncul notifikasi bahwa akun sudah terdaftar \\(mobile\\)$")
    public void akan_muncul_notifikasi_bahwa_akun_sudah_terdaftar_mobile() throws Throwable {
        popUpPage.sudahTerdaftar();
        createScreenshots.captureScreenShots();
    }

    @After
    public void closeApp(){
        driver.closeApp();
    }
}
