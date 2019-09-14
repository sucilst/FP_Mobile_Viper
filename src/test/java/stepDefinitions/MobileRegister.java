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
    }

    @Given("^user belum sign in di aplikasi Sepulsa$")
    public void user_belum_sign_in_di_aplikasi_Sepulsa() throws Throwable {

    }

    @When("^user tap tombol Register$")
    public void user_tap_tombol_Register() throws Throwable {
        popUpPage.disableGPSSettings();
        mainPage.klikTabRegister();
    }

    @When("^user memasukkan Nama pada kolom nama di aplikasi mobile Sepulsa$")
    public void user_memasukkan_Nama_pada_kolom_nama_di_aplikasi_mobile_Sepulsa() throws Throwable {
        popUpPage.disableGPSSettings();
        mainPage.isiNamaRegister(InputSepulsa.registerName);
    }

    @When("^user memasukkan Email pada kolom email di aplikasi mobile Sepulsa$")
    public void user_memasukkan_Email_pada_kolom_email_di_aplikasi_mobile_Sepulsa() throws Throwable {
        mainPage.isiEmailRegister(InputSepulsa.registerMail);
    }

    @When("^user memasukkan No Handphone pada kolom no handphone di aplikasi mobile Sepulsa$")
    public void user_memasukkan_No_Handphone_pada_kolom_no_handphone_di_aplikasi_mobile_Sepulsa() throws Throwable {
        mainPage.isiHandphoneRegister(InputSepulsa.registerPhone);
    }

    @When("^user memasukkan Password pada kolom password di aplikasi mobile Sepulsa$")
    public void user_memasukkan_Password_pada_kolom_password_di_aplikasi_mobile_Sepulsa() throws Throwable {
        mainPage.isiPasswordRegister(InputSepulsa.registerPassword);
    }

    @When("^user klik checkbox Syarat dan Ketentuan$")
    public void user_klik_checkbox_Syarat_dan_Ketentuan() throws Throwable {
        mainPage.setujuSyarat();
    }

    @When("^user memasukkan kode OTP$")
    public void user_memasukkan_kode_OTP() throws Throwable {

    }

    @When("^user tap tombol Verifikasi OTP$")
    public void user_tap_tombol_Verifikasi_OTP() throws Throwable {

    }

    @Then("^user diarahkan ke halaman beranda Sepulsa$")
    public void user_diarahkan_ke_halaman_beranda_Sepulsa() throws Throwable {

    }

    @When("^user memasukkan Nama yang sudah terdaftar pada kolom nama di aplikasi mobile Sepulsa$")
    public void user_memasukkan_Nama_yang_sudah_terdaftar_pada_kolom_nama_di_aplikasi_mobile_Sepulsa() throws Throwable {

    }

    @When("^user memasukkan Email yang sudah terdaftar pada kolom email di aplikasi mobile Sepulsa$")
    public void user_memasukkan_Email_yang_sudah_terdaftar_pada_kolom_email_di_aplikasi_mobile_Sepulsa() throws Throwable {

    }

    @When("^user memasukkan No Handphone yang sudah terdaftar pada kolom no handphone di aplikasi mobile Sepulsa$")
    public void user_memasukkan_No_Handphone_yang_sudah_terdaftar_pada_kolom_no_handphone_di_aplikasi_mobile_Sepulsa() throws Throwable {

    }

    @When("^user memasukkan Password yang sudah terdaftar pada kolom password di aplikasi mobile Sepulsa$")
    public void user_memasukkan_Password_yang_sudah_terdaftar_pada_kolom_password_di_aplikasi_mobile_Sepulsa() throws Throwable {

    }

    @Then("^akan muncul notifikasi Email sudah terdaftar$")
    public void akan_muncul_notifikasi_Email_sudah_terdaftar() throws Throwable {

    }

    @When("^user mengosongkan kolom kode OTP$")
    public void user_mengosongkan_kolom_kode_OTP() throws Throwable {

    }

    @Then("^notifikasi untuk mengisi kolom OTP muncul$")
    public void notifikasi_untuk_mengisi_kolom_OTP_muncul() throws Throwable {

    }

    @When("^user tidak klik checkbox Syarat dan Ketentuan$")
    public void user_tidak_klik_checkbox_Syarat_dan_Ketentuan() throws Throwable {

    }

    @Then("^tombol Register akan tetap disabled$")
    public void tombol_Register_akan_tetap_disabled() throws Throwable {

    }

    @When("^user mengosongkan kolom nama di aplikasi mobile Sepulsa$")
    public void user_mengosongkan_kolom_nama_di_aplikasi_mobile_Sepulsa() throws Throwable {

    }

    @Then("^notifikasi untuk mengisi semua field muncul$")
    public void notifikasi_untuk_mengisi_semua_field_muncul() throws Throwable {

    }

    @When("^user memasukkan Nama di kolom nama di aplikasi mobile Sepulsa$")
    public void user_memasukkan_Nama_di_kolom_nama_di_aplikasi_mobile_Sepulsa() throws Throwable {

    }

    @When("^user mengosongkan kolom email di aplikasi mobile Sepulsa$")
    public void user_mengosongkan_kolom_email_di_aplikasi_mobile_Sepulsa() throws Throwable {

    }

    @When("^user mengosongkan kolom no handphone di aplikasi mobile Sepulsa$")
    public void user_mengosongkan_kolom_no_handphone_di_aplikasi_mobile_Sepulsa() throws Throwable {

    }

    @When("^user mengosongkan kolom password di aplikasi mobile Sepulsa$")
    public void user_mengosongkan_kolom_password_di_aplikasi_mobile_Sepulsa() throws Throwable {

    }

    @After
    public void closeApp(){
        driver.closeApp();
    }
}
