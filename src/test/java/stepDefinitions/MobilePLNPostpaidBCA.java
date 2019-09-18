package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;
import utils.InputSepulsa;
import utils.ThreadLocalDriver;

public class MobilePLNPostpaidBCA extends BaseStep {
    AndroidDriver driver;
    @Before
    public void initiate(){
        driver = ThreadLocalDriver.getTLDriver();
    }

    @Given("^user telah login di aplikasi mobile Sepulsa untuk bayar tagihan PLN dengan BCA VA$")
    public void user_telah_login_di_aplikasi_mobile_Sepulsa_untuk_bayar_tagihan_PLN_dengan_BCA_VA() throws Throwable {
        driver.resetApp();
        popUpPage.disableGPS();
        mainPage.klikMulai();
        mainPage.isiIdSignIn(InputSepulsa.registerPhone);
        mainPage.isiPasswordSignIn(InputSepulsa.registerPassword);
        mainPage.submitSignIn();
        createScreenshots.captureScreenShots();
    }

    @Given("^user berada di halaman beranda aplikasi mobile Sepulsa untuk bayar tagihan PLN dengan BCA VA$")
    public void user_berada_di_halaman_beranda_aplikasi_mobile_Sepulsa_untuk_bayar_tagihan_PLN_dengan_BCA_VA() throws Throwable {
        beranda.sudahDiBeranda();
        createScreenshots.captureScreenShots();
    }

    @When("^user tap tombol Listrik PLN untuk bayar tagihan PLN dengan BCA VA$")
    public void user_tap_tombol_Listrik_PLN_untuk_bayar_tagihan_PLN_dengan_BCA_VA() throws Throwable {
        beranda.menuPLN();
        createScreenshots.captureScreenShots();
    }

    @When("^user tap pada pilihan Pascabayar untuk bayar tagihan PLN dengan BCA VA$")
    public void user_tap_pada_pilihan_Pascabayar_untuk_bayar_tagihan_PLN_dengan_BCA_VA() throws Throwable {
        plnPostpaid.pilihPascabayar();
        createScreenshots.captureScreenShots();
    }

    @When("^user mengetik nomor meter PLN / ID Pelanggan untuk bayar tagihan PLN dengan BCA VA$")
    public void user_mengetik_nomor_meter_PLN_ID_Pelanggan_untuk_bayar_tagihan_PLN_dengan_BCA_VA() throws Throwable {
        plnPostpaid.isiIDPel(InputSepulsa.idOKFirst);
        createScreenshots.captureScreenShots();
    }

    @When("^user mengetik nomor handphone pemilik tagihan listrik yang akan dibayar dengan BCA VA$")
    public void user_mengetik_nomor_handphone_pemilik_tagihan_listrik_yang_akan_dibayar_dengan_BCA_VA() throws Throwable {
        plnPostpaid.isiNoHP(InputSepulsa.registerPhone);
        createScreenshots.captureScreenShots();
    }

    @When("^keterangan pelanggan yang akan bayar tagihan PLN dengan BCA VA ditampilkan$")
    public void keterangan_pelanggan_yang_akan_bayar_tagihan_PLN_dengan_BCA_VA_ditampilkan() throws Throwable {
        plnPostpaid.statusPelangganTampil();
        createScreenshots.captureScreenShots();
    }

    @When("^user tap tombol Bayar Tagihan untuk bayar tagihan PLN dengan BCA VA$")
    public void user_tap_tombol_Bayar_Tagihan_untuk_bayar_tagihan_PLN_dengan_BCA_VA() throws Throwable {
        plnPostpaid.keHalamanPembayaran();
        createScreenshots.captureScreenShots();
    }

    @When("^user memilih metode pembayaran BCA Virtual Account untuk bayar tagihan PLN Pascabayar$")
    public void user_memilih_metode_pembayaran_BCA_Virtual_Account_untuk_bayar_tagihan_PLN_Pascabayar() throws Throwable {
        plnPostpaid.diHalamanPembayaran();
        plnPostpaid.pilihanMetodeBayar();
        plnPostpaid.pilihBayarBCA();
        createScreenshots.captureScreenShots();
    }

    @When("^user tap pada tombol Bayar untuk bayar tagihan PLN dengan BCA VA$")
    public void user_tap_pada_tombol_Bayar_untuk_bayar_tagihan_PLN_dengan_BCA_VA() throws Throwable {
        plnPostpaid.klikBayar();
        createScreenshots.captureScreenShots();
    }

    @When("^user masuk ke halaman Informasi Pembayaran Tagihan PLN dengan BCA Virtual Account$")
    public void user_masuk_ke_halaman_Informasi_Pembayaran_Tagihan_PLN_dengan_BCA_Virtual_Account() throws Throwable {
        popUpPage.disablePopUp();
        plnPostpaid.diHalamanTagihanBCA();
        createScreenshots.captureScreenShots();
    }

