package stepDefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;
import utils.InputSepulsa;
import utils.ThreadLocalDriver;

public class MobilePulsaSepulsaKredit extends BaseStep {

    AndroidDriver driver;
    @Before
    public void initiate(){
        driver = ThreadLocalDriver.getTLDriver();
    }

    //--------------------------------------------------SCENARIO 1------------------------------------------------------

    @Given("^user telah login di aplikasi mobile Sepulsa \\(pulsa SK\\)$")
    public void user_telah_login_di_aplikasi_mobile_Sepulsa_pulsa_SK() throws Throwable {
        driver.resetApp();
        mainPage.klikMulai();
        mainPage.isiIdSignIn(InputSepulsa.noRaka);
        mainPage.isiPasswordSignIn(InputSepulsa.passRaka);
        mainPage.submitSignIn();
    }

    @Given("^user berada di halaman beranda Sepulsa \\(pulsa SK\\)$")
    public void user_berada_di_halaman_beranda_Sepulsa_pulsa_SK() throws Throwable {
        beranda.sudahDiBeranda();
    }

    @When("^user tap tombol Isi Pulsa \\(pulsa SK\\)$")
    public void user_tap_tombol_Isi_Pulsa_pulsa_SK() throws Throwable {
        beranda.menuPulsa();
    }

    @When("^user mengetik nomor handphone yang akan diisi pulsanya \\(pulsa SK\\)$")
    public void user_mengetik_nomor_handphone_yang_akan_diisi_pulsanya_pulsa_SK() throws Throwable {
        isiPulsa.isiFieldNoHP(InputSepulsa.no1_success);
    }

    @When("^user memilih nominal \"([^\"]*)\" yang akan dibeli \\(pulsa SK\\)$")
    public void user_memilih_nominal_yang_akan_dibeli_pulsa_SK(int pulsa) throws Throwable {
        isiPulsa.pilihNominal(pulsa);
    }

    @When("^user melihat harga \"([^\"]*)\" yang harus dibayar \\(pulsa SK\\)$")
    public void user_melihat_harga_yang_harus_dibayar_pulsa_SK(int pulsa) throws Throwable {
        isiPulsa.validateNominal(pulsa);
    }

    @When("^user memilih metode pembayaran Sepulsa Kredit \\(pulsa SK\\)$")
    public void user_memilih_metode_pembayaran_Sepulsa_Kredit_pulsa_SK() throws Throwable {
        isiPulsa.halamanSepulsaKredit();
    }

    @When("^user tap pada tombol Bayar \\(pulsa SK\\)$")
    public void user_tap_pada_tombol_Bayar_pulsa_SK() throws Throwable {
        isiPulsa.klikTombolBayar();
    }

    @When("^user masuk ke halaman Informasi Pembayaran \\(pulsa SK\\)$")
    public void user_masuk_ke_halaman_Informasi_Pembayaran_pulsa_SK() throws Throwable {
        popUpPage.munculKamuSukaSepulsa();
        popUpPage.munculAutoPay();
        isiPulsa.halamanSepulsaKredit();
    }

    @When("^user membayar lunas tagihan melalui Sepulsa Kredit \\(pulsa SK\\)$")
    public void user_membayar_lunas_tagihan_melalui_Sepulsa_Kredit_pulsa_SK() throws Throwable {
        isiPulsa.clickDoneButton();
        beranda.sudahDiBeranda();
    }

    @Then("^status pemesanan pulsa pada halaman History berubah menjadi INVOICED \\(pulsa SK\\)$")
    public void status_pemesanan_pulsa_pada_halaman_History_berubah_menjadi_INVOICED_pulsa_SK() throws Throwable {

    }

    //--------------------------------------------------SCENARIO 2------------------------------------------------------

    @When("^user tap tombol Ambil No Handphone dari Phone Book \\(pulsa SK\\)$")
    public void user_tap_tombol_Ambil_No_Handphone_dari_Phone_Book_pulsa_SK() throws Throwable {
        isiPulsa.clickPhoneBook();
    }

    @When("^user memilih kontak yang akan diisi pulsanya \\(pulsa SK\\)$")
    public void user_memilih_kontak_yang_akan_diisi_pulsanya_pulsa_SK() throws Throwable {
        isiPulsa.pilihContact();
    }

    //--------------------------------------------------SCENARIO 3------------------------------------------------------

    @When("^user memasukkan nomor telepon \"([^\"]*)\" dengan jumlah kurang dari delapan digit \\(pulsa SK\\)$")
    public void user_memasukkan_nomor_telepon_dengan_jumlah_kurang_dari_delapan_digit_pulsa_SK(String no) throws Throwable {
        isiPulsa.isiFieldNoHP(no);
    }

    @When("^user memilih nominal pulsa \\(pulsa SK\\)$")
    public void user_memilih_nominal_pulsa_pulsa_SK() throws Throwable {
        isiPulsa.pilihNominal(50);
    }

    @Then("^akan muncul notifikasi 'Nomor handphone kurang dari delapan digit' \\(pulsa SK\\)$")
    public void akan_muncul_notifikasi_Nomor_handphone_kurang_dari_delapan_digit_pulsa_SK() throws Throwable {
        isiPulsa.validateToast();
    }

    //--------------------------------------------------SCENARIO 4------------------------------------------------------

    @When("^user memilih metode pembayaran Sepulsa Kredit dan \"([^\"]*)\" lainnya untuk membayar sisanya \\(pulsa SK\\)$")
    public void user_memilih_metode_pembayaran_Sepulsa_Kredit_dan_lainnya_untuk_membayar_sisanya_pulsa_SK(String pembayaran) {
        isiPulsa.halamanSepulsaKredit();
        isiPulsa.pilihPembayaranSisa(pembayaran);
    }

    @When("^user masuk ke halaman Informasi \"([^\"]*)\" \\(pulsa SK\\)$")
    public void user_masuk_ke_halaman_Informasi_Pembayaran_pulsa_SK(String pembayaran) throws Throwable {
        popUpPage.munculKamuSukaSepulsa();
        popUpPage.munculAutoPay();
        isiPulsa.halamanSisa(pembayaran);
    }

    @When("^user membayar lunas tagihan melalui pembayaran \\(pulsa SK\\)$")
    public void user_membayar_lunas_tagihan_melalui_pulsa_SK() {
        isiPulsa.clickDoneButton();
        beranda.sudahDiBeranda();
    }

    //--------------------------------------------------SCENARIO 5------------------------------------------------------

    @Then("^user tidak melihat metode pembayaran Sepulsa Kredit \\(pulsa SK\\)$")
    public void user_tidak_melihat_metode_pembayaran_Sepulsa_Kredit() throws Throwable {
        isiPulsa.validateTidakAdaSK();
    }

}
