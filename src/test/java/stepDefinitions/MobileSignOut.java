package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;
import utils.InputSepulsa;
import utils.ThreadLocalDriver;

public class MobileSignOut extends BaseStep {

    AndroidDriver driver;
    @Before
    public void initiate(){
        driver = ThreadLocalDriver.getTLDriver();
    }

    @Given("^user sudah sign in di aplikasi Sepulsa$")
    public void user_sudah_sign_in_di_aplikasi_Sepulsa() throws Throwable {
        driver.resetApp();
        popUpPage.disableGPS();
        mainPage.klikMulai();
        mainPage.isiIdSignIn(InputSepulsa.signinPhone);
        mainPage.isiPasswordSignIn(InputSepulsa.signinPassword);
        mainPage.submitSignIn();
    }

    @Given("^user berada di dalam aplikasi Sepulsa$")
    public void user_berada_di_dalam_aplikasi_Sepulsa() throws Throwable {
        beranda.sudahDiBeranda();
    }

    @When("^user tap tombol menu$")
    public void user_tap_tombol_menu() throws Throwable {
        beranda.pilihUserMenu();
    }

    @When("^user tap tombol Sign out$")
    public void user_tap_tombol_Sign_out() throws Throwable {
        beranda.pilihSignOut();
    }

    @Then("^user keluar dari akun Sepulsa$")
    public void user_keluar_dari_akun_Sepulsa() throws Throwable {
        mainPage.keluarDariAplikasi();
    }

    @Then("^user masuk ke halaman utama aplikasi Sepulsa$")
    public void user_masuk_ke_halaman_utama_aplikasi_Sepulsa() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @After
    public void closeApp(){
        driver.closeApp();
    }

}
