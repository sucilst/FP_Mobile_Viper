package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.InputSepulsa;
import utils.ThreadLocalDriver;

public class MobileBPJSMandiri extends BaseStep {

    @Before
    public void initiate(){
        driver = ThreadLocalDriver.getTLDriver();
    }

    @Given("^user telah login di aplikasi mobile Sepulsa untuk bayar BPJS dengan metode Mandiri VA$")
    public void user_telah_login_di_aplikasi_mobile_Sepulsa_untuk_bayar_BPJS_dengan_metode_Mandiri_VA() throws Throwable {
        driver.resetApp();
        popUpPage.disableGPS();
        mainPage.klikMulai();
        mainPage.isiIdSignIn(InputSepulsa.signinPhone);
        mainPage.isiPasswordSignIn(InputSepulsa.signinPassword);
        mainPage.submitSignIn();
        createScreenshots.captureScreenShots();
    }

    @Given("^user berada di halaman beranda aplikasi mobile Sepulsa untuk bayar BPJS dengan metode Mandiri VA$")
    public void user_berada_di_halaman_beranda_aplikasi_mobile_Sepulsa_untuk_bayar_BPJS_dengan_metode_Mandiri_VA() throws Throwable {
        beranda.sudahDiBeranda();
        createScreenshots.captureScreenShots();
    }

    @When("^user tap tombol Bayar BPJS Kesehatan untuk untuk bayar BPJS dengan metode Mandiri VA$")
    public void user_tap_tombol_Bayar_BPJS_Kesehatan_untuk_untuk_bayar_BPJS_dengan_metode_Mandiri_VA() throws Throwable {
        beranda.menuBPJS();
        createScreenshots.captureScreenShots();
    }

    @When("^user memasukkan nomor handphone untuk syarat bayar BPJS dengan metode Mandiri VA$")
    public void user_memasukkan_nomor_handphone_untuk_syarat_bayar_BPJS_dengan_metode_Mandiri_VA() throws Throwable {
        bayarBPJS.fieldHPKosong();
        bayarBPJS.isiNoHP(InputSepulsa.registerPhone);
        createScreenshots.captureScreenShots();
    }

    @When("^user memasukkan no BPJS Kesehatan yang akan dibayar dengan metode Mandiri VA$")
    public void user_memasukkan_no_BPJS_Kesehatan_yang_akan_dibayar_dengan_metode_Mandiri_VA() throws Throwable {
        bayarBPJS.isiNoBPJS(InputSepulsa.bpjsOK);
        createScreenshots.captureScreenShots();
    }

    @When("^informasi tagihan BPJS yang akan dibayar dengan metode Mandiri VA muncul di layar$")
    public void informasi_tagihan_BPJS_yang_akan_dibayar_dengan_metode_Mandiri_VA_muncul_di_layar() throws Throwable {
        bayarBPJS.cekStatusPeserta();
        createScreenshots.captureScreenShots();
    }

    @When("^user tap tombol Bayar Tagihan untuk lanjut pembayaran BPJS dengan metode Mandiri VA$")
    public void user_tap_tombol_Bayar_Tagihan_untuk_lanjut_pembayaran_BPJS_dengan_metode_Mandiri_VA() throws Throwable {
        bayarBPJS.bayarSekarang();
        createScreenshots.captureScreenShots();
    }

    @When("^user memilih metode pembayaran Mandiri Virtual Account untuk membayar tagihan BPJS$")
    public void user_memilih_metode_pembayaran_Mandiri_Virtual_Account_untuk_membayar_tagihan_BPJS() throws Throwable {
        bayarBPJS.pilihanMetodeBayar();
        bayarBPJS.pilihBayarMandiri();
        createScreenshots.captureScreenShots();
    }

    @When("^user tap pada tombol Bayar untuk membayar tagihan BPJS dengan metode Mandiri VA$")
    public void user_tap_pada_tombol_Bayar_untuk_membayar_tagihan_BPJS_dengan_metode_Mandiri_VA() throws Throwable {
        bayarBPJS.klikBayar();
        createScreenshots.captureScreenShots();
    }

