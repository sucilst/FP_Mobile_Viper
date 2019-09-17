package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utils.InputSepulsa;
import utils.ThreadLocalDriver;

import java.io.File;

public class MobileSignOut extends BaseStep {

    AndroidDriver driver;
    @Before
    public void initiate(){
        driver = ThreadLocalDriver.getTLDriver();
    }

    @Given("^user sudah sign in di aplikasi mobile Sepulsa$")
    public void user_sudah_sign_in_di_aplikasi_mobile_Sepulsa() throws Throwable {
        driver.resetApp();
        popUpPage.disableGPS();
        mainPage.klikMulai();
        mainPage.isiIdSignIn(InputSepulsa.signinPhone);
        mainPage.isiPasswordSignIn(InputSepulsa.signinPassword);
        mainPage.submitSignIn();

        createScreenshots.captureScreenShots();
    }

    @Given("^user berada di dalam aplikasi mobile Sepulsa$")
    public void user_berada_di_dalam_aplikasi_mobile_Sepulsa() throws Throwable {
        beranda.sudahDiBeranda();
        createScreenshots.captureScreenShots();
    }

    @When("^user tap tombol menu pada aplikasi mobile Sepulsa$")
    public void user_tap_tombol_menu_pada_aplikasi_mobile_Sepulsa() throws Throwable {
        beranda.klikMenuAdmin();
        beranda.pilihUserMenu();
        createScreenshots.captureScreenShots();
    }

    @When("^user tap tombol Sign out untuk keluar dari aplikasi mobile Sepulsa$")
    public void user_tap_tombol_Sign_out_untuk_keluar_dari_aplikasi_mobile_Sepulsa() throws Throwable {
        beranda.pilihSignOut();
        createScreenshots.captureScreenShots();
    }

    @Then("^user keluar dari akun mobile Sepulsa$")
    public void user_keluar_dari_akun_mobile_Sepulsa() throws Throwable {
        mainPage.keluarDariAplikasi();
        createScreenshots.captureScreenShots();
    }

    @Then("^user masuk ke halaman utama aplikasi mobile Sepulsa$")
    public void user_masuk_ke_halaman_utama_aplikasi_mobile_Sepulsa() throws Throwable {
        mainPage.diHalamanUtama();
        createScreenshots.captureScreenShots();
    }

    @After
    public void closeApp(){
        driver.closeApp();
    }

}
