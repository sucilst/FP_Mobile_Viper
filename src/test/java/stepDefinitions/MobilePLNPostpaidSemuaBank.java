package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;
import utils.InputSepulsa;
import utils.ThreadLocalDriver;

public class MobilePLNPostpaidSemuaBank extends BaseStep {

    AndroidDriver driver;
    @Before
    public void initiate(){
        driver = ThreadLocalDriver.getTLDriver();
    }

    @Given("^user telah login di aplikasi mobile Sepulsa untuk bayar tagihan PLN dengan VA Semua Bank$")
    public void user_telah_login_di_aplikasi_mobile_Sepulsa_untuk_bayar_tagihan_PLN_dengan_VA_Semua_Bank() throws Throwable {
        driver.resetApp();
        popUpPage.disableGPS();
        mainPage.klikMulai();
        mainPage.isiIdSignIn(InputSepulsa.signinPhone);
        mainPage.isiPasswordSignIn(InputSepulsa.signinPassword);
        mainPage.submitSignIn();
    }

    @Given("^user berada di halaman beranda aplikasi mobile Sepulsa untuk bayar tagihan PLN dengan VA Semua Bank$")
    public void user_berada_di_halaman_beranda_aplikasi_mobile_Sepulsa_untuk_bayar_tagihan_PLN_dengan_VA_Semua_Bank() throws Throwable {
        beranda.sudahDiBeranda();
    }

    @When("^user tap tombol Listrik PLN untuk bayar tagihan PLN dengan VA Semua Bank$")
    public void user_tap_tombol_Listrik_PLN_untuk_bayar_tagihan_PLN_dengan_VA_Semua_Bank() throws Throwable {
        beranda.menuPLN();
    }

    @When("^user tap pada pilihan Pascabayar untuk bayar tagihan PLN dengan VA Semua Bank$")
    public void user_tap_pada_pilihan_Pascabayar_untuk_bayar_tagihan_PLN_dengan_VA_Semua_Bank() throws Throwable {
        plnPostpaid.pilihPascabayar();
    }

    @When("^user mengetik nomor meter PLN / ID Pelanggan untuk bayar tagihan PLN dengan VA Semua Bank$")
    public void user_mengetik_nomor_meter_PLN_ID_Pelanggan_untuk_bayar_tagihan_PLN_dengan_VA_Semua_Bank() throws Throwable {
        plnPostpaid.isiIDPel(InputSepulsa.idOKFirst);
    }

    @When("^user mengetik nomor handphone pemilik tagihan listrik yang akan dibayar dengan VA Semua Bank$")
    public void user_mengetik_nomor_handphone_pemilik_tagihan_listrik_yang_akan_dibayar_dengan_VA_Semua_Bank() throws Throwable {
        plnPostpaid.isiNoHP(InputSepulsa.registerPhone);
    }

    @When("^keterangan pelanggan ditampilkan untuk bayar tagihan PLN dengan VA Semua Bank$")
    public void keterangan_pelanggan_ditampilkan_untuk_bayar_tagihan_PLN_dengan_VA_Semua_Bank() throws Throwable {
        plnPostpaid.statusPelangganTampil();
    }

    @When("^user tap tombol Bayar Tagihan untuk bayar tagihan PLN dengan VA Semua Bank$")
    public void user_tap_tombol_Bayar_Tagihan_untuk_bayar_tagihan_PLN_dengan_VA_Semua_Bank() throws Throwable {
        plnPostpaid.keHalamanPembayaran();
    }

    @When("^user memilih metode pembayaran Virtual Account Semua Bank untuk bayar tagihan PLN Pascabayar$")
    public void user_memilih_metode_pembayaran_Virtual_Account_Semua_Bank_untuk_bayar_tagihan_PLN_Pascabayar() throws Throwable {
        plnPostpaid.diHalamanPembayaran();
        plnPostpaid.pilihanMetodeBayar();
        plnPostpaid.pilihBayarSemuaBank();
    }

    @When("^user tap pada tombol Bayar untuk bayar tagihan PLN dengan VA Semua Bank$")
    public void user_tap_pada_tombol_Bayar_untuk_bayar_tagihan_PLN_dengan_VA_Semua_Bank() throws Throwable {
        plnPostpaid.klikBayar();
    }

