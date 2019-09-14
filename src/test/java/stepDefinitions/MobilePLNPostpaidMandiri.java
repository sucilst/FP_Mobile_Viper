package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;
import utils.InputSepulsa;
import utils.ThreadLocalDriver;

public class MobilePLNPostpaidMandiri extends BaseStep {

    AndroidDriver driver;
    @Before
    public void initiate(){
        driver = ThreadLocalDriver.getTLDriver();
    }

    @Given("^user telah login di aplikasi mobile Sepulsa untuk bayar tagihan PLN dengan Mandiri VA$")
    public void user_telah_login_di_aplikasi_mobile_Sepulsa_untuk_bayar_tagihan_PLN_dengan_Mandiri_VA() throws Throwable {
        driver.resetApp();
        popUpPage.disableGPS();
        mainPage.klikMulai();
        mainPage.isiIdSignIn(InputSepulsa.signinPhone);
        mainPage.isiPasswordSignIn(InputSepulsa.signinPassword);
        mainPage.submitSignIn();
    }

    @Given("^user berada di halaman beranda aplikasi mobile Sepulsa untuk bayar tagihan PLN dengan Mandiri VA$")
    public void user_berada_di_halaman_beranda_aplikasi_mobile_Sepulsa_untuk_bayar_tagihan_PLN_dengan_Mandiri_VA() throws Throwable {
        beranda.sudahDiBeranda();
    }

    @When("^user tap tombol Listrik PLN untuk bayar tagihan PLN dengan Mandiri VA$")
    public void user_tap_tombol_Listrik_PLN_untuk_bayar_tagihan_PLN_dengan_Mandiri_VA() throws Throwable {
        beranda.menuPLN();
    }

    @When("^user tap pada pilihan Pascabayar untuk bayar tagihan PLN dengan Mandiri VA$")
    public void user_tap_pada_pilihan_Pascabayar_untuk_bayar_tagihan_PLN_dengan_Mandiri_VA() throws Throwable {
        plnPostpaid.pilihPascabayar();
    }

    @When("^user mengetik nomor meter PLN / ID Pelanggan untuk bayar tagihan PLN dengan Mandiri VA$")
    public void user_mengetik_nomor_meter_PLN_ID_Pelanggan_untuk_bayar_tagihan_PLN_dengan_Mandiri_VA() throws Throwable {
        plnPostpaid.isiIDPel(InputSepulsa.idOKFirst);
    }

    @When("^user mengetik nomor handphone pemilik tagihan listrik yang akan dibayar dengan Mandiri VA$")
    public void user_mengetik_nomor_handphone_pemilik_tagihan_listrik_yang_akan_dibayar_dengan_Mandiri_VA() throws Throwable {
        plnPostpaid.isiNoHP(InputSepulsa.registerPhone);
    }

    @When("^keterangan pelanggan yang akan bayar tagihan PLN dengan Mandiri VA ditampilkan$")
    public void keterangan_pelanggan_yang_akan_bayar_tagihan_PLN_dengan_Mandiri_VA_ditampilkan() throws Throwable {
        plnPostpaid.statusPelangganTampil();
    }

    @When("^user tap tombol Bayar Tagihan untuk bayar tagihan PLN dengan Mandiri VA$")
    public void user_tap_tombol_Bayar_Tagihan_untuk_bayar_tagihan_PLN_dengan_Mandiri_VA() throws Throwable {
        plnPostpaid.keHalamanPembayaran();
    }

    @When("^user memilih metode pembayaran Mandiri Virtual Account untuk bayar tagihan PLN Pascabayar$")
    public void user_memilih_metode_pembayaran_Mandiri_Virtual_Account_untuk_bayar_tagihan_PLN_Pascabayar() throws Throwable {
        plnPostpaid.diHalamanPembayaran();
        plnPostpaid.pilihanMetodeBayar();
        plnPostpaid.pilihBayarMandiri();
    }

    @When("^user tap pada tombol Bayar untuk bayar tagihan PLN dengan Mandiri VA$")
    public void user_tap_pada_tombol_Bayar_untuk_bayar_tagihan_PLN_dengan_Mandiri_VA() throws Throwable {
        plnPostpaid.klikBayar();
    }

