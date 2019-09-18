package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.InputSepulsa;
import utils.ThreadLocalDriver;

public class MobileBPJSSepulsaKredit extends BaseStep {

    @Before
    public void initiate(){
        driver = ThreadLocalDriver.getTLDriver();
    }

    @Given("^user telah login di aplikasi mobile Sepulsa untuk bayar BPJS dengan metode Sepulsa Kredit$")
    public void user_telah_login_di_aplikasi_mobile_Sepulsa_untuk_bayar_BPJS_dengan_metode_Sepulsa_Kredit() throws Throwable {
        driver.resetApp();
        popUpPage.disableGPS();
        mainPage.klikMulai();
        mainPage.isiIdSignIn(InputSepulsa.registerPhone);
        mainPage.isiPasswordSignIn(InputSepulsa.registerPassword);
        mainPage.submitSignIn();
        createScreenshots.captureScreenShots();
    }

    @Given("^user berada di halaman beranda aplikasi mobile Sepulsa untuk bayar BPJS dengan metode Sepulsa Kredit$")
    public void user_berada_di_halaman_beranda_aplikasi_mobile_Sepulsa_untuk_bayar_BPJS_dengan_metode_Sepulsa_Kredit() throws Throwable {
        beranda.sudahDiBeranda();
        createScreenshots.captureScreenShots();
    }

    @When("^user tap tombol Bayar BPJS Kesehatan untuk bayar BPJS dengan Sepulsa Kredit$")
    public void user_tap_tombol_Bayar_BPJS_Kesehatan_untuk_bayar_BPJS_dengan_Sepulsa_Kredit() throws Throwable {
        beranda.menuBPJS();
        createScreenshots.captureScreenShots();
    }

    @When("^user memasukkan nomor handphone untuk syarat bayar BPJS dengan Sepulsa Kredit$")
    public void user_memasukkan_nomor_handphone_untuk_syarat_bayar_BPJS_dengan_Sepulsa_Kredit() throws Throwable {
        bayarBPJS.fieldHPKosong();
        bayarBPJS.isiNoHP(InputSepulsa.registerPhone);
        createScreenshots.captureScreenShots();
    }

    @When("^user memasukkan no BPJS Kesehatan yang akan dilunasi dengan Sepulsa Kredit$")
    public void user_memasukkan_no_BPJS_Kesehatan_yang_akan_dilunasi_dengan_Sepulsa_Kredit() throws Throwable {
        bayarBPJS.isiNoBPJS(InputSepulsa.bpjsOK);
        createScreenshots.captureScreenShots();
    }

    @When("^user memasukkan no BPJS Kesehatan yang akan dilunasi dengan Sepulsa Kredit yang saldonya kurang$")
    public void user_memasukkan_no_BPJS_Kesehatan_yang_akan_dilunasi_dengan_Sepulsa_Kredit_yang_saldonya_kurang() throws Throwable {
        bayarBPJS.isiNoBPJS(InputSepulsa.bpjsPaid);
        createScreenshots.captureScreenShots();
    }

    @When("^informasi tagihan BPJS Kesehatan yang akan dibayar dengan Sepulsa Kredit muncul di layar$")
    public void informasi_tagihan_BPJS_Kesehatan_yang_akan_dibayar_dengan_Sepulsa_Kredit_muncul_di_layar() throws Throwable {
        bayarBPJS.cekStatusPeserta();
        createScreenshots.captureScreenShots();
    }

    @When("^user tap tombol Bayar Tagihan untuk melanjutkan pembayaran BPJS dengan Sepulsa Kredit$")
    public void user_tap_tombol_Bayar_Tagihan_untuk_melanjutkan_pembayaran_BPJS_dengan_Sepulsa_Kredit() throws Throwable {
        bayarBPJS.bayarSekarang();
        createScreenshots.captureScreenShots();
    }

    @When("^deposit Sepulsa Kredit cukup untuk melunasi tagihan BPJS Kesehatan$")
    public void deposit_Sepulsa_Kredit_cukup_untuk_melunasi_tagihan_BPJS_Kesehatan() throws Throwable {
        bayarBPJS.saldoSepulsaCreditCukup();
        createScreenshots.captureScreenShots();
    }

    @When("^user memilih metode pembayaran Sepulsa Kredit untuk melunasi tagihan BPJS Kesehatan$")
    public void user_memilih_metode_pembayaran_Sepulsa_Kredit_untuk_melunasi_tagihan_BPJS_Kesehatan() throws Throwable {
        bayarBPJS.pilihBayarSepulsaCredit();
        bayarBPJS.klikBayar();
        createScreenshots.captureScreenShots();
    }

