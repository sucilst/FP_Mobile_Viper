package stepDefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;
import utils.InputSepulsa;
import utils.ThreadLocalDriver;

public class MobilePulsaCC extends BaseStep {

    AndroidDriver driver;
    @Before
    public void initiate(){
        driver = ThreadLocalDriver.getTLDriver();
    }

    //--------------------------------------------------SCENARIO 1------------------------------------------------------

    @Given("^user telah login di aplikasi mobile Sepulsa \\(pulsa CC\\)$")
    public void user_telah_login_di_aplikasi_mobile_Sepulsa_pulsa_CC() throws Throwable {
        driver.resetApp();
        popUpPage.disableGPS();
        mainPage.klikMulai();
        mainPage.isiIdSignIn(InputSepulsa.registerPhone);
        mainPage.isiPasswordSignIn(InputSepulsa.registerPassword);
        mainPage.submitSignIn();
        createScreenshots.captureScreenShots();
    }

    @Given("^user berada di halaman beranda Sepulsa \\(pulsa CC\\)$")
    public void user_berada_di_halaman_beranda_Sepulsa_pulsa_CC() throws Throwable {
        beranda.sudahDiBeranda();
        createScreenshots.captureScreenShots();
    }

    @When("^user tap tombol Isi Pulsa \\(pulsa CC\\)$")
    public void user_tap_tombol_Isi_Pulsa_pulsa_CC() throws Throwable {
        beranda.menuPulsa();
        createScreenshots.captureScreenShots();
    }

    @When("^user mengetik nomor handphone yang akan diisi pulsanya \\(pulsa CC\\)$")
    public void user_mengetik_nomor_handphone_yang_akan_diisi_pulsanya_pulsa_CC() throws Throwable {
        isiPulsa.isiFieldNoHP(InputSepulsa.no1_success);
        createScreenshots.captureScreenShots();
    }

    @When("^user memilih nominal \"([^\"]*)\" yang akan dibeli \\(pulsa CC\\)$")
    public void user_memilih_nominal_yang_akan_dibeli_pulsa_CC(int pulsa) throws Throwable {
        isiPulsa.pilihNominal(pulsa);
        createScreenshots.captureScreenShots();
    }

    @When("^user melihat harga \"([^\"]*)\" yang harus dibayar \\(pulsa CC\\)$")
    public void user_melihat_harga_yang_harus_dibayar_pulsa_CC(int pulsa) throws Throwable {
        isiPulsa.validateNominal(pulsa);
        createScreenshots.captureScreenShots();
    }

    @When("^user memilih metode pembayaran Credit Card \\(pulsa CC\\)$")
    public void user_memilih_metode_pembayaran_Credit_Card_pulsa_CC() throws Throwable {
        isiPulsa.pilihPembayaranCC();
        createScreenshots.captureScreenShots();
    }

    @When("^user tap pada tombol Bayar \\(pulsa CC\\)$")
    public void user_tap_pada_tombol_Bayar_pulsa_CC() throws Throwable {
        isiPulsa.isiCreditCard();
        isiPulsa.klikTombolBayar();
        createScreenshots.captureScreenShots();
    }

    @When("^user masuk ke halaman Informasi Pembayaran \\(pulsa CC\\)$")
    public void user_masuk_ke_halaman_Informasi_Pembayaran_pulsa_CC() throws Throwable {
        isiPulsa.isiMidtrans();
        createScreenshots.captureScreenShots();
    }

    @When("^user membayar lunas tagihan melalui Credit Card \\(pulsa CC\\)$")
    public void user_membayar_lunas_tagihan_melalui_Credit_Card_pulsa_CC() throws Throwable {
        popUpPage.munculKamuSukaSepulsa();
        popUpPage.munculAutoPay();
        isiPulsa.halamanCC();
        createScreenshots.captureScreenShots();
    }

    @Then("^status pemesanan pulsa pada halaman History berubah menjadi INVOICED \\(pulsa CC\\)$")
    public void status_pemesanan_pulsa_pada_halaman_History_berubah_menjadi_INVOICED_pulsa_CC() throws Throwable {
        isiPulsa.clickDoneButton();
        beranda.sudahDiBeranda();
        beranda.klikMenuHistory();
        history.sudahDiHistory();
        history.cekTransaksiSukses();
        createScreenshots.captureScreenShots();
    }

    //--------------------------------------------------SCENARIO 2------------------------------------------------------

    @When("^user tap tombol Ambil No Handphone dari Phone Book \\(pulsa CC\\)$")
    public void user_tap_tombol_Ambil_No_Handphone_dari_Phone_Book_pulsa_CC() throws Throwable {
        isiPulsa.clickPhoneBook();
        createScreenshots.captureScreenShots();
    }

    @When("^user memilih kontak yang akan diisi pulsanya \\(pulsa CC\\)$")
    public void user_memilih_kontak_yang_akan_diisi_pulsanya_pulsa_CC() throws Throwable {
        isiPulsa.pilihContact();
        createScreenshots.captureScreenShots();
    }

    //--------------------------------------------------SCENARIO 3------------------------------------------------------

    @When("^user memasukkan nomor telepon \"([^\"]*)\" dengan jumlah kurang dari delapan digit \\(pulsa CC\\)$")
    public void user_memasukkan_nomor_telepon_dengan_jumlah_kurang_dari_delapan_digit_pulsa_CC(String no) throws Throwable {
        isiPulsa.isiFieldNoHP(no);
        createScreenshots.captureScreenShots();
    }

    @When("^user memilih nominal pulsa \\(pulsa CC\\)$")
    public void user_memilih_nominal_pulsa_pulsa_CC() throws Throwable {
        isiPulsa.pilihNominal(50);
        createScreenshots.captureScreenShots();
    }

    @Then("^akan muncul notifikasi 'Nomor handphone kurang dari delapan digit' \\(pulsa CC\\)$")
    public void akan_muncul_notifikasi_Nomor_handphone_kurang_dari_delapan_digit_pulsa_CC() throws Throwable {
        isiPulsa.validateToast();
        createScreenshots.captureScreenShots();
    }

    //--------------------------------------------------SCENARIO 4------------------------------------------------------

    @When("^mengisi \"([^\"]*)\" invalid \\(pulsa CC\\)$")
    public void mengisi_field_invalid_pulsa_CC(String field) throws Throwable {
        isiPulsa.isiCreditCardInvalid(field);
        createScreenshots.captureScreenShots();
    }

    @Then("^user tidak dapat melanjutkan ke halaman selanjutnya \\(pulsa CC\\)$")
    public void user_tidak_dapat_melanjutkan_ke_halaman_selanjutnya_pulsa_CC() throws Throwable {
        createScreenshots.captureScreenShots();
    }
}