    @When("^user masuk ke halaman Informasi Pembayaran BPJS yang harus dibayar dengan metode Mandiri VA$")
    public void user_masuk_ke_halaman_Informasi_Pembayaran_BPJS_yang_harus_dibayar_dengan_metode_Mandiri_VA() throws Throwable {
        popUpPage.disablePopUp();
        bayarBPJS.diHalamanTagihanMandiri();
        createScreenshots.captureScreenShots();
    }

    @When("^user belum membayar tagihan BPJS dengan metode Mandiri VA hingga lebih dari batas waktu pembayaran$")
    public void user_belum_membayar_tagihan_BPJS_dengan_metode_Mandiri_VA_hingga_lebih_dari_batas_waktu_pembayaran() throws Throwable {
        bayarBPJS.tungguProsesPembayaran();
        createScreenshots.captureScreenShots();
    }

    @Then("^transaksi bayar tagihan BPJS Kesehatan dengan metode Mandiri VA pada halaman History tidak muncul di daftar Transaksi Sukses$")
    public void transaksi_bayar_tagihan_BPJS_Kesehatan_dengan_metode_Mandiri_VA_pada_halaman_History_tidak_muncul_di_daftar_Transaksi_Sukses() throws Throwable {
        bayarBPJS.keHalamanBeranda();
        beranda.sudahDiBeranda();
        beranda.klikMenuHistory();
        history.sudahDiHistory();
        history.cekTransaksiSukses();
        createScreenshots.captureScreenShots();
    }

    @When("^user membayar lunas tagihan BPJS melalui Mandiri Virtual Account$")
    public void user_membayar_lunas_tagihan_BPJS_melalui_Mandiri_Virtual_Account() throws Throwable {
        bayarBPJS.tungguProsesPembayaran();
        createScreenshots.captureScreenShots();
    }

    @Then("^transaksi bayar tagihan BPJS Kesehatan dengan metode Mandiri VA pada halaman History muncul di daftar Transaksi Sukses$")
    public void transaksi_bayar_tagihan_BPJS_Kesehatan_dengan_metode_Mandiri_VA_pada_halaman_History_muncul_di_daftar_Transaksi_Sukses() throws Throwable {
        bayarBPJS.keHalamanBeranda();
        beranda.sudahDiBeranda();
        beranda.klikMenuHistory();
        history.sudahDiHistory();
        history.cekTransaksiSukses();
        createScreenshots.captureScreenShots();
    }

    @When("^user memasukkan no BPJS Kesehatan yang tidak valid untuk dibayar dengan metode Mandiri VA$")
    public void user_memasukkan_no_BPJS_Kesehatan_yang_tidak_valid_untuk_dibayar_dengan_metode_Mandiri_VA() throws Throwable {
        bayarBPJS.isiNoBPJS(InputSepulsa.bpjsFail);
        createScreenshots.captureScreenShots();
    }

    @Then("^layar akan menunjukkan bahwa nomor BPJS tidak terdaftar dan tidak dapat dibayar dengan metode Mandiri VA$")
    public void layar_akan_menunjukkan_bahwa_nomor_BPJS_tidak_terdaftar_dan_tidak_dapat_dibayar_dengan_metode_Mandiri_VA() throws Throwable {
        bayarBPJS.nomorBPJSSalah();
        createScreenshots.captureScreenShots();
    }

    @When("^user memasukkan no BPJS Kesehatan yang sudah dibayar untuk dibayar dengan metode Mandiri VA$")
    public void user_memasukkan_no_BPJS_Kesehatan_yang_sudah_dibayar_untuk_dibayar_dengan_metode_Mandiri_VA() throws Throwable {
        bayarBPJS.isiNoBPJS(InputSepulsa.bpjsOK);
        createScreenshots.captureScreenShots();
    }