    @Then("^user menerima bukti pelunasan pembayaran BPJS Kesehatan$")
    public void user_menerima_bukti_pelunasan_pembayaran_BPJS_Kesehatan() throws Throwable {
        popUpPage.disablePopUp();
        bayarBPJS.diHalamanSepulsaCredit();
        createScreenshots.captureScreenShots();
    }

    @Then("^transaksi bayar tagihan BPJS Kesehatan dengan Sepulsa Kredit pada halaman History muncul di daftar Transaksi Sukses$")
    public void transaksi_bayar_tagihan_BPJS_Kesehatan_dengan_Sepulsa_Kredit_pada_halaman_History_muncul_di_daftar_Transaksi_Sukses() throws Throwable {
        bayarBPJS.keHalamanBeranda();
        beranda.sudahDiBeranda();
        beranda.klikMenuHistory();
        history.sudahDiHistory();
        history.cekTransaksiSukses();
        createScreenshots.captureScreenShots();
    }

    @When("^deposit Sepulsa Kredit kurang dari tagihan BPJS Kesehatan$")
    public void deposit_Sepulsa_Kredit_kurang_dari_tagihan_BPJS_Kesehatan() throws Throwable {
        bayarBPJS.saldoSepulsaCreditKurang();
        createScreenshots.captureScreenShots();
    }

    @Then("^tombol Bayar Tagihan untuk Pembayaran BPJS Kesehatan dengan Sepulsa Kredit tidak akan muncul$")
    public void tombol_Bayar_Tagihan_untuk_Pembayaran_BPJS_Kesehatan_dengan_Sepulsa_Kredit_tidak_akan_muncul() throws Throwable {
        bayarBPJS.pilihanMetodeBayar();
        bayarBPJS.bayarSepulsaCreditTidakTersedia();
        createScreenshots.captureScreenShots();
    }

    @When("^user tidak punya saldo Sepulsa Credit untuk bayar tagihan BPJS Kesehatan$")
    public void user_tidak_punya_saldo_Sepulsa_Credit_untuk_bayar_tagihan_BPJS_Kesehatan() throws Throwable {
        beranda.menuSepulsaCredit();
        sepulsaCredit.saldoKreditKosong();
        createScreenshots.captureScreenShots();
    }

    @When("^user mencoba untuk membayar tagihan BPJS Kesehatan dengan Sepulsa Kredit$")
    public void user_mencoba_untuk_membayar_tagihan_BPJS_Kesehatan_dengan_Sepulsa_Kredit() throws Throwable {
        sepulsaCredit.kembaliKeMenu();
        beranda.menuBPJS();
        bayarBPJS.fieldHPKosong();
        bayarBPJS.isiNoHP(InputSepulsa.registerPhone);
        bayarBPJS.isiNoBPJS(InputSepulsa.bpjsOKTemp);
        bayarBPJS.cekStatusPeserta();
        bayarBPJS.bayarSekarang();
        createScreenshots.captureScreenShots();
    }

    @Then("^fitur Pembayaran BPJS Kesehatan dengan Sepulsa Kredit tidak akan muncul$")
    public void fitur_Pembayaran_BPJS_Kesehatan_dengan_Sepulsa_Kredit_tidak_akan_muncul() throws Throwable {
        bayarBPJS.pilihanMetodeBayar();
        bayarBPJS.sepulsaCreditTidakTersedia();
        createScreenshots.captureScreenShots();
    }

    @When("^user memasukkan no BPJS Kesehatan yang tidak valid untuk dilunasi dengan metode Sepulsa Kredit$")
    public void user_memasukkan_no_BPJS_Kesehatan_yang_tidak_valid_untuk_dilunasi_dengan_metode_Sepulsa_Kredit() throws Throwable {
        bayarBPJS.isiNoBPJS(InputSepulsa.bpjsFail);
        createScreenshots.captureScreenShots();
    }

    @Then("^layar akan menunjukkan bahwa nomor ID BPJS tidak terdaftar \\(Sepulsa Kredit\\)$")
    public void layar_akan_menunjukkan_bahwa_nomor_ID_BPJS_tidak_terdaftar_Sepulsa_Kredit() throws Throwable {
        bayarBPJS.nomorBPJSSalah();
        createScreenshots.captureScreenShots();
    }