    @When("^user masuk ke halaman Informasi Pembayaran Tagihan PLN dengan Mandiri Virtual Account$")
    public void user_masuk_ke_halaman_Informasi_Pembayaran_Tagihan_PLN_dengan_Mandiri_Virtual_Account() throws Throwable {
        popUpPage.disablePopUp();
        plnPostpaid.diHalamanTagihanMandiri();
    }

    @When("^user membayar lunas tagihan PLN Pascabayar melalui Mandiri Virtual Account$")
    public void user_membayar_lunas_tagihan_PLN_Pascabayar_melalui_Mandiri_Virtual_Account() throws Throwable {

    }

    @Then("^status pemesanan PLN Pascabayar dengan Mandiri VA pada halaman History berubah menjadi \"([^\"]*)\"$")
    public void status_pemesanan_PLN_Pascabayar_dengan_Mandiri_VA_pada_halaman_History_berubah_menjadi(String arg1) throws Throwable {

    }

    @Then("^bukti pembayaran PLN Pascabayar dengan Mandiri VA diterima di email pelanggan$")
    public void bukti_pembayaran_PLN_Pascabayar_dengan_Mandiri_VA_diterima_di_email_pelanggan() throws Throwable {

    }

    @When("^keterangan pelanggan ditampilkan untuk bayar tagihan PLN dengan Mandiri VA$")
    public void keterangan_pelanggan_ditampilkan_untuk_bayar_tagihan_PLN_dengan_Mandiri_VA() throws Throwable {

    }

    @When("^user belum membayar tagihan PLN Pascabayar dengan Mandiri VA hingga lebih dari batas waktu pembayaran$")
    public void user_belum_membayar_tagihan_PLN_Pascabayar_dengan_Mandiri_VA_hingga_lebih_dari_batas_waktu_pembayaran() throws Throwable {

    }

    @Then("^email transaksi PLN Pascabayar dengan Mandiri VA dibatalkan karena kadaluarsa akan masuk ke email pelanggan$")
    public void email_transaksi_PLN_Pascabayar_dengan_Mandiri_VA_dibatalkan_karena_kadaluarsa_akan_masuk_ke_email_pelanggan() throws Throwable {

    }

    @Then("^transaksi PLN Pascabayar dengan Mandiri VA terhapus dari History Transaksi di aplikasi mobile Sepulsa$")
    public void transaksi_PLN_Pascabayar_dengan_Mandiri_VA_terhapus_dari_History_Transaksi_di_aplikasi_mobile_Sepulsa() throws Throwable {

    }

    @When("^user mengetik nomor meter PLN / ID Pelanggan Pascabayar yang tidak valid untuk dibayar dengan Mandiri VA$")
    public void user_mengetik_nomor_meter_PLN_ID_Pelanggan_Pascabayar_yang_tidak_valid_untuk_dibayar_dengan_Mandiri_VA() throws Throwable {
        plnPostpaid.isiIDPel(InputSepulsa.idError);
    }

    @Then("^muncul notifikasi \"([^\"]*)\" sehingga tidak bisa bayar dengan Mandiri VA$")
    public void muncul_notifikasi_sehingga_tidak_bisa_bayar_dengan_Mandiri_VA(String arg1) throws Throwable {
        plnPostpaid.statusGagalTampil();
    }

    @When("^user mengetik nomor meter PLN / ID Pelanggan Pascabayar yang sudah lunas \\(Mandiri VA\\)$")
    public void user_mengetik_nomor_meter_PLN_ID_Pelanggan_Pascabayar_yang_sudah_lunas_Mandiri_VA() throws Throwable {
        plnPostpaid.isiIDPel(InputSepulsa.idPaid);
    }

    @Then("^muncul notifikasi \"([^\"]*)\" karena tagihan sudah dibayar sehingga tidak bisa bayar dengan Mandiri VA$")
    public void muncul_notifikasi_karena_tagihan_sudah_dibayar_sehingga_tidak_bisa_bayar_dengan_Mandiri_VA(String arg1) throws Throwable {
        plnPostpaid.statusGagalTampil();
    }

    @After
    public void closeApp(){
        driver.closeApp();
    }

}
