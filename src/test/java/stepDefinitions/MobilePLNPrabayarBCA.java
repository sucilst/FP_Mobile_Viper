package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;
import utils.InputSepulsa;
import utils.ThreadLocalDriver;

public class MobilePLNPrabayarBCA extends BaseStep {

    AndroidDriver driver;
    @Before
    public void initiate(){
        driver = ThreadLocalDriver.getTLDriver();
    }

    @Given("^user telah login di aplikasi mobile Sepulsa$")
    public void user_telah_login_di_aplikasi_mobile_Sepulsa() throws Throwable {
        driver.resetApp();
        popUpPage.disableGPS();
        mainPage.klikMulai();
        mainPage.isiIdSignIn(InputSepulsa.signinPhone);
        mainPage.isiPasswordSignIn(InputSepulsa.signinPassword);
        mainPage.submitSignIn();
    }

    @Given("^user berada di halaman beranda aplikasi mobile Sepulsa$")
    public void user_berada_di_halaman_beranda_aplikasi_mobile_Sepulsa() throws Throwable {
        beranda.sudahDiBeranda();
    }

    @When("^user tap tombol Listrik PLN$")
    public void user_tap_tombol_Listrik_PLN() throws Throwable {
        beranda.menuPLN();
    }

    @When("^user mengetik nomor meter PLN / ID Pelanggan$")
    public void user_mengetik_nomor_meter_PLN_ID_Pelanggan() throws Throwable {
        plnPrepaid.isiIDPel(InputSepulsa.tokenOKFirst);
    }

    @When("^user mengetik nomor handphone penerima token listrik$")
    public void user_mengetik_nomor_handphone_penerima_token_listrik() throws Throwable {
        plnPrepaid.isiNoHP(InputSepulsa.registerPhone);
    }

    @When("^keterangan pelanggan ditampilkan$")
    public void keterangan_pelanggan_ditampilkan() throws Throwable {
        plnPrepaid.statusPelangganTampil();
    }

    @When("^user memilih nominal token listrik$")
    public void user_memilih_nominal_token_listrik() throws Throwable {
        plnPrepaid.idPelangganMuncul();
        plnPrepaid.beliToken100k();
    }

    @When("^user memilih metode pembayaran BCA Virtual Account$")
    public void user_memilih_metode_pembayaran_BCA_Virtual_Account() throws Throwable {
        plnPrepaid.pilihanMetodeBayar();
        plnPrepaid.pilihBayarBCA();
    }

    @When("^user tap pada tombol Bayar$")
    public void user_tap_pada_tombol_Bayar() throws Throwable {
        plnPrepaid.klikBayarBCA();
    }

    @When("^user masuk ke halaman Informasi Pembayaran$")
    public void user_masuk_ke_halaman_Informasi_Pembayaran() throws Throwable {
        popUpPage.disablePopUp();
        plnPrepaid.diHalamanTagihan();
    }

    @When("^user membayar lunas tagihan melalui BCA Virtual Account$")
    public void user_membayar_lunas_tagihan_melalui_BCA_Virtual_Account() throws Throwable {

    }

    @When("^user mengetik nomor meter PLN / ID Pelanggan yang tidak valid$")
    public void user_mengetik_nomor_meter_PLN_ID_Pelanggan_yang_tidak_valid() throws Throwable {
        plnPrepaid.isiIDPel(InputSepulsa.tokenFail);
    }

    @Then("^muncul notifikasi \"([^\"]*)\"$")
    public void muncul_notifikasi(String arg1) throws Throwable {
        plnPrepaid.statusGagalTampil();
    }
    @Then("^status pemesanan pulsa pada halaman History berubah menjadi \"([^\"]*)\"$")
    public void status_pemesanan_pulsa_pada_halaman_History_berubah_menjadi(String arg1) throws Throwable {

    }

    @Then("^kode token diterima di nomor handphone yang telah didaftarkan$")
    public void kode_token_diterima_di_nomor_handphone_yang_telah_didaftarkan() throws Throwable {

    }

    @After
    public void closeApp(){
        driver.closeApp();
    }

}
