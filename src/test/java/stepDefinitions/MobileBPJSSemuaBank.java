package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;
import utils.InputSepulsa;
import utils.ThreadLocalDriver;

public class MobileBPJSSemuaBank extends BaseStep {

    AndroidDriver driver;
    @Before
    public void initiate(){
        driver = ThreadLocalDriver.getTLDriver();
    }

    @Given("^user telah login di aplikasi mobile Sepulsa untuk bayar BPJS dengan metode VA Semua Bank$")
    public void user_telah_login_di_aplikasi_mobile_Sepulsa_untuk_bayar_BPJS_dengan_metode_VA_Semua_Bank() throws Throwable {
        driver.resetApp();
        popUpPage.disableGPS();
        mainPage.klikMulai();
        mainPage.isiIdSignIn(InputSepulsa.signinPhone);
        mainPage.isiPasswordSignIn(InputSepulsa.signinPassword);
        mainPage.submitSignIn();
    }

    @Given("^user berada di halaman beranda aplikasi mobile Sepulsa untuk bayar BPJS dengan metode VA Semua Bank$")
    public void user_berada_di_halaman_beranda_aplikasi_mobile_Sepulsa_untuk_bayar_BPJS_dengan_metode_VA_Semua_Bank() throws Throwable {
        beranda.sudahDiBeranda();
    }

    @When("^user tap tombol Bayar BPJS Kesehatan untuk untuk bayar BPJS dengan metode VA Semua Bank$")
    public void user_tap_tombol_Bayar_BPJS_Kesehatan_untuk_untuk_bayar_BPJS_dengan_metode_VA_Semua_Bank() throws Throwable {
        beranda.menuBPJS();
    }

    @When("^user memasukkan nomor handphone untuk syarat bayar BPJS dengan metode VA Semua Bank$")
    public void user_memasukkan_nomor_handphone_untuk_syarat_bayar_BPJS_dengan_metode_VA_Semua_Bank() throws Throwable {
        bayarBPJS.fieldHPKosong();
        bayarBPJS.isiNoHP(InputSepulsa.registerPhone);
    }

    @When("^user memasukkan no BPJS Kesehatan yang akan dibayar dengan metode VA Semua Bank$")
    public void user_memasukkan_no_BPJS_Kesehatan_yang_akan_dibayar_dengan_metode_VA_Semua_Bank() throws Throwable {
        bayarBPJS.isiNoBPJS(InputSepulsa.bpjsOK);
    }

    @When("^informasi tagihan BPJS  yang akan dibayar dengan metode VA Semua Bank muncul di layar$")
    public void informasi_tagihan_BPJS_yang_akan_dibayar_dengan_metode_VA_Semua_Bank_muncul_di_layar() throws Throwable {
        bayarBPJS.cekStatusPeserta();
    }

    @When("^user tap tombol Bayar Tagihan untuk lanjut pembayaran BPJS dengan metode VA Semua Bank$")
    public void user_tap_tombol_Bayar_Tagihan_untuk_lanjut_pembayaran_BPJS_dengan_metode_VA_Semua_Bank() throws Throwable {
        bayarBPJS.bayarSekarang();
    }

    @When("^user memilih metode pembayaran Virtual Account Semua Bank untuk membayar tagihan BPJS$")
    public void user_memilih_metode_pembayaran_Virtual_Account_Semua_Bank_untuk_membayar_tagihan_BPJS() throws Throwable {
        bayarBPJS.pilihanMetodeBayar();
        bayarBPJS.pilihBayarSemuaBank();
    }

    @When("^user tap pada tombol Bayar untuk membayar tagihan BPJS dengan metode VA Semua Bank$")
    public void user_tap_pada_tombol_Bayar_untuk_membayar_tagihan_BPJS_dengan_metode_VA_Semua_Bank() throws Throwable {
        bayarBPJS.klikBayar();
    }

    @When("^user masuk ke halaman Informasi Pembayaran BPJS yang harus dibayar dengan metode VA Semua Bank$")
    public void user_masuk_ke_halaman_Informasi_Pembayaran_BPJS_yang_harus_dibayar_dengan_metode_VA_Semua_Bank() throws Throwable {
        popUpPage.disablePopUp();
        bayarBPJS.diHalamanTagihanSemuaBank();
    }

    @When("^user membayar lunas tagihan BPJS melalui Virtual Account Semua Bank$")
    public void user_membayar_lunas_tagihan_BPJS_melalui_Virtual_Account_Semua_Bank() throws Throwable {

    }

    @Then("^status pembayaran BPJS Kesehatan dengan Virtual Account Semua Bank pada halaman History berubah menjadi \"([^\"]*)\"$")
    public void status_pembayaran_BPJS_Kesehatan_dengan_Virtual_Account_Semua_Bank_pada_halaman_History_berubah_menjadi(String arg1) throws Throwable {
        bayarBPJS.keHalamanBeranda();
        beranda.klikMenuHistory();
    }

