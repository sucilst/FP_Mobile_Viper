package stepDefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;
import utils.InputSepulsa;
import utils.ThreadLocalDriver;

public class MobileBPJSCC extends BaseStep {
    AndroidDriver driver;
    @Before
    public void initiate(){
        driver = ThreadLocalDriver.getTLDriver();
    }

    //--------------------------------------------------SCENARIO 1------------------------------------------------------

    @Given("^user telah login di aplikasi mobile Sepulsa untuk bayar BPJS \\(BPJS CC\\)$")
    public void user_telah_login_di_aplikasi_mobile_Sepulsa_untuk_bayar_BPJS_BPJS_CC() throws Throwable {
        driver.resetApp();
        mainPage.klikMulai();
        mainPage.isiIdSignIn(InputSepulsa.noTara1);
        mainPage.isiPasswordSignIn(InputSepulsa.passTara1);
        mainPage.submitSignIn();
    }

    @Given("^user berada di halaman beranda aplikasi mobile Sepulsa untuk bayar BPJS \\(BPJS CC\\)$")
    public void user_berada_di_halaman_beranda_aplikasi_mobile_Sepulsa_untuk_bayar_BPJS_BPJS_CC() throws Throwable {
        beranda.sudahDiBeranda();
    }

    @When("^user tap tombol Bayar BPJS Kesehatan untuk untuk bayar BPJS \\(BPJS CC\\)$")
    public void user_tap_tombol_Bayar_BPJS_Kesehatan_untuk_untuk_bayar_BPJS_BPJS_CC() throws Throwable {
        beranda.menuBPJS();
    }

    @When("^user memasukkan nomor handphone untuk syarat bayar BPJS \\(BPJS CC\\)$")
    public void user_memasukkan_nomor_handphone_untuk_syarat_bayar_BPJS_BPJS_CC() throws Throwable {

    }

    @When("^user memasukkan no BPJS Kesehatan yang akan dibayar \\(BPJS CC\\)$")
    public void user_memasukkan_no_BPJS_Kesehatan_yang_akan_dibayar_BPJS_CC() throws Throwable {
        bayarBPJS.isiNoBPJS(InputSepulsa.bpjsOK);
    }

    @When("^informasi tagihan BPJS yang akan dibayar muncul di layar \\(BPJS CC\\)$")
    public void informasi_tagihan_BPJS_yang_akan_dibayar_muncul_di_layar_BPJS_CC() throws Throwable {
        bayarBPJS.cekStatusPeserta();
    }

    @When("^user tap tombol Bayar Tagihan untuk lanjut pembayaran BPJS \\(BPJS CC\\)$")
    public void user_tap_tombol_Bayar_Tagihan_untuk_lanjut_pembayaran_BPJS_BPJS_CC() throws Throwable {
        bayarBPJS.bayarSekarang();
    }

    @When("^user memilih metode pembayaran Credit Card untuk membayar tagihan BPJS \\(BPJS CC\\)$")
    public void user_memilih_metode_pembayaran_Credit_Card_untuk_membayar_tagihan_BPJS_BPJS_CC() throws Throwable {
        bayarBPJS.pilihCC();
    }

    @When("^user tap pada tombol Bayar untuk membayar tagihan BPJS \\(BPJS CC\\)$")
    public void user_tap_pada_tombol_Bayar_untuk_membayar_tagihan_BPJS_BPJS_CC() throws Throwable {
        bayarBPJS.isiCreditCard();
        bayarBPJS.klikBayar();
    }

    @When("^user masuk ke halaman Informasi Pembayaran BPJS yang harus dibayar \\(BPJS CC\\)$")
    public void user_masuk_ke_halaman_Informasi_Pembayaran_BPJS_yang_harus_dibayar_BPJS_CC() throws Throwable {
        bayarBPJS.isiMidtrans();
        popUpPage.munculKamuSukaSepulsa();
        popUpPage.munculAutoPay();
        plnPostpaid.diHalamanTagihanCC();
        bayarBPJS.diHalamanTagihanCC();
    }

    @Then("^transaksi bayar tagihan BPJS Kesehatan dengan metode CC pada halaman History muncul di daftar Transaksi Sukses \\(BPJS CC\\)$")
    public void transaksi_bayar_tagihan_BPJS_Kesehatan_dengan_metode_CC_pada_halaman_History_muncul_di_daftar_Transaksi_Sukses_BPJS_CC() throws Throwable {
        bayarBPJS.klikDoneButton();
        beranda.sudahDiBeranda();
    }

