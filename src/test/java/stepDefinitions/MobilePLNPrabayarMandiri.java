package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.InputSepulsa;
import utils.ThreadLocalDriver;

public class MobilePLNPrabayarMandiri extends BaseStep {

    @Before
    public void initiate(){
        driver = ThreadLocalDriver.getTLDriver();
    }

    @Given("^user telah login di aplikasi mobile Sepulsa untuk beli token listrik dengan Mandiri Virtual Account$")
    public void user_telah_login_di_aplikasi_mobile_Sepulsa_untuk_beli_token_listrik_dengan_Mandiri_Virtual_Account() throws Throwable {
        driver.resetApp();
        popUpPage.disableGPS();
        mainPage.klikMulai();
        mainPage.isiIdSignIn(InputSepulsa.signinPhone);
        mainPage.isiPasswordSignIn(InputSepulsa.signinPassword);
        mainPage.submitSignIn();
        createScreenshots.captureScreenShots();
    }

    @Given("^user berada di halaman beranda aplikasi mobile Sepulsa untuk beli token listrik dengan Mandiri Virtual Account$")
    public void user_berada_di_halaman_beranda_aplikasi_mobile_Sepulsa_untuk_beli_token_listrik_dengan_Mandiri_Virtual_Account() throws Throwable {
        beranda.sudahDiBeranda();
        createScreenshots.captureScreenShots();
    }

    @When("^user tap tombol Listrik PLN untuk beli token listrik dengan Mandiri Virtual Account$")
    public void user_tap_tombol_Listrik_PLN_untuk_beli_token_listrik_dengan_Mandiri_Virtual_Account() throws Throwable {
        beranda.menuPLN();
        createScreenshots.captureScreenShots();
    }

    @When("^user mengetik nomor meter PLN / ID Pelanggan untuk beli token listrik dengan Mandiri Virtual Account$")
    public void user_mengetik_nomor_meter_PLN_ID_Pelanggan_untuk_beli_token_listrik_dengan_Mandiri_Virtual_Account() throws Throwable {
        plnPrepaid.isiIDPel(InputSepulsa.tokenOKFirst);
        createScreenshots.captureScreenShots();
    }

    @When("^user mengetik nomor handphone penerima token listrik yang akan dibayar dengan Mandiri Virtual Account$")
    public void user_mengetik_nomor_handphone_penerima_token_listrik_yang_akan_dibayar_dengan_Mandiri_Virtual_Account() throws Throwable {
        plnPrepaid.isiNoHP(InputSepulsa.registerPhone);
        createScreenshots.captureScreenShots();
    }

    @When("^keterangan pelanggan yang akan membeli token listrik dengan metode bayar Mandiri Virtual Account ditampilkan$")
    public void keterangan_pelanggan_yang_akan_membeli_token_listrik_dengan_metode_bayar_Mandiri_Virtual_Account_ditampilkan() throws Throwable {
        plnPrepaid.statusPelangganTampil();
        createScreenshots.captureScreenShots();
    }

    @When("^user memilih nominal token listrik sebesar \"([^\"]*)\" untuk dibeli dengan Mandiri Virtual Account$")
    public void user_memilih_nominal_token_listrik_sebesar_untuk_dibeli_dengan_Mandiri_Virtual_Account(String nominalToken) throws Throwable {
        plnPrepaid.idPelangganMuncul();
        plnPrepaid.beliToken(nominalToken);
        createScreenshots.captureScreenShots();
    }

    @When("^user memilih metode pembayaran Mandiri Virtual Account untuk membayar token listrik$")
    public void user_memilih_metode_pembayaran_Mandiri_Virtual_Account_untuk_membayar_token_listrik() throws Throwable {
        plnPrepaid.totalTagihanAwalMuncul();
        plnPrepaid.pilihanMetodeBayar();
        plnPrepaid.pilihBayarMandiri();
        createScreenshots.captureScreenShots();
    }

    @When("^user tap pada tombol Bayar untuk melanjutkan pembayaran token listrik dengan Mandiri Virtual Account$")
    public void user_tap_pada_tombol_Bayar_untuk_melanjutkan_pembayaran_token_listrik_dengan_Mandiri_Virtual_Account() throws Throwable {
        plnPrepaid.klikBayar();
        createScreenshots.captureScreenShots();
    }

    @When("^user masuk ke halaman Informasi Pembayaran PLN Prabayar dengan Mandiri Virtual Account$")
    public void user_masuk_ke_halaman_Informasi_Pembayaran_PLN_Prabayar_dengan_Mandiri_Virtual_Account() throws Throwable {
        popUpPage.disablePopUp();
        plnPrepaid.diHalamanTagihanMandiri();
        createScreenshots.captureScreenShots();
    }

    @When("^user membayar lunas tagihan PLN Prabayar melalui Mandiri Virtual Account$")
    public void user_membayar_lunas_tagihan_PLN_Prabayar_melalui_Mandiri_Virtual_Account() throws Throwable {
        plnPrepaid.tungguProsesPembayaran();
        createScreenshots.captureScreenShots();
    }