    @Then("^user dapat melihat bukti pembayaran BPJS dengan metode Virtual Account Semua Bank$")
    public void user_dapat_melihat_bukti_pembayaran_BPJS_dengan_metode_Virtual_Account_Semua_Bank() throws Throwable {

    }

    @When("^user belum membayar tagihan BPJS dengan metode VA Semua Bank hingga lebih dari batas waktu pembayaran$")
    public void user_belum_membayar_tagihan_BPJS_dengan_metode_VA_Semua_Bank_hingga_lebih_dari_batas_waktu_pembayaran() throws Throwable {
        bayarBPJS.keHalamanBeranda();
        beranda.klikMenuHistory();
    }

    @Then("^transaksi BPJS Kesehatan dengan Virtual Account Semua Bank di aplikasi mobile Sepulsa statusnya berubah jadi EXPIRED$")
    public void transaksi_BPJS_Kesehatan_dengan_Virtual_Account_Semua_Bank_di_aplikasi_mobile_Sepulsa_statusnya_berubah_jadi_EXPIRED() throws Throwable {

    }

    @When("^user memasukkan no BPJS Kesehatan yang tidak valid untuk dibayar dengan metode VA Semua Bank$")
    public void user_memasukkan_no_BPJS_Kesehatan_yang_tidak_valid_untuk_dibayar_dengan_metode_VA_Semua_Bank() throws Throwable {
        bayarBPJS.isiNoBPJS(InputSepulsa.bpjsFail);
    }

    @Then("^layar akan menunjukkan bahwa nomor BPJS tidak terdaftar dan tidak dapat dibayar dengan metode VA Semua Bank$")
    public void layar_akan_menunjukkan_bahwa_nomor_BPJS_tidak_terdaftar_dan_tidak_dapat_dibayar_dengan_metode_VA_Semua_Bank() throws Throwable {
        bayarBPJS.statusInvalidMuncul();
    }

    @When("^user memasukkan no BPJS Kesehatan yang sudah dibayar untuk dibayar dengan metode VA Semua Bank$")
    public void user_memasukkan_no_BPJS_Kesehatan_yang_sudah_dibayar_untuk_dibayar_dengan_metode_VA_Semua_Bank() throws Throwable {
        bayarBPJS.isiNoBPJS(InputSepulsa.bpjsPaid);
    }

    @When("^informasi tagihan BPJS yang harus dibayar dengan metode VA Semua Bank muncul di layar$")
    public void informasi_tagihan_BPJS_yang_harus_dibayar_dengan_metode_VA_Semua_Bank_muncul_di_layar() throws Throwable {
        bayarBPJS.cekStatusPeserta();
    }

    @Then("^layar akan menunjukkan bahwa tagihan BPJS sudah terbayar sehingga tidak dapat dibayar dengan metode VA Semua Bank$")
    public void layar_akan_menunjukkan_bahwa_tagihan_BPJS_sudah_terbayar_sehingga_tidak_dapat_dibayar_dengan_metode_VA_Semua_Bank() throws Throwable {

    }

    @When("^user mengosongkan nomor handphone yang diperlukan untuk syarat bayar BPJS dengan metode VA Semua Bank$")
    public void user_mengosongkan_nomor_handphone_yang_diperlukan_untuk_syarat_bayar_BPJS_dengan_metode_VA_Semua_Bank() throws Throwable {
        bayarBPJS.fieldHPKosong();
    }

    @Then("^user akan otomatis sign out dari aplikasi Sepulsa \\(BPJS VA Semua Bank\\)$")
    public void user_akan_otomatis_sign_out_dari_aplikasi_Sepulsa_BPJS_VA_Semua_Bank() throws Throwable {
        mainPage.diHalamanUtama();
        // masukin toast boxnya
    }

    @Then("^user diarahkan ke halaman utama aplikasi Sepulsa \\(BPJS VA Semua Bank\\)$")
    public void user_diarahkan_ke_halaman_utama_aplikasi_Sepulsa_BPJS_VA_Semua_Bank() throws Throwable {
        mainPage.diHalamanUtama();
    }

    @When("^user mengosongkan kolom BPJS Kesehatan yang akan dibayar dengan metode VA Semua Bank$")
    public void user_mengosongkan_kolom_BPJS_Kesehatan_yang_akan_dibayar_dengan_metode_VA_Semua_Bank() throws Throwable {

    }

    @Then("^informasi tagihan yang harus dibayar dengan BPJS Kesehatan tidak akan muncul$")
    public void informasi_tagihan_yang_harus_dibayar_dengan_BPJS_Kesehatan_tidak_akan_muncul() throws Throwable {

    }

    @Then("^tombol Bayar Tagihan untuk melanjutkan pembayaran BPJS dengan metode VA Semua Bank tidak muncul$")
    public void tombol_Bayar_Tagihan_untuk_melanjutkan_pembayaran_BPJS_dengan_metode_VA_Semua_Bank_tidak_muncul() throws Throwable {

    }

    @After
    public void closeApp(){
        driver.closeApp();
    }
}