    @When("^user memasukkan no BPJS Kesehatan yang sudah dibayar \\(Sepulsa Kredit\\)$")
    public void user_memasukkan_no_BPJS_Kesehatan_yang_sudah_dibayar_Sepulsa_Kredit() throws Throwable {
        bayarBPJS.isiNoBPJS(InputSepulsa.bpjsOK);
        createScreenshots.captureScreenShots();
    }

    @When("^user tap tombol Bayar Tagihan untuk melanjutkan pembayaran dengan Sepulsa Kredit$")
    public void user_tap_tombol_Bayar_Tagihan_untuk_melanjutkan_pembayaran_dengan_Sepulsa_Kredit() throws Throwable {
        bayarBPJS.bayarSekarang();
        createScreenshots.captureScreenShots();
    }

    @Then("^layar akan menunjukkan bahwa tagihan BPJS sudah terbayar \\(Sepulsa Kredit\\)$")
    public void layar_akan_menunjukkan_bahwa_tagihan_BPJS_sudah_terbayar_Sepulsa_Kredit() throws Throwable {
        bayarBPJS.nomorSudahDibayar();
        createScreenshots.captureScreenShots();
    }

    @When("^user mengosongkan nomor handphone untuk syarat bayar BPJS dengan metode Sepulsa Kredit$")
    public void user_mengosongkan_nomor_handphone_untuk_syarat_bayar_BPJS_dengan_metode_Sepulsa_Kredit() throws Throwable {
        bayarBPJS.fieldHPKosong();
        createScreenshots.captureScreenShots();
    }

    @Then("^user akan otomatis sign out dari aplikasi Sepulsa \\(Sepulsa Kredit\\)$")
    public void user_akan_otomatis_sign_out_dari_aplikasi_Sepulsa_Sepulsa_Kredit() throws Throwable {
        mainPage.sessionTimeOut();
        createScreenshots.captureScreenShots();
    }

    @Then("^user diarahkan ke halaman utama aplikasi Sepulsa \\(Sepulsa Kredit\\)$")
    public void user_diarahkan_ke_halaman_utama_aplikasi_Sepulsa_Sepulsa_Kredit() throws Throwable {
        mainPage.diHalamanUtama();
        createScreenshots.captureScreenShots();
    }

    @When("^user mengosongkan kolom no BPJS Kesehatan yang akan dilunasi dengan Sepulsa Kredit$")
    public void user_mengosongkan_kolom_no_BPJS_Kesehatan_yang_akan_dilunasi_dengan_Sepulsa_Kredit() throws Throwable {
        bayarBPJS.fieldNoBPJSKosong();
        createScreenshots.captureScreenShots();
    }

    @Then("^informasi tagihan BPJS yang akan dibayar dengan Sepulsa Kredit tidak akan muncul$")
    public void informasi_tagihan_BPJS_yang_akan_dibayar_dengan_Sepulsa_Kredit_tidak_akan_muncul() throws Throwable {
        bayarBPJS.statusTagihanTidakMuncul();
        createScreenshots.captureScreenShots();
    }

    @Then("^tombol Bayar Tagihan tidak muncul sehingga tidak bisa lanjut pembayaran dengan Sepulsa Kredit$")
    public void tombol_Bayar_Tagihan_tidak_muncul_sehingga_tidak_bisa_lanjut_pembayaran_dengan_Sepulsa_Kredit() throws Throwable {
        bayarBPJS.buttonBayarTidakMuncul();
        createScreenshots.captureScreenShots();
    }

    @When("^user memasukkan no BPJS Kesehatan yang digitnya kurang untuk dibayar dengan metode Sepulsa Kredit$")
    public void user_memasukkan_no_BPJS_Kesehatan_yang_digitnya_kurang_untuk_dibayar_dengan_metode_Sepulsa_Kredit() throws Throwable {
        bayarBPJS.isiNoBPJS(InputSepulsa.bpjsShort);
        createScreenshots.captureScreenShots();
    }

    @Then("^layar akan menunjukkan bahwa nomor BPJS salah dan tidak dapat dibayar dengan metode Sepulsa Kredit$")
    public void layar_akan_menunjukkan_bahwa_nomor_BPJS_salah_dan_tidak_dapat_dibayar_dengan_metode_Sepulsa_Kredit() throws Throwable {
        bayarBPJS.nomorBPJSSalah();
        createScreenshots.captureScreenShots();
    }
    @After
    public void closeApp(){
        driver.closeApp();
    }
}