    //--------------------------------------------------SCENARIO 2------------------------------------------------------

    @When("^user mengosongkan kolom BPJS Kesehatan yang akan dibayar \\(BPJS CC\\)$")
    public void user_mengosongkan_kolom_BPJS_Kesehatan_yang_akan_dibayar_BPJS_CC() throws Throwable {
        bayarBPJS.fieldNoBPJSKosong();
    }

    @Then("^informasi tagihan BPJS Kesehatan yang harus dibayar tidak akan muncul \\(BPJS CC\\)$")
    public void informasi_tagihan_BPJS_Kesehatan_yang_harus_dibayar_tidak_akan_muncul_BPJS_CC() throws Throwable {
        bayarBPJS.statusTagihanTidakMuncul();
    }

    @Then("^tombol Bayar Tagihan untuk melanjutkan pembayaran BPJS tidak muncul \\(BPJS CC\\)$")
    public void tombol_Bayar_Tagihan_untuk_melanjutkan_pembayaran_BPJS_tidak_muncul_BPJS_CC() throws Throwable {
        bayarBPJS.buttonBayarTidakMuncul();
    }

    //--------------------------------------------------SCENARIO 3------------------------------------------------------

    @When("^memasukan \"([^\"]*)\" yang salah saat memasukan credit card \\(BPJS CC\\)$")
    public void memasukan_yang_salah_saat_memasukan_credit_card_BPJS_CC(String detail) throws Throwable {
        bayarBPJS.isiCreditCardInvalid(detail);
    }

    @Then("^transaksi tidak bisa dilanjutkan karena error \\(BPJS CC\\)$")
    public void transaksi_tidak_bisa_dilanjutkan_karena_error_BPJS_CC() throws Throwable {

    }

    //--------------------------------------------------SCENARIO 4------------------------------------------------------

    @When("^user memasukkan no BPJS Kesehatan yang tidak valid untuk dibayar \\(BPJS CC\\)$")
    public void user_memasukkan_no_BPJS_Kesehatan_yang_tidak_valid_untuk_dibayar_BPJS_CC() throws Throwable {
        bayarBPJS.isiNoBPJS(InputSepulsa.bpjsFail);
    }

    @Then("^layar akan menunjukkan bahwa nomor BPJS tidak terdaftar dan tidak dapat dibayar \\(BPJS CC\\)$")
    public void layar_akan_menunjukkan_bahwa_nomor_BPJS_tidak_terdaftar_dan_tidak_dapat_dibayar_BPJS_CC() throws Throwable {
        bayarBPJS.nomorBPJSSalah();
    }

    //--------------------------------------------------SCENARIO 5------------------------------------------------------

    @When("^user memasukkan no BPJS Kesehatan yang sudah dibayar untuk dibayar \\(BPJS CC\\)$")
    public void user_memasukkan_no_BPJS_Kesehatan_yang_sudah_dibayar_untuk_dibayar_BPJS_CC() throws Throwable {
        bayarBPJS.isiNoBPJS(InputSepulsa.bpjsOK);
    }

    @Then("^layar akan menunjukkan bahwa tagihan BPJS sudah terbayar sehingga tidak dapat dibayar \\(BPJS CC\\)$")
    public void layar_akan_menunjukkan_bahwa_tagihan_BPJS_sudah_terbayar_sehingga_tidak_dapat_dibayar_BPJS_CC() throws Throwable {
        bayarBPJS.nomorSudahDibayar();
    }

    //--------------------------------------------------SCENARIO 6------------------------------------------------------

    @When("^user memasukkan no BPJS Kesehatan yang digitnya kurang untuk dibayar \\(BPJS CC\\)$")
    public void user_memasukkan_no_BPJS_Kesehatan_yang_digitnya_kurang_untuk_dibayar_BPJS_CC() throws Throwable {
        bayarBPJS.isiNoBPJS(InputSepulsa.bpjsShort);
    }

    @Then("^layar akan menunjukkan bahwa nomor BPJS salah dan tidak dapat dibayar \\(BPJS CC\\)$")
    public void layar_akan_menunjukkan_bahwa_nomor_BPJS_salah_dan_tidak_dapat_dibayar_BPJS_CC() throws Throwable {
        bayarBPJS.nomorBPJSSalah();
    }

}