    @Then("^transaksi pemesanan token listrik dengan metode bayar Mandiri Virtual Account pada halaman History muncul di daftar Transaksi Sukses$")
    public void transaksi_pemesanan_token_listrik_dengan_metode_bayar_Mandiri_Virtual_Account_pada_halaman_History_muncul_di_daftar_Transaksi_Sukses() throws Throwable {
        plnPrepaid.keHalamanBeranda();
        beranda.sudahDiBeranda();
        beranda.klikMenuHistory();
        history.sudahDiHistory();
        history.cekTransaksiSukses();
        createScreenshots.captureScreenShots();
    }

    @When("^user belum membayar tagihan PLN Prabayar melalui Mandiri Virtual Account hingga lebih dari batas waktu pembayaran$")
    public void user_belum_membayar_tagihan_PLN_Prabayar_melalui_Mandiri_Virtual_Account_hingga_lebih_dari_batas_waktu_pembayaran() throws Throwable {
        plnPrepaid.tungguProsesPembayaran();
        createScreenshots.captureScreenShots();
    }

    @Then("^transaksi pemesanan token listrik dengan metode bayar Mandiri Virtual Account pada halaman History tidak ditemukan di daftar Transaksi Sukses$")
    public void transaksi_pemesanan_token_listrik_dengan_metode_bayar_Mandiri_Virtual_Account_pada_halaman_History_tidak_ditemukan_di_daftar_Transaksi_Sukses() throws Throwable {
        plnPrepaid.keHalamanBeranda();
        beranda.sudahDiBeranda();
        beranda.klikMenuHistory();
        history.sudahDiHistory();
        history.cekTransaksiSukses();
        createScreenshots.captureScreenShots();
    }

    @When("^user mengetik nomor meter PLN / ID Pelanggan yang tidak valid untuk beli token listrik dengan Mandiri Virtual Account$")
    public void user_mengetik_nomor_meter_PLN_ID_Pelanggan_yang_tidak_valid_untuk_beli_token_listrik_dengan_Mandiri_Virtual_Account() throws Throwable {
        plnPrepaid.isiIDPel(InputSepulsa.tokenFail);
        createScreenshots.captureScreenShots();
    }

    @When("^muncul notifikasi \"([^\"]*)\" sehingga tidak bisa melanjutkan pemesanan \\(PLN Prabayar, Mandiri VA\\)$")
    public void muncul_notifikasi_sehingga_tidak_bisa_melanjutkan_pemesanan_PLN_Prabayar_Mandiri_VA(String arg1) throws Throwable {
        plnPrepaid.statusGagalTampil();
        createScreenshots.captureScreenShots();
    }

    @Given("^user telah login di aplikasi mobile Sepulsa untuk beli token listrik dengan Mandiri Virtual Account tengah malam$")
    public void user_telah_login_di_aplikasi_mobile_Sepulsa_untuk_beli_token_listrik_dengan_Mandiri_Virtual_Account_tengah_malam() throws Throwable {

    }

    @When("^user mengetik nomor meter PLN / ID Pelanggan untuk beli token listrik dengan Mandiri Virtual Account tengah malam$")
    public void user_mengetik_nomor_meter_PLN_ID_Pelanggan_untuk_beli_token_listrik_dengan_Mandiri_Virtual_Account_tengah_malam() throws Throwable {

    }

    @Then("^muncul notifikasi \"([^\"]*)\" karena dilakukan tengah malam \\(PLN Prabayar, Mandiri VA\\)$")
    public void muncul_notifikasi_karena_dilakukan_tengah_malam_PLN_Prabayar_Mandiri_VA(String arg1) throws Throwable {

    }

    @When("^user mengosongkan kolom PLN / ID Pelanggan untuk beli token listrik dengan Mandiri Virtual Account$")
    public void user_mengosongkan_kolom_PLN_ID_Pelanggan_untuk_beli_token_listrik_dengan_Mandiri_Virtual_Account() throws Throwable {
        plnPrepaid.kolomIDKosong();
        createScreenshots.captureScreenShots();
    }

    @Then("^keterangan pelanggan yang akan membeli token listrik dengan metode bayar Mandiri Virtual Account tidak muncul$")
    public void keterangan_pelanggan_yang_akan_membeli_token_listrik_dengan_metode_bayar_Mandiri_Virtual_Account_tidak_muncul() throws Throwable {
        plnPrepaid.statusPelangganTidakTampil();
        createScreenshots.captureScreenShots();
    }

    @When("^user mengosongkan kolom handphone penerima token listrik yang akan dibayar dengan Mandiri Virtual Account$")
    public void user_mengosongkan_kolom_handphone_penerima_token_listrik_yang_akan_dibayar_dengan_Mandiri_Virtual_Account() throws Throwable {
        plnPrepaid.kolomHandphoneKosong();
        createScreenshots.captureScreenShots();
    }

    @After
    public void closeApp(){
        driver.closeApp();
    }


}