    @When("^user masuk ke halaman Informasi Pembayaran dengan Virtual Account Semua Bank$")
    public void user_masuk_ke_halaman_Informasi_Pembayaran_dengan_Virtual_Account_Semua_Bank() throws Throwable {
        popUpPage.disablePopUp();
        plnPostpaid.diHalamanTagihanSemuaBank();
    }

    @When("^user membayar lunas tagihan PLN Pascabayar melalui Virtual Account Semua Bank$")
    public void user_membayar_lunas_tagihan_PLN_Pascabayar_melalui_Virtual_Account_Semua_Bank() throws Throwable {

    }

    @Then("^status pemesanan PLN Pascabayar dengan VA Semua Bank pada halaman History berubah menjadi \"([^\"]*)\"$")
    public void status_pemesanan_PLN_Pascabayar_dengan_VA_Semua_Bank_pada_halaman_History_berubah_menjadi(String arg1) throws Throwable {

    }

    @Then("^bukti pembayaran PLN Pascabayar dengan VA Semua Bank diterima di email pelanggan$")
    public void bukti_pembayaran_PLN_Pascabayar_dengan_VA_Semua_Bank_diterima_di_email_pelanggan() throws Throwable {

    }

    @When("^user belum membayar tagihan PLN Pascabayar dengan VA Semua Bank hingga lebih dari batas waktu pembayaran$")
    public void user_belum_membayar_tagihan_PLN_Pascabayar_dengan_VA_Semua_Bank_hingga_lebih_dari_batas_waktu_pembayaran() throws Throwable {

    }

    @Then("^email transaksi PLN Pascabayar dengan VA Semua Bank dibatalkan karena kadaluarsa akan masuk ke email pelanggan$")
    public void email_transaksi_PLN_Pascabayar_dengan_VA_Semua_Bank_dibatalkan_karena_kadaluarsa_akan_masuk_ke_email_pelanggan() throws Throwable {

    }

    @Then("^transaksi terhapus PLN Pascabayar dengan VA Semua Bank dari History Transaksi di aplikasi mobile Sepulsa$")
    public void transaksi_terhapus_PLN_Pascabayar_dengan_VA_Semua_Bank_dari_History_Transaksi_di_aplikasi_mobile_Sepulsa() throws Throwable {

    }

    @When("^user mengetik nomor meter PLN / ID Pelanggan Pascabayar yang tidak valid untuk dibayar dengan VA Semua Bank$")
    public void user_mengetik_nomor_meter_PLN_ID_Pelanggan_Pascabayar_yang_tidak_valid_untuk_dibayar_dengan_VA_Semua_Bank() throws Throwable {
        plnPostpaid.isiIDPel(InputSepulsa.idError);
    }

    @Then("^keterangan pelanggan pascabayar yang akan bayar dengan VA Semua Bank ditampilkan$")
    public void keterangan_pelanggan_pascabayar_yang_akan_bayar_dengan_VA_Semua_Bank_ditampilkan() throws Throwable {
        plnPostpaid.statusPelangganTampil();
    }

    @Then("^muncul notifikasi \"([^\"]*)\" sehingga tidak bisa bayar dengan VA Semua Bank$")
    public void muncul_notifikasi_sehingga_tidak_bisa_bayar_dengan_VA_Semua_Bank(String arg1) throws Throwable {
        plnPostpaid.statusGagalTampil();
    }

    @When("^user mengetik nomor meter PLN / ID Pelanggan Pascabayar yang sudah lunas \\(VA Semua Bank\\)$")
    public void user_mengetik_nomor_meter_PLN_ID_Pelanggan_Pascabayar_yang_sudah_lunas_VA_Semua_Bank() throws Throwable {
        plnPostpaid.isiIDPel(InputSepulsa.idPaid);
    }

    @Then("^muncul notifikasi \"([^\"]*)\" karena tagihan sudah dibayar sehingga tidak bisa bayar dengan VA Semua Bank$")
    public void muncul_notifikasi_karena_tagihan_sudah_dibayar_sehingga_tidak_bisa_bayar_dengan_VA_Semua_Bank(String arg1) throws Throwable {
        plnPostpaid.statusGagalTampil();
    }

    @After
    public void closeApp(){
        driver.closeApp();
    }
}