    @When("^user membayar lunas tagihan PLN Pascabayar melalui BCA Virtual Account$")
    public void user_membayar_lunas_tagihan_PLN_Pascabayar_melalui_BCA_Virtual_Account() throws Throwable {
        plnPostpaid.tungguProsesPembayaran();
        createScreenshots.captureScreenShots();
    }

    @Then("^transaksi pemesanan PLN Pascabayar dengan metode bayar BCA Virtual Account pada halaman History muncul di daftar Transaksi Sukses$")
    public void transaksi_pemesanan_PLN_Pascabayar_dengan_metode_bayar_BCA_Virtual_Account_pada_halaman_History_muncul_di_daftar_Transaksi_Sukses() throws Throwable {
        plnPostpaid.keHalamanBeranda();
        beranda.sudahDiBeranda();
        beranda.klikMenuHistory();
        history.sudahDiHistory();
        history.cekTransaksiSukses();
        createScreenshots.captureScreenShots();
    }

    @When("^user belum membayar tagihan PLN Pascabayar dengan BCA VA hingga lebih dari batas waktu pembayaran$")
    public void user_belum_membayar_tagihan_PLN_Pascabayar_dengan_BCA_VA_hingga_lebih_dari_batas_waktu_pembayaran() throws Throwable {
        plnPostpaid.tungguProsesPembayaran();
        createScreenshots.captureScreenShots();
    }

    @Then("^transaksi PLN Pascabayar dengan metode bayar BCA VA pada halaman History tidak ditemukan di daftar Transaksi Sukses$")
    public void transaksi_PLN_Pascabayar_dengan_metode_bayar_BCA_VA_pada_halaman_History_tidak_ditemukan_di_daftar_Transaksi_Sukses() throws Throwable {
        plnPostpaid.keHalamanBeranda();
        beranda.sudahDiBeranda();
        beranda.klikMenuHistory();
        history.sudahDiHistory();
        history.cekTransaksiSukses();
        createScreenshots.captureScreenShots();
    }

    @When("^user mengetik nomor meter PLN / ID Pelanggan Pascabayar yang tidak valid untuk dibayar dengan BCA VA$")
    public void user_mengetik_nomor_meter_PLN_ID_Pelanggan_Pascabayar_yang_tidak_valid_untuk_dibayar_dengan_BCA_VA() throws Throwable {
        plnPostpaid.isiIDPel(InputSepulsa.idError);
        createScreenshots.captureScreenShots();
    }

    @Then("^muncul notifikasi \"([^\"]*)\" sehingga tidak bisa bayar PLN Pascabayar dengan BCA VA$")
    public void muncul_notifikasi_sehingga_tidak_bisa_bayar_PLN_Pascabayar_dengan_BCA_VA(String arg1) throws Throwable {
        plnPostpaid.statusGagalTampil();
        createScreenshots.captureScreenShots();
    }

    @When("^user mengetik nomor meter PLN / ID Pelanggan Pascabayar yang sudah lunas \\(BCA VA\\)$")
    public void user_mengetik_nomor_meter_PLN_ID_Pelanggan_Pascabayar_yang_sudah_lunas_BCA_VA() throws Throwable {
        plnPostpaid.isiIDPel(InputSepulsa.idPaid);
        createScreenshots.captureScreenShots();
    }

    @Then("^muncul notifikasi \"([^\"]*)\" karena tagihan sudah dibayar sehingga tidak bisa bayar PLN Pascabayar dengan BCA VA$")
    public void muncul_notifikasi_karena_tagihan_sudah_dibayar_sehingga_tidak_bisa_bayar_PLN_Pascabayar_dengan_BCA_VA(String arg1) throws Throwable {
        plnPostpaid.statusSudahBayarTampil();
        createScreenshots.captureScreenShots();
    }

    @When("^user mengosongkan kolom PLN / ID Pelanggan untuk bayar tagihan listrik dengan BCA VA$")
    public void user_mengosongkan_kolom_PLN_ID_Pelanggan_untuk_bayar_tagihan_listrik_dengan_BCA_VA() throws Throwable {
        plnPostpaid.kolomIDKosong();
        createScreenshots.captureScreenShots();
    }

    @Then("^keterangan pelanggan yang akan membayar tagihan listrik dengan metode bayar BCA Virtual Account tidak muncul$")
    public void keterangan_pelanggan_yang_akan_membayar_tagihan_listrik_dengan_metode_bayar_BCA_Virtual_Account_tidak_muncul() throws Throwable {
        plnPostpaid.statusTagihanTidakTampil();
        createScreenshots.captureScreenShots();
    }

    @When("^user mengosongkan kolom handphone pemilik tagihan listrik yang akan dibayar dengan BCA VA$")
    public void user_mengosongkan_kolom_handphone_pemilik_tagihan_listrik_yang_akan_dibayar_dengan_BCA_VA() throws Throwable {
        plnPostpaid.kolomHandphoneKosong();
        createScreenshots.captureScreenShots();
    }

    @After
    public void closeApp(){
        driver.closeApp();
    }
}