    @When("^informasi tagihan BPJS yang harus dibayar dengan metode Mandiri VA muncul di layar$")
    public void informasi_tagihan_BPJS_yang_harus_dibayar_dengan_metode_Mandiri_VA_muncul_di_layar() throws Throwable {
        bayarBPJS.cekStatusPeserta();
        createScreenshots.captureScreenShots();
    }

    @Then("^layar akan menunjukkan bahwa tagihan BPJS sudah terbayar sehingga tidak dapat dibayar dengan metode Mandiri VA$")
    public void layar_akan_menunjukkan_bahwa_tagihan_BPJS_sudah_terbayar_sehingga_tidak_dapat_dibayar_dengan_metode_Mandiri_VA() throws Throwable {
        bayarBPJS.nomorSudahDibayar();
        createScreenshots.captureScreenShots();
    }

    @When("^user mengosongkan nomor handphone yang diperlukan untuk syarat bayar BPJS dengan metode Mandiri VA$")
    public void user_mengosongkan_nomor_handphone_yang_diperlukan_untuk_syarat_bayar_BPJS_dengan_metode_Mandiri_VA() throws Throwable {
        bayarBPJS.fieldHPKosong();
        createScreenshots.captureScreenShots();
    }

    @Then("^user akan otomatis sign out dari aplikasi Sepulsa \\(BPJS Mandiri VA\\)$")
    public void user_akan_otomatis_sign_out_dari_aplikasi_Sepulsa_BPJS_Mandiri_VA() throws Throwable {
        mainPage.sessionTimeOut();
        createScreenshots.captureScreenShots();
    }

    @Then("^user diarahkan ke halaman utama aplikasi Sepulsa \\(BPJS Mandiri VA\\)$")
    public void user_diarahkan_ke_halaman_utama_aplikasi_Sepulsa_BPJS_Mandiri_VA() throws Throwable {
        mainPage.diHalamanUtama();
        createScreenshots.captureScreenShots();
    }

    @When("^user mengosongkan kolom BPJS Kesehatan yang akan dibayar dengan metode Mandiri VA$")
    public void user_mengosongkan_kolom_BPJS_Kesehatan_yang_akan_dibayar_dengan_metode_Mandiri_VA() throws Throwable {
        bayarBPJS.fieldNoBPJSKosong();
        createScreenshots.captureScreenShots();
    }

    @Then("^informasi tagihan BPJS Kesehatan yang harus dibayar dengan Mandiri VA tidak akan muncul$")
    public void informasi_tagihan_BPJS_Kesehatan_yang_harus_dibayar_dengan_Mandiri_VA_tidak_akan_muncul() throws Throwable {
        bayarBPJS.statusTagihanTidakMuncul();
        createScreenshots.captureScreenShots();
    }

    @Then("^tombol Bayar Tagihan untuk melanjutkan pembayaran BPJS dengan metode Mandiri VA tidak muncul$")
    public void tombol_Bayar_Tagihan_untuk_melanjutkan_pembayaran_BPJS_dengan_metode_Mandiri_VA_tidak_muncul() throws Throwable {
        bayarBPJS.buttonBayarTidakMuncul();
        createScreenshots.captureScreenShots();
    }

    @When("^user memasukkan no BPJS Kesehatan yang digitnya kurang untuk dibayar dengan metode Mandiri VA$")
    public void user_memasukkan_no_BPJS_Kesehatan_yang_digitnya_kurang_untuk_dibayar_dengan_metode_Mandiri_VA() throws Throwable {
        bayarBPJS.isiNoBPJS(InputSepulsa.bpjsShort);
        createScreenshots.captureScreenShots();
    }

    @Then("^layar akan menunjukkan bahwa nomor BPJS salah dan tidak dapat dibayar dengan metode Mandiri VA$")
    public void layar_akan_menunjukkan_bahwa_nomor_BPJS_salah_dan_tidak_dapat_dibayar_dengan_metode_Mandiri_VA() throws Throwable {
        bayarBPJS.nomorBPJSSalah();
        createScreenshots.captureScreenShots();
    }

    @After
    public void closeApp(){
        driver.closeApp();
    }

}
